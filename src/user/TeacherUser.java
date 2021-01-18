package user;

import menu.AllStudentSwitch;
import view.TeacherViewInfor;

import java.util.Scanner;

public class TeacherUser implements IDisplayUser {
    Scanner scanner = new Scanner(System.in);

    public void displayUser() {
        AllStudentSwitch studentListSwitch = new AllStudentSwitch();
        TeacherViewInfor teacherViewInfor = new TeacherViewInfor();

        System.out.println("----------------------------------------------------");
        System.out.println("----|              TEACHER LOGIN               |----");
        byte choice;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("1. Quản lý học sinh                                |");
            System.out.println("2. Thông tin giáo viên                             |");
            System.out.println("0. Trở về                                          |");
            System.out.println("----------------------------------------------------");
            System.out.print("Choice number: ");
            choice = scanner.nextByte();
            System.out.println(".............");
            switch (choice) {
                case 1:
                    //Quản lý sinh viên
                    studentListSwitch.listManagement();
                    break;
                case 2:
                    //Thông tin giáo viên
                    teacherViewInfor.viewInformation();
                    break;
            }
        } while (choice != 0);
        System.out.println("----------");
    }

}
