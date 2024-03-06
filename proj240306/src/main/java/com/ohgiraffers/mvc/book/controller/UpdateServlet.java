package com.ohgiraffers.mvc.book.controller;

import com.ohgiraffers.mvc.book.model.dto.BookDTO;
import com.ohgiraffers.mvc.book.model.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/book/update")
public class UpdateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String bookCode = req.getParameter("bookCode");

        String bookName = req.getParameter("bookName");
        String publisher = req.getParameter("publisher");
        String releaseDate = req.getParameter("releaseDate");
        int amount = Integer.parseInt(req.getParameter("amount"));
        int categoryCode = Integer.parseInt(req.getParameter("categoryCode"));
        String loanableYN =  req.getParameter("loanableYN");

        BookDTO book = new BookDTO();
        book.setBookCode(Integer.parseInt(bookCode));
        book.setBookName(bookName);
        book.setPublisher(publisher);
        book.setReleaseDate(releaseDate);
        book.setAmount(amount);
        book.setCategoryCode(categoryCode);
        book.setLoanableYN(loanableYN);

        BookService bookService = new BookService();
        int result = bookService.update(book);

        if (result > 0) {
            resp.sendRedirect(req.getContextPath() + "/book/select?bookCode=" + bookCode);
        } else {
            req.setAttribute("message", "정보 수정에 실패했습니다.");
            req.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(req, resp);
        }

    }
}
