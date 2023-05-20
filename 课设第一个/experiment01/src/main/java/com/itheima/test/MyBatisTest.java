package com.itheima.test;

import com.itheima.pojo.Course;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MyBatisTest {
//    FindById();
    @Test
    public void findByIdTest() {
        // 通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        Course course =
                session.selectOne("CourseMapper.findById", 2);
        System.out.println(course.toString());
        session.commit();
        // 关闭SqlSession
        session.close();
    }
    @Test
    public void findCourseTest() {
        // 获取SqlSession
        SqlSession session = MyBatisUtils.getSession();
        // 创建List集合，封装查询id
        List<Integer> ids = new ArrayList<Integer>();
        // 将小于5的id值放入list中
        for (int i = 1; i < 5; i++) {
            ids.add(i);
        }
        // 执行SqlSession的查询方法，返回结果集
        List<Course> courses = session.selectList("CourseMapper.findCourse", ids);
        // 输出查询结果信息
        for (Course course : courses) {
            // 打印输出结果
            System.out.println(course);
        }
        // 关闭SqlSession
        session.close();
    }
    @Test
    public void updateCourseTest() {
        // 通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        Course course = new Course();

        course.setId(4);
        course.setHours(40);


        int result =session.update("CourseMapper.updateCourseHours",
                        course);
        if (result > 0) {
            System.out.println("成功更新" + result + "条数据");
        } else {
            System.out.println("更新数据失败");
        }

        System.out.println(course.toString());
        session.commit();
        // 关闭SqlSession
        session.close();
    }
    @Test
    public void insertCourseTest() {
        // 通过工具类生成SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        Course course = new Course();
        course.setId(5);
        course.setName("大数据存储");
        course.setSchool(1);
        course.setHours(32);
        int result =
                session.insert("CourseMapper.addCourse", course);
        if (result > 0) {
            System.out.println("成功插入" + result + "条数据");
        } else {
            System.out.println("插入数据失败");
        }
        System.out.println(course.toString());
        session.commit();
        // 关闭SqlSession
        session.close();
    }
    @Test
    public void finAllCourse(){
        SqlSession session = MyBatisUtils.getSession();
        List<Integer> ids = new ArrayList<Integer>();
        // 将小于5的id值放入list中
        for (int i = 1; i < 6; i++) {
            ids.add(i);
        }
        List<Course> courses = session.selectList("CourseMapper.findAllCourse", ids);
        // 输出查询结果信息
        for (Course course : courses) {
            // 打印输出结果
            System.out.println(course);
        }
        // 关闭SqlSession
        session.close();
    }
}
