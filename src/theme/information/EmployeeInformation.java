package theme.information;

import service.EmployeeService;

import java.util.Scanner;

public class EmployeeInformation implements IInformationSwtich {
    Scanner scanner = new Scanner(System.in);

    public void informationSwitch() {
        EmployeeService employeeService = new EmployeeService();
        byte numberCase;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("----{           Thông tin Nhân Viên            }----");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Hiển thị toàn bộ nhân viên                      |");
            System.out.println("2. Tìm kiếm nhân viên                              |");
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
                    //Display all
                    employeeService.displayAll();
                    break;
                case 2:
                    //Tìm kiếm
                    employeeService.searchPerson();
                    break;
                case 9:
                    //Đọc
                    employeeService.readFilePerson();
                    break;
                case 10:
                    //Ghi
                    employeeService.writeFilePerson();
                    break;
            }
        } while (numberCase != 0);
        System.out.println("----------");
    }

}
