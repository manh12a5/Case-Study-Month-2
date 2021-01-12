import service.ManagerListSwitch;
import service.student.ManagerStudent;
import service.teacher.ManagerTeacher;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();
        ManagerTeacher managerTeacher = new ManagerTeacher();
        ManagerListSwitch managerListSwitch = new ManagerListSwitch();

        System.out.println("---- QUẢN LÝ NHÀ TRƯỜNG ----");
        byte choice;
        do {
            managerListSwitch.listChoice();
            choice = scanner.nextByte();
            switch (choice) {
                case 1:
                    //Quản lý sinh viên
                    byte numberCase1;
                    do {
                        managerListSwitch.listStudent();
                        numberCase1 = scanner.nextByte();
                        switch (numberCase1) {
                            case 1:
                                //Thêm
                                managerStudent.addNewStudent();
                                break;
                            case 2:
                                //Sửa
                                managerStudent.editStudent();
                                break;
                            case 3:
                                //Xóa
                                managerStudent.removeStudent();
                                break;
                            case 4:
                               //Hiển thị toàn bộ
                                managerStudent.displayAll();
                                break;
                            case 5:
                                //Tìm kiếm
                                managerStudent.searchStudent();
                                break;
                            case 6:
                                //Sắp xếp theo mã sinh viên
                                managerStudent.sortStudent();
                                break;
                            case 7:
                                //Sắp xếp theo điểm trung bình
                                managerStudent.sortAVGNumber();
                                break;
                            case 8:
                                //Hiển thị nhưng học sinh được học bổng
                                managerStudent.checkScholarship();
                                break;
                            case 9:
                                //Đọc (Open)
                                managerStudent.inputFile();
                                break;
                            case 10:
                                //Ghi (Save)
                                managerStudent.outputFile();
                                break;
                        }
                    } while (numberCase1 != 0);
                    System.out.println("----------");
                    break;
                case 2:
                    //Quản lý giáo viên
                   byte numberCase2;
                   do {
                       managerListSwitch.listTeacher();
                       numberCase2 = scanner.nextByte();
                       switch (numberCase2) {
                           case 1:
                               //Thêm
                               managerTeacher.addNewTeacher();
                               break;
                           case 2:
                               //Sửa
                               managerTeacher.editTeacher();
                               break;
                           case 3:
                               //Xóa
                               managerTeacher.removeTeacher();
                               break;
                           case 4:
                               //Hiển thị toàn bộ
                               managerTeacher.displayAll();
                               break;
                           case 5:
                               //Hiện thị giáo viên lương cao nhất
                               managerTeacher.showTeacherHighSalary();
                               break;
                           case 6:
                               //Tìm kiếm
                               managerTeacher.searchTeacher();
                               break;
                           case 7:
                               //Sắp xếp
                               managerTeacher.sortNumberIdTeacher();
                               break;
                           case 8:
                               //Tính tổng tiền
                               managerTeacher.totalSalaryTeacher();
                               break;
                           case 9:
                               //Đọc
                               managerTeacher.inputFile();
                               break;
                           case 10:
                               //Ghi
                               managerTeacher.outputFile();
                               break;
                       }
                   } while (numberCase2 != 0);
                    System.out.println("----------");
                    break;
            }
        } while (choice != 0);
        System.out.println("----------");
        //Exit
        System.out.println("Thoát chương trình");
    }

}
