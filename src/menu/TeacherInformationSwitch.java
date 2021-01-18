package menu;

import menu.IListSwitch;
import service.TeacherManagement;

import java.util.Scanner;

public class TeacherInformationSwitch implements IListSwitch {
    Scanner scanner = new Scanner(System.in);

    public void listManagement() {
        TeacherManagement teacherManagement = new TeacherManagement();
        byte numberCase;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("----{           Thông tin Giáo Viên            }----");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Hiển thị toàn bộ giáo viên                      |");
            System.out.println("2. Tìm kiếm giáo viên                              |");
            System.out.println("3. Sắp xếp giáo viên theo mã giáo viên             |");
            System.out.println("4. Tổng tiền của một giáo viên                     |");
            System.out.println("                                                   |");
            System.out.println("9. Đọc (Open)                                      |");
            System.out.println("10. Ghi (Save)                                     |");
            System.out.println("0. Trở về                                          |");
            System.out.println("----------------------------------------------------");
            System.out.print("Choice number: ");
            numberCase = scanner.nextByte();
            System.out.println(".............");
            switch (numberCase) {
                case 1:
                    //Hiển thị toàn bộ
                    teacherManagement.displayAll();
                    break;
                case 2:
                    //Tìm kiếm
                    teacherManagement.searchPerson();
                    break;
                case 3:
                    //Sắp xếp
                    teacherManagement.sortNumberID();
                    break;
                case 4:
                    //Tính tổng tiền
                    teacherManagement.totalSalaryTeacher();
                    break;
                case 9:
                    //Đọc
                    teacherManagement.readFilePerson();
                    break;
                case 10:
                    //Ghi
                    teacherManagement.writeFilePerson();
                    break;
            }
        } while (numberCase != 0);
        System.out.println("----------");
    }


}
