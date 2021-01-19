package theme.information;

import service.StudentService;

import java.util.Scanner;

public class StudentInformation implements IInformationSwtich {
    Scanner scanner = new Scanner(System.in);

    public void informationSwitch() {
        StudentService studentService = new StudentService();
        byte numberCase;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("----{            Thông tin Học Sinh            }----");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Hiển thị toàn bộ học sinh                       |");
            System.out.println("2. Tìm kiếm học sinh                               |");
            System.out.println("3. Sắp xếp theo mã học sinh                        |");
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
                    studentService.displayAll();
                    break;
                case 2:
                    //Tìm kiếm
                    studentService.searchPerson();
                    break;
                case 3:
                    //Sắp xếp theo mã sinh viên
                    studentService.sortNumberID();
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
