package theme.user;

import theme.manage.EmployeeManage;
import theme.manage.StudentManage;
import theme.manage.TeacherManage;

import java.util.Scanner;

public class Admin implements IUserSwitch {
    Scanner scanner = new Scanner(System.in);

    public void userSwitch() {
        EmployeeManage employeeAdminSwitch = new EmployeeManage();
        StudentManage studentAdminSwitch = new StudentManage();
        TeacherManage teacherAdminSwitch = new TeacherManage();

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
                    studentAdminSwitch.manageSwitch();
                    break;
                case 2:
                    //Quản lý giáo viên
                    teacherAdminSwitch.manageSwitch();
                    break;
                case 3:
                    //Quản lý nhân viên
                    employeeAdminSwitch.manageSwitch();
                    break;
            }
        } while (choice != 0);
    }

}
