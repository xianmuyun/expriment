package com.itheima.mapper;

import com.itheima.pojo.Course;
import com.itheima.pojo.School;

import java.util.List;

public interface CourseMapper {
    Course findCourseById(Integer id);

    Course findCourseByName(String name);

    List<Course> findCourseBySchool(School school);

    int updateCourse(Course course);

    int insertCourse(Course course);

    List<Course> findAllCourse();

    int deleteCourse(int id);
}
