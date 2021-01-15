package transfer;

import service.EmployeeManagement;

import java.util.Scanner;

public class EmployeeListSwitch implements ListSwitch {
    Scanner scanner = new Scanner(System.in);

    public void listManagement() {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        byte numberCase;
        do {
            System.out.println("----------");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Sửa nhân viên");
            System.out.println("3. Xóa nhân viên");
            System.out.println("4. Hiển thị toàn bộ nhân viên");
            System.out.println("5. Tìm kiếm nhân viên");
            System.out.println("6. Hiển thị nhân viên có lương thấp nhất");
            System.out.println("----------");
            System.out.println("9. Đọc (Open)");
            System.out.println("10. Ghi (Save)");
            System.out.println("0. Trở về");
            System.out.print("Choice number: ");
            numberCase = scanner.nextByte();
            switch (numberCase) {
                case 1:
                    //Thêm
                    employeeManagement.addNewPerson();
                    break;
                case 2:
                    //Sửa
                    employeeManagement.editNewPerson();
                    break;
                case 3:
                    //Xóa
                    employeeManagement.removePerson();
                    break;
                case 4:
                    //Display all
                    employeeManagement.displayAll();
                    break;
                case 5:
                    //Tìm kiếm
                    employeeManagement.searchPerson();
                    break;
                case 6:
                    //Min Salary
                    employeeManagement.showEmployeeLowSalary();
                    break;
                case 7:
                    //
                    System.out.println("Đang update");
                    break;
                case 8:
                    //
                    System.out.println("Coming soon");
                    break;
                case 9:
                    //Đọc
                    employeeManagement.readFilePerson();
                    break;
                case 10:
                    //Ghi
                    employeeManagement.writeFilePerson();
                    break;
            }
        } while (numberCase != 0);
        System.out.println("----------");
    }

}
