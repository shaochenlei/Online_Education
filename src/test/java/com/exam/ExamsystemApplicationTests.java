package com.exam;

import com.exam.entity.Student;
import com.exam.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.Pageable;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamsystemApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void contextLoads() {
    }
//查询学生
    @Test
    public void findstudent(){
    List<Student> students = studentMapper.selectList(null);
    for(int i=0;i>students.size();i++){
        System.out.println(students.get(i));
    }
    }

}

