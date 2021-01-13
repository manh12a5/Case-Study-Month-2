package service;

import model.Employee;
import storage.EmployeeReadAndWrite;

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
    public void editEmpolyee() {
        Employee employee = new Employee();
        System.out.println("Nhập mã nhân viên cần sửa: ");
        String editNumberID = scanner.nextLine();
        if (editNumberID.equals(employee.getNumberID())) {
            arrEmployees.replace(editNumberID, employee);
        } else {
            System.out.println("Không có mã nhân viên cần sửa");
        }
    }

    //3. Xóa
    public void removeEmployee() {
        System.out.println("Nhập mã nhân viên cần xóa: ");
        String removeNumberID = scanner.nextLine();
        arrEmployees.remove(removeNumberID);
    }

    //4. Hiển thị toàn bộ
    public void displayAll() {
        System.out.println(arrEmployees.values().iterator());
    }

    //5. Tìm kiếm theo mã nhân viên
    public void searchEmployee() {
        System.out.println("Nhập mã nhân viên cần tìm: ");
        String searchNumberID = scanner.nextLine();
        System.out.println(arrEmployees.get(searchNumberID));
    }

    //6. Hiển thị nhân viên có lương thấp nhất

    //7.

    //8.

    //9. Đọc
    public void inputEmployee() {
        EmployeeReadAndWrite employeeReadAndWrite = new EmployeeReadAndWrite();
        employeeReadAndWrite.readFileEmployee(arrEmployees);
        displayAll();
    }

    //10. Ghi
    public void outputEmployee() {
        EmployeeReadAndWrite employeeReadAndWrite = new EmployeeReadAndWrite();
        employeeReadAndWrite.writeFileEmployee(arrEmployees);
        System.out.println("Done");
    }

}
