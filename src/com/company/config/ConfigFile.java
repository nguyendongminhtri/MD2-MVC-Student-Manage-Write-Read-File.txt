package com.company.config;

import com.company.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConfigFile {
    public void writeToFile(String path, List<Student> students) { //ghi ra thi phai dung Out --> FileOutputStream
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public List<Student> readDataFromFile(String path) { //Read la input File vao moi doc duoc --> FileInputStream
        List<Student> studentList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            studentList = (List<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception e) {
            e.getMessage();
        }
        return studentList;
    }
}
