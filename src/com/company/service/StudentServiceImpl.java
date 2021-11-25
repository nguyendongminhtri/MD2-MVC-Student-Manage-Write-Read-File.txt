package com.company.service;

import com.company.config.ConfigFile;
import com.company.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements IStudentService {

    ConfigFile configFile = new ConfigFile();
    public  List<Student> studentList =  configFile.readDataFromFile("E:\\CODEGYM\\C0921K1\\untitled8\\src\\com\\company\\database\\student.txt");
    @Override
    public List<Student> findAll() {
        configFile.writeToFile("E:\\CODEGYM\\C0921K1\\untitled8\\src\\com\\company\\database\\student.txt", studentList);
        return studentList;
    }

    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public void deleteById(int id) {
        for(int i=0; i<studentList.size();i++){
            if(id==studentList.get(i).getId()){
                studentList.remove(i);
            }
        }
    }
}
