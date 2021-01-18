package account.user;

import account.manage.StudentManage;
import account.view.TeacherView;

import java.util.Scanner;

public class TeacherUser implements IUserSwitch {
    Scanner scanner = new Scanner(System.in);

    public void userSwitch() {
        StudentManage studentList = new StudentManage();
        TeacherView teacherView = new TeacherView();

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
                    studentList.manageSwitch();
                    break;
                case 2:
                    //Thông tin giáo viên
                    teacherView.viewSwitch();
                    break;
            }
        } while (choice != 0);
        System.out.println("----------");
    }

}
