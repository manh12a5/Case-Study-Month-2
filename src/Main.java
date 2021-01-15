import transfer.EmployeeListSwitch;
import transfer.StudentListSwitch;
import transfer.TeacherListSwitch;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EmployeeListSwitch employeeListSwitch = new EmployeeListSwitch();
        StudentListSwitch studentListSwitch = new StudentListSwitch();
        TeacherListSwitch teacherListSwitch = new TeacherListSwitch();

        System.out.println("---- QUẢN LÝ NHÀ TRƯỜNG ----");
        byte choice;
        do {
            System.out.println("1. Thông tin sinh viên");
            System.out.println("2. Thông tin giáo viên");
            System.out.println("3. Thông tin nhân viên");
            System.out.println("0. Exit");
            System.out.print("Choice number: ");
            choice = scanner.nextByte();
            switch (choice) {
                case 1:
                    //Quản lý sinh viên
                    studentListSwitch.listManagement();
                    break;
                case 2:
                    //Quản lý giáo viên
                    teacherListSwitch.listManagement();
                    break;
                case 3:
                    //Quản lý nhân viên
                    employeeListSwitch.listManagement();
                    break;
            }
        } while (choice != 0);
        System.out.println("----------");
        //Exit
        System.out.println("Thoát chương trình");
    }

}
