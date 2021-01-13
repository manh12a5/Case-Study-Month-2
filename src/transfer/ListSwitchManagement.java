package transfer;

import service.EmployeeManagement;
import service.StudentManagement;
import service.TeacherManagement;

import java.util.Scanner;

public class ListSwitchManagement {
    Scanner scanner = new Scanner(System.in);

    //Danh sách phương thức

    //Quản lý sinh viên
    public void listStudent() {
        StudentManagement studentManagement = new StudentManagement();
        byte numberCase;
        do {
            System.out.println("----------");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị toàn bộ sinh viên");
            System.out.println("5. Tìm kiếm sinh viên");
            System.out.println("6. Sắp xếp theo mã sinh viên");
            System.out.println("7. Sắp xếp theo điểm trung bình");
            System.out.println("8. Hiển thị nhưng học sinh được học bổng");
            System.out.println("9. Đọc (Open)");
            System.out.println("10. Ghi (Save)");
            System.out.println("0. Trở về");
            System.out.print("Choice number: ");
            numberCase = scanner.nextByte();
            switch (numberCase) {
                case 1:
                    //Thêm
                    studentManagement.addNewStudent();
                    break;
                case 2:
                    //Sửa
                    studentManagement.editStudent();
                    break;
                case 3:
                    //Xóa
                    studentManagement.removeStudent();
                    break;
                case 4:
                    //Hiển thị toàn bộ
                    studentManagement.displayAll();
                    break;
                case 5:
                    //Tìm kiếm
                    studentManagement.searchStudent();
                    break;
                case 6:
                    //Sắp xếp theo mã sinh viên
                    studentManagement.sortStudent();
                    break;
                case 7:
                    //Sắp xếp theo điểm trung bình
                    studentManagement.sortAVGNumber();
                    break;
                case 8:
                    //Hiển thị nhưng học sinh được học bổng
                    studentManagement.checkScholarship();
                    break;
                case 9:
                    //Đọc (Open)
                    studentManagement.inputFile();
                    break;
                case 10:
                    //Ghi (Save)
                    studentManagement.outputFile();
                    break;
            }
        } while (numberCase != 0);
        System.out.println("----------");
    }

    public void listTeacher() {
        TeacherManagement teacherManagement = new TeacherManagement();
        byte numberCase;
        do {
            System.out.println("----------");
            System.out.println("1. Thêm giáo viên");
            System.out.println("2. Sửa giáo viên");
            System.out.println("3. Xóa giáo viên");
            System.out.println("4. Hiển thị toàn bộ giáo viên");
            System.out.println("5. Hiển thị giáo viên lương cao nhất");
            System.out.println("6. Tìm kiếm giáo viên");
            System.out.println("7. Sắp xếp giáo viên theo mã giáo viên");
            System.out.println("8. Tổng tiền của một giáo viên");
            System.out.println("9. Đọc (Open)");
            System.out.println("10. Ghi (Save)");
            System.out.println("0. Trở về");
            System.out.print("Choice number: ");
            numberCase = scanner.nextByte();
            switch (numberCase) {
                case 1:
                    //Thêm
                    teacherManagement.addNewTeacher();
                    break;
                case 2:
                    //Sửa
                    teacherManagement.editTeacher();
                    break;
                case 3:
                    //Xóa
                    teacherManagement.removeTeacher();
                    break;
                case 4:
                    //Hiển thị toàn bộ
                    teacherManagement.displayAll();
                    break;
                case 5:
                    //Hiện thị giáo viên lương cao nhất
                    teacherManagement.showTeacherHighSalary();
                    break;
                case 6:
                    //Tìm kiếm
                    teacherManagement.searchTeacher();
                    break;
                case 7:
                    //Sắp xếp
                    teacherManagement.sortNumberIdTeacher();
                    break;
                case 8:
                    //Tính tổng tiền
                    teacherManagement.totalSalaryTeacher();
                    break;
                case 9:
                    //Đọc
                    teacherManagement.inputFile();
                    break;
                case 10:
                    //Ghi
                    teacherManagement.outputFile();
                    break;
            }
        } while (numberCase != 0);
        System.out.println("----------");
    }

    public void listEmployee() {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        byte numberCase;
        do {
            System.out.println("----------");
            System.out.println("1. Thêm giáo viên");
            System.out.println("2. Sửa giáo viên");
            System.out.println("3. Xóa giáo viên");
            System.out.println("4. Hiển thị toàn bộ giáo viên");
            System.out.println("5. Hiển thị giáo viên lương cao nhất");
            System.out.println("6. Tìm kiếm giáo viên");
            System.out.println("7. Sắp xếp giáo viên theo mã giáo viên");
            System.out.println("8. Tổng tiền của một giáo viên");
            System.out.println("9. Đọc (Open)");
            System.out.println("10. Ghi (Save)");
            System.out.println("0. Trở về");
            System.out.print("Choice number: ");
            numberCase = scanner.nextByte();
            switch (numberCase) {
                case 1:
                    //Thêm
                    break;
                case 2:
                    //Sửa
                    break;
                case 3:
                    //Xóa
                    break;
                case 9:
                    //Đọc
                    break;
                case 10:
                    //Ghi
                    break;
            }
        } while (numberCase != 0);
        System.out.println("----------");
    }

}
