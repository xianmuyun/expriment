package com.itheima.controller;

import com.itheima.pojo.Course;
import com.itheima.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("/showAllCourses")
    public String showAllCourses(HttpServletRequest request) {
        List<Course> courses = courseService.findAllCourse();
        request.setAttribute("courses", courses);
        return "course";
    }

    @RequestMapping("/toAddCourse")
    public String toAddCourse() {
        return "addCourse";
    }

    @RequestMapping("/addCourse")
    public String addCourse(Course course){
        Course exist = courseService.findCourse(course.getName());
        if (exist == null) {
            courseService.insertCourse(course);
        }
        return "redirect:/showAllCourses";
    }

    @RequestMapping("/toUpdateCourse")
    public String toUpdateCourse(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        Course course = courseService.findCourse(id);
        request.setAttribute("course", course);
        return "updateCourse";
    }

    @RequestMapping("/updateCourse")
    public String updateCourse(Course course) {
        Course before = courseService.findCourse(course.getId());
        if (before.getName().equals(course.getName())) {
            courseService.updateCourse(course);
        } else {
            Course exist = courseService.findCourse(course.getName());
            if (exist == null) {
                courseService.updateCourse(course);
            }
        }
        return "redirect:showAllCourses";
    }

    @RequestMapping("/deleteCourse")
    public String deleteCourse(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        courseService.deleteCourse(id);
        return "redirect:showAllCourses";
    }
}
