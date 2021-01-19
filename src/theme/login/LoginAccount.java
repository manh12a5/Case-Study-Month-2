package theme.login;

import theme.user.Admin;
import theme.user.EmployeeUser;
import theme.user.StudentUser;
import theme.user.TeacherUser;

import java.util.Scanner;

public class LoginAccount {

    public void listLogin() {
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin();
        StudentUser studentUser = new StudentUser();
        TeacherUser teacherUser = new TeacherUser();
        EmployeeUser employeeUser = new EmployeeUser();

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
            case "employee":
                employeeUser.userSwitch();
            default:
                System.out.println("  - Nhập sai tài khoản");
                System.out.println("  - Trở về trang chính");
                break;
        }
    }
}
