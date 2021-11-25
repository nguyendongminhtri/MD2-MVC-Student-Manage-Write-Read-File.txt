package com.company.view;
import java.util.Scanner;
public class Main {
    public Main() {
        Scanner scanner = new Scanner(System.in);
        StudentView studentView = new StudentView();
        System.out.println("-------MENU STUDENT MANAGE---------");
        System.out.println("1.Show List Student:\n " +
                "2.Create Student:\n "+
                "3.Delete Student:\n "
        );
        int chooseMenu = scanner.nextInt();
        switch (chooseMenu) {
            case 1:
                studentView.formShowListStudent();
                break;
            case 2:
                studentView.createStudent();
                break;
            case 3:
                studentView.viewDeleteStudent();
                break;
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}
