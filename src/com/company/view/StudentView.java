package com.company.view;

import com.company.controller.StudentController;
import com.company.model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    Scanner scanner = new Scanner(System.in);
    StudentController studentController = new StudentController();
    List<Student> studentList = studentController.showListStudent();
    public void formShowListStudent(){
        for (Student student: studentList){
            System.out.println(student);
        }
        System.out.println("Enter QUIT to back Menu");
        String quit = scanner.nextLine();
        if(quit.equalsIgnoreCase("quit")){
            new Main();
        }
    }
    public void createStudent(){
        while (true){
            System.out.println("size"+studentList.size());
            int id;
            if(studentList.size()==0){
                id = 1;
            } else {
                 id = studentList.get(studentList.size()-1).getId()+1;
            }
            System.out.println("Enter the name Student: ");
            String name = scanner.nextLine();
            System.out.println("Enter the address: ");
            String address = scanner.nextLine();
            Student student = new Student(id,name,address);
            studentController.createStudent(student);
            System.out.println("Enter any key to continue create - Enter QUIT to back Menu");
            String quit = scanner.next();
            if(quit.equalsIgnoreCase("quit")){
                new Main();
            }
        }

    }
    public void viewDeleteStudent(){
        while (true){
            System.out.println("Enter id to delete: ");
            int id = scanner.nextInt();
            studentController.deleteStudent(id);
            System.out.println("Enter any key to continue delete - Enter QUIT to back Menu");
            String quit = scanner.next();
            if(quit.equalsIgnoreCase("quit")){
                new Main();
            }
        }

    }
}
