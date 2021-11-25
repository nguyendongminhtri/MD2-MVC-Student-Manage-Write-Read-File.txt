package com.company.controller;

import com.company.model.Student;
import com.company.service.StudentServiceImpl;

import java.util.List;

public class StudentController {
    StudentServiceImpl studentService = new StudentServiceImpl();
    public List<Student> showListStudent(){
        return studentService.findAll();
    }
    public void createStudent(Student student){
        studentService.save(student);
        studentService.findAll();
    }
    public void deleteStudent(int id){
        studentService.deleteById(id);
        studentService.findAll();
    }
}
