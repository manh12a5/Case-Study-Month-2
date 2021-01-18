package menu;

import transfer.EmployeeListSwitch;
import transfer.StudentListSwitch;
import transfer.TeacherListSwitch;

import java.util.Scanner;

public class TeacherUser implements IDisPlayUser {
    Scanner scanner = new Scanner(System.in);

    public void displayUser() {
        StudentListSwitch studentListSwitch = new StudentListSwitch();
        TeacherListSwitch teacherListSwitch = new TeacherListSwitch();

        System.out.println("----------------------------------------------------");
        System.out.println("----|              TEACHER LOGIN               |----");
        byte choice;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("1. Quản lý học sinh                                |");
            System.out.println("2. Thông tin giáo viên                             |");
            System.out.println("0. Exit                                            |");
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
                    teacherListSwitch.listManagement();
                    break;
            }
        } while (choice != 0);
        System.out.println("----------");
    }

}
