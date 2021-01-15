package transfer;

import service.StudentManagement;

import java.util.Scanner;

public class StudentListSwitch implements ListSwitch {
    Scanner scanner = new Scanner(System.in);

    public void listManagement() {
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
                    studentManagement.addPerson();
                    break;
                case 2:
                    //Sửa
                    studentManagement.editPerson();
                    break;
                case 3:
                    //Xóa
                    studentManagement.removePerson();
                    break;
                case 4:
                    //Hiển thị toàn bộ
                    studentManagement.displayAll();
                    break;
                case 5:
                    //Tìm kiếm
                    studentManagement.searchPerson();
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
                    studentManagement.readFilePerson();
                    break;
                case 10:
                    //Ghi (Save)
                    studentManagement.writeFilePerson();
                    break;
            }
        } while (numberCase != 0);
        System.out.println("----------");
    }

}
