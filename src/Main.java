import transfer.ListSwitchManagement;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ListSwitchManagement managerListSwitch = new ListSwitchManagement();

        System.out.println("---- QUẢN LÝ NHÀ TRƯỜNG ----");
        byte choice;
        do {
            System.out.println("1. Thông tin sinh viên");
            System.out.println("2. Thông tin giáo viên");
            System.out.println("3. Quản lý nhân viên");
            System.out.println("0. Exit");
            System.out.print("Choice number: ");
            choice = scanner.nextByte();
            switch (choice) {
                case 1:
                    //Quản lý sinh viên
                    managerListSwitch.listStudent();
                    break;
                case 2:
                    //Quản lý giáo viên
                    managerListSwitch.listTeacher();
                    break;
                case 3:
                    //Quản lý nhân viên
                    managerListSwitch.listEmployee();
                    break;
            }
        } while (choice != 0);
        System.out.println("----------");
        //Exit
        System.out.println("Thoát chương trình");
    }

}
