package com.ohgiraffers.mvc.book.model.service;

import com.ohgiraffers.mvc.book.model.dao.BookMapper;
import com.ohgiraffers.mvc.book.model.dto.BookDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.mvc.common.mybatis.Template.getSqlSession;

public class BookService {

    private BookMapper bookMapper;

    public List<BookDTO> selectAllBooks() {
        SqlSession sqlSession = getSqlSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);
        List<BookDTO> bookList = bookMapper.selectAllBooks();
        sqlSession.close();
        return bookList;
    }

    public BookDTO selectOne(String bookCode) {
        SqlSession sqlSession = getSqlSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);
        int temp = Integer.parseInt(bookCode);
        BookDTO selectedBook = bookMapper.selectOne(temp);
        System.out.println("서비스" + selectedBook);
        sqlSession.commit();
        sqlSession.close();
        return selectedBook;
    }

    public int insert(BookDTO book) {
        SqlSession sqlSession = getSqlSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);
        int result = bookMapper.insert(book);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result;
    }

    public int update(BookDTO book) {
        SqlSession sqlSession = getSqlSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);
        int result = bookMapper.update(book);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result;
    }

    public int delete(String bookCode) {
        SqlSession sqlSession = getSqlSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);
        int result = bookMapper.delete(bookCode);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result;
    }
}
