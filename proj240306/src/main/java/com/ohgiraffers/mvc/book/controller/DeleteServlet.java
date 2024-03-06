package com.ohgiraffers.mvc.book.controller;

import com.ohgiraffers.mvc.book.model.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/book/delete")
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String bookCode = req.getParameter("bookCode");

        BookService bookService = new BookService();
        int result = bookService.delete(bookCode);

        if (result > 0) {
            resp.sendRedirect(req.getContextPath() + "/book/list");
        } else {
            req.setAttribute("message", "삭제에 실패했습니다.");
            req.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(req, resp);
        }
    }
}
