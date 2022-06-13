package com.keshe.pojo;

public class Book {

    private String Bname;

    private Integer Bnum;

    private Boolean Bzt;

    public Book(String bname, Integer bnum, Boolean bzt) {
        Bname = bname;
        Bnum = bnum;
        Bzt = bzt;
    }

    public Book() {
    }

    public String getBname() {
        return Bname;
    }

    public void setBname(String bname) {
        Bname = bname;
    }

    public Integer getBnum() {
        return Bnum;
    }

    public void setBnum(Integer bnum) {
        Bnum = bnum;
    }

    public Boolean getBzt() {
        return Bzt;
    }

    public void setBzt(boolean bzt) {
        Bzt = bzt;
    }

    @Override
    public String toString() {
        return "book{" +
                "Bname='" + Bname + '\'' +
                ", Bnum=" + Bnum +
                ", Bzt=" + Bzt +
                '}';
    }
}
