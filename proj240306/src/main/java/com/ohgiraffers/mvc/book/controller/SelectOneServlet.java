package com.ohgiraffers.mvc.book.controller;

import com.ohgiraffers.mvc.book.model.dto.BookDTO;
import com.ohgiraffers.mvc.book.model.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/book/select")
public class SelectOneServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bookCode = req.getParameter("bookCode");
        BookService bookService = new BookService();
        BookDTO selectedBook = bookService.selectOne(bookCode);

        String path = "";
        if (selectedBook != null) {
            path = "/WEB-INF/views/book/showInfo.jsp";
            req.setAttribute("selectedBook", selectedBook);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message", "도서를 찾을 수 없습니다.");
        }

        req.getRequestDispatcher(path).forward(req, resp);
    }
}
