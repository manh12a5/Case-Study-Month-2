package storage;

import model.Employee;

import java.io.*;
import java.util.Map;
import java.util.Scanner;

public class EmployeeReadAndWrite {
    Scanner scanner = new Scanner(System.in);

    public void readFileEmployee(Map<String, Employee> arrEmployees) {
        System.out.println("Nhập tên file muốn mở: ");
        String fileName = scanner.nextLine();

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);
            Map<String, Employee> array = (Map<String, Employee>) objectInputStream.readObject();
            arrEmployees.putAll(array);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e);
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e);
            }
        }
    }

    public void writeFileEmployee(Map<String, Employee> arrEmployees) {
        System.out.println("Nhập tên file muôn lưu: ");
        String fileName = scanner.nextLine();

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrEmployees);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e);
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e);
            }
        }
    }

}
