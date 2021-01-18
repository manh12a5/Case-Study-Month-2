package user;

import view.StudentViewInfor;

import java.util.Scanner;

public class StudentUser implements IDisplayUser {
    Scanner scanner = new Scanner(System.in);

    public void displayUser() {
        StudentViewInfor studentViewInfor = new StudentViewInfor();

        System.out.println("----------------------------------------------------");
        System.out.println("----|              STUDENT LOGIN               |----");
        byte choice;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("1. Thông tin học sinh                              |");
            System.out.println("0. Trở về                                          |");
            System.out.println("----------------------------------------------------");
            System.out.print("Choice number: ");
            choice = scanner.nextByte();
            System.out.println(".............");
            switch (choice) {
                case 1:
                    //Thông tin sinh viên
                    studentViewInfor.viewInformation();
                    break;
            }
        } while (choice != 0);
        System.out.println("----------");
    }

}
