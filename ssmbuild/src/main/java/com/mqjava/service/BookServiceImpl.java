package com.mqjava.service;

import com.mqjava.dao.BookMapper;
import com.mqjava.pojo.Books;

import java.util.List;

/**
 * @author 辰非尘
 * @date 2022/6/27
 */
public class BookServiceImpl implements BookService{
    //service 层调 dao层，组合 Dao
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int bookID) {
        return bookMapper.deleteBookById(bookID);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int bookID) {
        return bookMapper.queryBookById(bookID);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public Books queryBookByName(String bookName) {
        System.out.println("BookServiceImpl.bookName => " + bookName);
        return bookMapper.queryBookByName(bookName);
    }


}
