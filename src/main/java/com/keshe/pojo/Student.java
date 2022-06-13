package com.keshe.pojo;

public class Student {
    private String Sname;

    private Integer Snum;

    private Integer Bnum;

    private Integer Pwd;

    public Student(String sname, Integer snum, Integer bnum, Integer pwd) {
        Sname = sname;
        Snum = snum;
        Bnum = bnum;
        Pwd = pwd;
    }

    public Student() {

    }

    public Integer getPwd() {
        return Pwd;
    }

    public void setPwd(Integer pwd) {
        Pwd = pwd;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public Integer getSnum() {
        return Snum;
    }

    public void setSnum(Integer snum) {
        Snum = snum;
    }

    public Integer getBnum() {
        return Bnum;
    }

    public void setBnum(Integer bnum) {
        Bnum = bnum;
    }

    @Override
    public String toString() {
        return "student{" +
                "Sname='" + Sname + '\'' +
                ", Snum=" + Snum +
                ", Bnum=" + Bnum +
                ", Pwd=" + Pwd +
                '}';
    }
}
