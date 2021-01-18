import menu.LogicUser;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        LogicUser logicUser = new LogicUser();

        byte choice;
        do {
            System.out.println("--------------------------------------");
            System.out.println("|---{     QUẢN LÝ NHÀ TRƯỜNG     }---|");
            System.out.println("|                [*]                 |");
            System.out.println("|----------                ----------|");
            System.out.println("|  1. LOGIN                          |");
            System.out.println("|  0. EXIT                           |");
            System.out.println("\\____________________________________/");
            System.out.print("Choice number: ");
            choice = scanner.nextByte();
            System.out.println(".............");
            switch (choice) {
                case 1:
                    logicUser.displayUser();
                    break;
            }
        } while (choice != 0);
        System.out.println("----------");
        //Exit
        System.out.println("Thoát chương trình");
    }

}
