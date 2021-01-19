package theme.user;

import theme.information.EmployeeInformation;

import java.util.Scanner;

public class EmployeeUser implements IUserSwitch {

    Scanner scanner = new Scanner(System.in);

    public void userSwitch() {
        EmployeeInformation employeeInformation = new EmployeeInformation();

        byte choice;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("----|              EMPLOYEE LOGIN              |----");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Thông tin nhân viên                             |");
            System.out.println("0. Trở về                                          |");
            System.out.println("----------------------------------------------------");
            System.out.print("Choice number: ");
            choice = scanner.nextByte();
            System.out.println(".............");
            switch (choice) {
                case 1:
                    //Thông tin nhân viên
                    employeeInformation.informationSwitch();
                    break;
            }
        } while (choice != 0);
        System.out.println("----------");
    }

}
