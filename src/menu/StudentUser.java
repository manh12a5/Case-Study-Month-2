package menu;

import transfer.StudentListSwitch;
import transfer.TeacherListSwitch;

import java.util.Scanner;

public class StudentUser implements IDisPlayUser {
    Scanner scanner = new Scanner(System.in);

    public void displayUser() {
        StudentListSwitch studentListSwitch = new StudentListSwitch();

        System.out.println("----------------------------------------------------");
        System.out.println("----|              STUDENT LOGIN               |----");
        byte choice;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("1. Thông tin học sinh                              |");
            System.out.println("0. Exit                                            |");
            System.out.println("----------------------------------------------------");
            System.out.print("Choice number: ");
            choice = scanner.nextByte();
            System.out.println(".............");
            switch (choice) {
                case 1:
                    //Thông tin sinh viên
                    studentListSwitch.listManagement();
                    break;
            }
        } while (choice != 0);
        System.out.println("----------");
    }

}
