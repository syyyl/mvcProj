package com.ohgiraffers.mvc.book.controller;

import com.ohgiraffers.mvc.book.model.dto.BookDTO;
import com.ohgiraffers.mvc.book.model.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/book/list")
public class SelectAllServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BookService bookService = new BookService();
        List<BookDTO> bookList = bookService.selectAllBooks();

        String path = "";
        if (bookList != null && !bookList.isEmpty()) {
            path = "/WEB-INF/views/book/bookList.jsp";
            req.setAttribute("bookList", bookList);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message", "전체 목록 조회에 실패했습니다.");
        }

        req.getRequestDispatcher(path).forward(req, resp);
    }
}
