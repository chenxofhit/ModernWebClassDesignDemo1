package com.keshe.dao;

import com.keshe.dao.LoginDao;
import com.keshe.mapper.StudentMapper;
import com.keshe.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;

@Repository
public class LoginDaoImpl implements LoginDao {

    @Autowired
    private  StudentMapper studentMapper;

    public StudentMapper getStudentMapper() {
        return studentMapper;
    }

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public Student login(Student student) throws IOException {
//        SqlsessionDao sqlsessionDao=new SqlsessionImpl();
//        StudentMapper studentmapper=sqlsessionDao.sqlsession().getMapper(StudentMapper.class);
        Student stu=studentMapper.selectstudent(student.getSnum());
        if(stu==null){
            return null;
        }
        if(stu.getPwd()!=student.getPwd()){
            return null;
        }
        return stu;
    }
}
