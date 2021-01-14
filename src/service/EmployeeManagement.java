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
        boolean checkID = false;
        System.out.println("Nhập mã nhân viên cần sửa: ");
        String editNumberID = scanner.nextLine();
        for (String key: arrEmployees.keySet()) {
            if (editNumberID.equals(arrEmployees.get(key).getNumberID())) {
                Employee employee = new Employee();
                employee.inputInformation();
                arrEmployees.replace(editNumberID, employee);
                checkID = true;
            }
        }
        if (!checkID) {
            System.out.println("Không có mã nhân viên cần sửa");
        }
    }

    //3. Xóa
    public void removeEmployee() {
        boolean checkID = false;
        System.out.println("Nhập mã nhân viên cần xóa: ");
        String removeNumberID = scanner.nextLine();
        for (String key : arrEmployees.keySet()) {
            if (removeNumberID.equals(arrEmployees.get(key).getNumberID())) {
                arrEmployees.remove(removeNumberID);
                System.out.println("Đã xóa");
                checkID = true;
            }
        }
        if (!checkID) {
            System.out.println("Không có mã nhân viên để xóa");
        }
    }

    //4. Hiển thị toàn bộ
    public void displayAll() {
        for (String key : arrEmployees.keySet()) {
            Employee value = arrEmployees.get(key);
            System.out.println(value);
        }
    }

    //5. Tìm kiếm theo mã nhân viên
    public void searchEmployee() {
        byte count = 0;
        System.out.println("Nhập mã nhân viên cần tìm: ");
        String searchNumberID = scanner.nextLine();
        for (String key : arrEmployees.keySet()) {
            if (searchNumberID.equals(arrEmployees.get(key).getNumberID())) {
                System.out.println(arrEmployees.get(searchNumberID));
                count++;
            }
        }
        if (count == 0) {
            System.err.println("Không tìm thấy mã nhân viên");
        }
    }

    //6. Hiển thị nhân viên có lương thấp nhất
    public double checkMinSalary() {
        double minSalary = 0.0;
        for (String key : arrEmployees.keySet()) {
            minSalary = arrEmployees.get(key).getTotalSalary();
            break;
        }
        for (String key : arrEmployees.keySet()) {
            if (minSalary > arrEmployees.get(key).getTotalSalary()) {
                minSalary = arrEmployees.get(key).getTotalSalary();
            }
        }
        return minSalary;
    }

    public void showEmployeeLowSalary() {
        for (String key : arrEmployees.keySet()) {
            if (checkMinSalary() == arrEmployees.get(key).getTotalSalary()) {
                System.out.println(arrEmployees.get(key));
            }
        }
    }

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
