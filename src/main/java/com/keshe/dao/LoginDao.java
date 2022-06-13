package com.keshe.dao;

import com.keshe.pojo.Student;

import java.io.IOException;

public interface LoginDao {

    public Student login(Student student) throws IOException;

}
