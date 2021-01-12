package storage.student;

import model.Student;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteStudent {

    Scanner scanner = new Scanner(System.in);

    //Danh sách phương thức

    public void readFileStudent(List<Student> arrStudents) {
        System.out.println("Nhập tên file để mở: ");
        String fileName = scanner.nextLine();

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);
            List<Student> arr = (List<Student>) objectInputStream.readObject();
            arrStudents.addAll(arr);
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

    public void writeFileStudent(List<Student> arrStudents) {
        System.out.println("Nhập tên file lưu: ");
        String fileName = scanner.nextLine();

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(arrStudents);
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
