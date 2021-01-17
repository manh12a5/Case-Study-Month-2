package service;

import model.Employee;
import storage.EmployeeReadAndWrite;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManagement implements IManagement {

    Scanner scanner = new Scanner(System.in);
    private Map<String, Employee> arrEmployees = new HashMap<>();

    //Danh sách phương thức

    //1. Thêm
    @Override
    public void addPerson() {
        Employee employee = new Employee();
        employee.inputInformation();
        arrEmployees.put(employee.getNumberID(), employee);
    }

    //2. Sửa
    @Override
    public void editPerson() {
        boolean checkID = false;
        System.out.print("Nhập mã nhân viên cần sửa: ");
        String editNumberID = scanner.nextLine();
        for (String key : arrEmployees.keySet()) {
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
    @Override
    public void removePerson() {
        boolean checkID = false;
        System.out.print("Nhập mã nhân viên cần xóa: ");
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
    @Override
    public void displayAll() {
        int i = 1;
        for (String key : arrEmployees.keySet()) {
            Employee value = arrEmployees.get(key);
            System.out.println("|                      { " + (i++) + " }                       |" + "\n" +
                    value);
        }
    }

    //5. Tìm kiếm theo mã nhân viên
    @Override
    public void searchPerson() {
        byte count = 0;
        System.out.print("Nhập mã nhân viên cần tìm: ");
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

    //7. Kiểm tra tuổi của nhân viên
    public void showAgeEmployee() {
        for (String key : arrEmployees.keySet()) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.now();
            LocalDate birthday = LocalDate.parse(arrEmployees.get(key).getBirthday(), formatter);
            int age = localDate.getYear() - birthday.getYear();
            System.out.println("Tuổi nhân viên '" + arrEmployees.get(key).getName()
                    + "' có mã nhân viên '" + arrEmployees.get(key).getNumberID() + "' là: " + age);
        }
    }

    //8. Tổng tiền phải trả cho toàn bộ nhân viên
    public void totalSalaryAllEmployee() {
        double total = 0.0;
        for (String key : arrEmployees.keySet()) {
            total += arrEmployees.get(key).getTotalSalary();
        }
        System.out.println("Tông tiền phải trả cho nhân viên là: " + total);
    }

    //9. Đọc
    @Override
    public void readFilePerson() {
        EmployeeReadAndWrite employeeReadAndWrite = new EmployeeReadAndWrite();
        employeeReadAndWrite.readFileEmployee(arrEmployees);
        displayAll();
    }

    //10. Ghi
    @Override
    public void writeFilePerson() {
        EmployeeReadAndWrite employeeReadAndWrite = new EmployeeReadAndWrite();
        employeeReadAndWrite.writeFileEmployee(arrEmployees);
        System.out.println("Done");
    }

}
