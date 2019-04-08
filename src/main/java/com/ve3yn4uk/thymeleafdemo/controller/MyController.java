package com.ve3yn4uk.thymeleafdemo.controller;

import com.ve3yn4uk.thymeleafdemo.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 8e3Yn4uK on 08.04.2019
 */

@Controller
@RequestMapping("/students")
public class MyController {

    @GetMapping("/time")
    public String showTime(Model model){

        model.addAttribute("theDate", new java.util.Date());

        return "current-time";
    }

    private List<Student> students;

    @PostConstruct
    private void loadData() {

        Student student1 = new Student(1, "Ivav", "Ivanov", "ivan@gmail.com");
        Student student2 = new Student(2, "Sergey", "Sergeev", "sergey@gmail.com");
        Student student3 = new Student(3, "Sanya", "Aleksandrov", "sanya@gmail.com");

        students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }


    @GetMapping("/list")
    public String getStudents(Model theModel){

        theModel.addAttribute("students", students);

        return "student-list";
    }
}
