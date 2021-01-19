package theme.manage;

import service.StudentService;

import java.util.Scanner;

public class StudentManage implements IManageSwitch {
    Scanner scanner = new Scanner(System.in);

    public void manageSwitch() {
        StudentService studentService = new StudentService();
        byte numberCase;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("----{             Quản Lý Học Sinh             }----");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Thêm học sinh                                   |");
            System.out.println("2. Sửa học sinh                                    |");
            System.out.println("3. Xóa học sinh                                    |");
            System.out.println("4. Hiển thị toàn bộ học sinh                       |");
            System.out.println("5. Tìm kiếm học sinh                               |");
            System.out.println("6. Sắp xếp theo mã học sinh                        |");
            System.out.println("7. Sắp xếp theo điểm trung bình                    |");
            System.out.println("8. Hiển thị nhưng học sinh ĐTB >= 8.0              |");
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
                    studentService.addPerson();
                    break;
                case 2:
                    //Sửa
                    studentService.editPerson();
                    break;
                case 3:
                    //Xóa
                    studentService.removePerson();
                    break;
                case 4:
                    //Hiển thị toàn bộ
                    studentService.displayAll();
                    break;
                case 5:
                    //Tìm kiếm
                    studentService.searchPerson();
                    break;
                case 6:
                    //Sắp xếp theo mã sinh viên
                    studentService.sortNumberID();
                    break;
                case 7:
                    //Sắp xếp theo điểm trung bình
                    studentService.sortAVGNumber();
                    break;
                case 8:
                    //Hiển thị nhưng học sinh được học bổng
                    studentService.showStudentScholarship();
                    break;
                case 9:
                    //Đọc (Open)
                    studentService.readFilePerson();
                    break;
                case 10:
                    //Ghi (Save)
                    studentService.writeFilePerson();
                    break;
            }
        } while (numberCase != 0);
        System.out.println("----------");
    }

}
