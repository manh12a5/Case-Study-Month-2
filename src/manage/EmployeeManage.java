package manage;

import service.EmployeeService;

import java.util.Scanner;

public class EmployeeManage implements IManageSwitch {
    Scanner scanner = new Scanner(System.in);

    public void manageSwitch() {
        EmployeeService employeeService = new EmployeeService();
        byte numberCase;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("----{            Quản Lý Nhân Viên             }----");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Thêm nhân viên                                  |");
            System.out.println("2. Sửa nhân viên                                   |");
            System.out.println("3. Xóa nhân viên                                   |");
            System.out.println("4. Hiển thị toàn bộ nhân viên                      |");
            System.out.println("5. Tìm kiếm nhân viên                              |");
            System.out.println("6. Hiển thị nhân viên có lương thấp nhất           |");
            System.out.println("7. Hiển thị tuổi của nhân viên                     |");
            System.out.println("8. Tổng tiền trả toàn bộ nhân viên trong trường    |");
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
                    employeeService.addPerson();
                    break;
                case 2:
                    //Sửa
                    employeeService.editPerson();
                    break;
                case 3:
                    //Xóa
                    employeeService.removePerson();
                    break;
                case 4:
                    //Display all
                    employeeService.displayAll();
                    break;
                case 5:
                    //Tìm kiếm
                    employeeService.searchPerson();
                    break;
                case 6:
                    //Min Salary
                    employeeService.showEmployeeLowSalary();
                    break;
                case 7:
                    //Kiểm tra tuổi của nhân viên
                    employeeService.showAgeEmployee();
                    break;
                case 8:
                    //Tổng tiền trả toàn bộ nhân viên trong trường
                    employeeService.totalSalaryAllEmployee();
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
