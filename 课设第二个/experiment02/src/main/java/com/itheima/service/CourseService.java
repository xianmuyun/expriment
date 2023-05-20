package com.itheima.service;

import com.itheima.pojo.Course;

import java.util.List;

public interface CourseService {
    public void insertCourse(Course course);
    public void updateCourse(Course course);
    public void deleteCourse(int id);
    public List<Course> findAllCourse();
    public Course findCourse(String name);
    public Course findCourse(int id);
}
