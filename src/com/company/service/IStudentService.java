package com.company.service;

import com.company.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void save(Student student);
    void deleteById(int id);
}
