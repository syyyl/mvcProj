package com.ohgiraffers.mvc.book.model.dao;

import com.ohgiraffers.mvc.book.model.dto.BookDTO;

import java.util.List;

public interface BookMapper {
    List<BookDTO> selectAllBooks();

    BookDTO selectOne(int bookCode);

    int insert(BookDTO book);

    int update(BookDTO book);

    int delete(String bookCode);
}
