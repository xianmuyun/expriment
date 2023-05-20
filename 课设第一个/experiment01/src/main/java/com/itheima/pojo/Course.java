package com.itheima.pojo;

public class Course {
    private int id;
    private String name;
    private int hours;
    private int sid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSchool() {
        return sid;
    }

    public void setSchool(int school) {
        this.sid = school;
    }
    public String toString() {
        return "IClass{" +
                "id=" + id +
                ", classname=" + name +
                ", school=" + sid + ", hours="+hours+'}';
    }

}
