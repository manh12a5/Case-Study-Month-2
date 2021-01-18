import user.Admin;
import user.StudentUser;
import user.TeacherUser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
                    loginUser();
                    break;
            }
        } while (choice != 0);
        //Exit
        System.out.println("Thoát chương trình");
    }

    public static void loginUser() {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin();
        StudentUser studentUser = new StudentUser();
        TeacherUser teacherUser = new TeacherUser();

        String loginUser;
        System.out.print("Nhập tên tài khoản: ");
        loginUser = scanner.nextLine();
        System.out.println(".............");
        switch (loginUser) {
            case "admin":
                admin.displayUser();
                break;
            case "teacher":
                teacherUser.displayUser();
                break;
            case "student":
                studentUser.displayUser();
                break;
            default:
                System.out.println("Nhập sai tài khoản");
                System.out.println("Trở về trang chính");
                break;
        }
    }

}
