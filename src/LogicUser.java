package menu;

import java.util.Scanner;

public class LogicUser implements IDisplayUser {
    Scanner scanner = new Scanner(System.in);

    public void displayUser() {

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
        }
    }

}
