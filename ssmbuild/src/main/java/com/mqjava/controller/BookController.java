package com.mqjava.controller;

import com.mqjava.pojo.Books;
import com.mqjava.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 辰非尘
 * @date 2022/6/28
 */
@Controller
@RequestMapping("/book")
public class BookController {

    //Controller 调 service 层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部的书籍，并且返回一个书籍展示界面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        System.out.println(list);
        return "allBook";
    }

    //跳转到添加书籍界面
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "toAddBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        System.out.println("addBook==>" + books);
        return "redirect:/book/allBook";
    }

    //跳转到修改书籍界面
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("Qbook",books);
        return "toUpdateBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBook =>" + books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //跳转到删除书籍界面
    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        System.out.println("queryBookName => " + queryBookName);
        Books books = bookService.queryBookByName(queryBookName);
        System.out.println("books => " + books);
        List<Books> list = new ArrayList<Books>();
        list.add(books);

        if(books == null){
            list = bookService.queryAllBook();
            model.addAttribute("error","未查到");
        }

        model.addAttribute("list",list);
        return "allBook";
    }
}
