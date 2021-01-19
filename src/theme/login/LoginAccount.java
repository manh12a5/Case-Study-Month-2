package theme.login;

import theme.user.Admin;
import theme.user.EmployeeUser;
import theme.user.StudentUser;
import theme.user.TeacherUser;

import java.util.Scanner;

public class LoginAccount {

    public void listLogin() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        Admin admin = new Admin();
        StudentUser studentUser = new StudentUser();
        TeacherUser teacherUser = new TeacherUser();
        EmployeeUser employeeUser = new EmployeeUser();

        System.out.print("Nhập tên tài khoản: ");
        String loginUser = scanner.nextLine();
        System.out.print("Nhập mật khẩu: ");
        String password = scanner1.nextLine();
        System.out.println(".............");
        if (loginUser.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("Admin")) {
            admin.userSwitch();
        } else if (loginUser.equalsIgnoreCase("Teacher") && password.equalsIgnoreCase("Teacher")) {
            teacherUser.userSwitch();
        } else if (loginUser.equalsIgnoreCase("Student") && password.equalsIgnoreCase("Student")) {
            studentUser.userSwitch();
        } else if (loginUser.equalsIgnoreCase("Employee") && password.equalsIgnoreCase("Employee")) {
            employeeUser.userSwitch();
        } else {
            System.out.println("  - Nhập sai tài khoản");
            System.out.println("  - Trở về trang chính");
        }
    }

}

//        switch (loginUser) {
//            case "admin":
//                admin.userSwitch();
//                break;
//            case "teacher":
//                teacherUser.userSwitch();
//                break;
//            case "student":
//                studentUser.userSwitch();
//                break;
//            case "employee":
//                employeeUser.userSwitch();
//            default:
//                System.out.println("  - Nhập sai tài khoản");
//                System.out.println("  - Trở về trang chính");
//                break;
//        }
//    }
