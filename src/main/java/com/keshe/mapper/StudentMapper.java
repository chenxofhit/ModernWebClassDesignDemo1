package com.keshe.mapper;

import com.keshe.pojo.Student;

public interface StudentMapper {

    /*实现学生信息的输入*/
    int insertstudent(Student student);

    /*查询*/
    Student selectstudent(Integer Snum);

    /*删除*/
    int deletstudent(Integer Bnum);
}
