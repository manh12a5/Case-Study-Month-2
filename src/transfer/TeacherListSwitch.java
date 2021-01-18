package transfer;

import service.TeacherManagement;

import java.util.Scanner;

public class TeacherListSwitch implements IListSwitch {
    Scanner scanner = new Scanner(System.in);

    public void listManagement() {
        TeacherManagement teacherManagement = new TeacherManagement();
        byte numberCase;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("----{            Quản Lý Giáo Viên             }----");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Thêm giáo viên                                  |");
            System.out.println("2. Sửa giáo viên                                   |");
            System.out.println("3. Xóa giáo viên                                   |");
            System.out.println("4. Hiển thị toàn bộ giáo viên                      |");
            System.out.println("5. Hiển thị giáo viên lương cao nhất               |");
            System.out.println("6. Tìm kiếm giáo viên                              |");
            System.out.println("7. Sắp xếp giáo viên theo mã giáo viên             |");
            System.out.println("8. Tổng tiền của một giáo viên                     |");
            System.out.println("9. Đọc (Open)                                      |");
            System.out.println("10. Ghi (Save)                                     |");
            System.out.println("0. Trở về                                          |");
            System.out.println("----------------------------------------------------");
            System.out.print("Choice number: ");
            numberCase = scanner.nextByte();
            System.out.println(".............");
            switch (numberCase) {
                case 1:
                    //Thêm
                    teacherManagement.addPerson();
                    break;
                case 2:
                    //Sửa
                    teacherManagement.editPerson();
                    break;
                case 3:
                    //Xóa
                    teacherManagement.removePerson();
                    break;
                case 4:
                    //Hiển thị toàn bộ
                    teacherManagement.displayAll();
                    break;
                case 5:
                    //Tìm kiếm
                    teacherManagement.searchPerson();
                    break;
                case 6:
                    //Hiển thị giáo viên lương cao nhất
                    teacherManagement.showTeacherHighSalary();
                    break;
                case 7:
                    //Sắp xếp
                    teacherManagement.sortNumberID();
                    break;
                case 8:
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
