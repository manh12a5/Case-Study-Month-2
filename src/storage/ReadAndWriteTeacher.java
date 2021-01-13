package storage;

import model.Teacher;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteTeacher {
    Scanner scanner = new Scanner(System.in);

    public void readFileTeacher(List<Teacher> arrTeacher) {
        System.out.println("Nhập file muốn đọc: ");
        String fileName = scanner.nextLine();

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);
            List<Teacher> arr = (List<Teacher>) objectInputStream.readObject();
            arrTeacher.addAll(arr);
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

    public void writeFileTeacher(List<Teacher> arrTeacher) {
        System.out.println("Nhập tên file lưu: ");
        String fileName = scanner.nextLine();

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrTeacher);
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
