package theme.user;

import theme.information.StudentInformation;

import java.util.Scanner;

public class StudentUser implements IUserSwitch {
    Scanner scanner = new Scanner(System.in);

    public void userSwitch() {
        StudentInformation studentView = new StudentInformation();

        byte choice;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("----|              STUDENT USER                |----");
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
                    studentView.informationSwitch();
                    break;
            }
        } while (choice != 0);
        System.out.println("----------");
    }

}
