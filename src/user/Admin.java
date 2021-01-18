package user;

import menu.AllEmployeeSwitch;
import menu.AllStudentSwitch;
import menu.AllTeacherSwitch;

import java.util.Scanner;

public class Admin implements IDisplayUser {
    Scanner scanner = new Scanner(System.in);

    public void displayUser() {
        AllEmployeeSwitch employeeAdminSwitch = new AllEmployeeSwitch();
        AllStudentSwitch studentAdminSwitch = new AllStudentSwitch();
        AllTeacherSwitch teacherAdminSwitch = new AllTeacherSwitch();

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
