package com.mqjava.dao;

import com.mqjava.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 辰非尘
 * @date 2022/6/26
 */
public interface BookMapper {

    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(@Param("bookID") int bookID);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(@Param("bookID") int bookID);
    //查询全部的书
    List<Books> queryAllBook();

    //根据 name查询书籍
    Books queryBookByName(@Param("bookName") String bookName);
}
