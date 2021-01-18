package account.login;

import account.user.Admin;
import account.user.StudentUser;
import account.user.TeacherUser;

import java.util.Scanner;

public class LoginAccount {

    public void listLogin() {
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
                admin.userSwitch();
                break;
            case "teacher":
                teacherUser.userSwitch();
                break;
            case "student":
                studentUser.userSwitch();
                break;
            default:
                System.out.println("  - Nhập sai tài khoản");
                System.out.println("  - Trở về trang chính");
                break;
        }
    }
}
