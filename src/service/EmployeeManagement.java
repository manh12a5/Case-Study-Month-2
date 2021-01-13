package service;

import model.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManagement {
    Scanner scanner = new Scanner(System.in);
    Map<String, Employee> arrEmployees = new HashMap<>();

    //Danh sách phương thức

    //1. Thêm
    public void addNewEmployee() {
        Employee employee = new Employee();
        employee.inputInformation();
        arrEmployees.put(employee.getNumberID(), employee);
    }

    //2. Sửa

    //3. Xóa

    //4. Hiển thị toàn bộ
    public void displayAll() {
        for (int i = 0; i < arrEmployees.size(); i++) {
            System.out.println(arrEmployees.get(i));
        }
    }

    //5. Tìm kiếm theo mã nhân viên

    //6. Sắp xếp theo mã nhân viên

    //9. Đọc

    //10. Ghi

}
