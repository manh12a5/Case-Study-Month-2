package user;

import menu.EmployeeListSwitch;
import menu.StudentListSwitch;
import menu.TeacherListSwitch;

import java.util.Scanner;

public class Admin implements IDisplayUser {
    Scanner scanner = new Scanner(System.in);

    public void displayUser() {
        EmployeeListSwitch employeeAdminSwitch = new EmployeeListSwitch();
        StudentListSwitch studentAdminSwitch = new StudentListSwitch();
        TeacherListSwitch teacherAdminSwitch = new TeacherListSwitch();

        System.out.println("----------------------------------------------------");
        System.out.println("----|               ADMIN LOGIN                |----");
        byte choice;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("1. Quản lý học sinh                                |");
            System.out.println("2. Quản lý giáo viên                               |");
            System.out.println("3. Quản lý nhân viên                               |");
            System.out.println("0. Trở về                                          |");
            System.out.println("----------------------------------------------------");
            System.out.print("Choice number: ");
            choice = scanner.nextByte();
            System.out.println(".............");
            switch (choice) {
                case 1:
                    //Quản lý sinh viên
                    studentAdminSwitch.listManagement();
                    break;
                case 2:
                    //Quản lý giáo viên
                    teacherAdminSwitch.listManagement();
                    break;
                case 3:
                    //Quản lý nhân viên
                    employeeAdminSwitch.listManagement();
                    break;
            }
        } while (choice != 0);
    }

}
