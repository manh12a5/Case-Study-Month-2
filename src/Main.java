import account.login.LoginAccount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LoginAccount loginAccount = new LoginAccount();

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
                    loginAccount.listLogin();
                    break;
            }
        } while (choice != 0);
        //Exit
        System.out.println("Thoát chương trình");
    }

}
