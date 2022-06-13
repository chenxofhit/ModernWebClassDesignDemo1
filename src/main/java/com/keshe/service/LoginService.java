package com.keshe.service;

import com.keshe.dao.LoginDao;
import com.keshe.pojo.Student;

import java.io.IOException;

public interface LoginService {
    public Student login( Student student) throws IOException;
}
