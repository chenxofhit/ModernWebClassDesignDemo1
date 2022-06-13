package com.keshe.mapper;

import com.keshe.pojo.Book;

import java.util.List;

public interface BookMapper {

    /*实现图书信息的输入*/
    int insertbook(Book book);

    /*查询*/
    List<Book> selectbook(String Bname);

    /*修改*/
    int updatebook(Boolean Bzt, Integer Bnum);
}
