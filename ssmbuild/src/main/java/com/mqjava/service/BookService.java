package com.mqjava.service;

import com.mqjava.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 辰非尘
 * @date 2022/6/27
 */
public interface BookService {

    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(int bookID);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(int bookID);
    //查询全部的书
    List<Books> queryAllBook();
    //根据 name查询书籍
    Books queryBookByName(String bookName);

}
