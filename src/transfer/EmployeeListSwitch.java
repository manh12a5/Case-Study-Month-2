package transfer;

import service.EmployeeManagement;

import java.util.Scanner;

public class EmployeeListSwitch {
    Scanner scanner = new Scanner(System.in);

    public void listEmployee() {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        byte numberCase;
        do {
            System.out.println("----------");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Sửa nhân viên");
            System.out.println("3. Xóa nhân viên");
            System.out.println("4. Hiển thị toàn bộ nhân viên");
            System.out.println("9. Đọc (Open)");
            System.out.println("10. Ghi (Save)");
            System.out.println("0. Trở về");
            System.out.print("Choice number: ");
            numberCase = scanner.nextByte();
            switch (numberCase) {
                case 1:
                    //Thêm
                    employeeManagement.addNewEmployee();
                    break;
                case 2:
                    //Sửa
                    break;
                case 3:
                    //Xóa
                    break;
                case 4:
                    //Display all
                    employeeManagement.displayAll();
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
