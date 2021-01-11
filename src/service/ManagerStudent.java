package service;

import model.Student;
import storage.ReadAndWriteStudent;

import java.util.*;

public class ManagerStudent {

    //Tạo đối tượng
    Scanner scanner = new Scanner(System.in);
    Student student = new Student();
    private List<Student> arrStudents = new LinkedList<>();
    ReadAndWriteStudent readAndWriteStudent = new ReadAndWriteStudent();

    //Danh sách phương thức

    //Thêm
    public void addNewStudent() {
        student.inputInformation();
        arrStudents.add(student);
    }

    //Sửa
    public void editStudent() {
        System.out.println("Nhập mã sinh viên cần sửa: ");
        int editNumberID = scanner.nextInt();
        arrStudents.set(editNumberID, student);
    }

    //Xóa
    public void removeStudent() {
        System.out.println("Nhập mã sinh viên cần xóa: ");
        int removeNumberID = scanner.nextInt();
        for (int i = 0; i < arrStudents.size(); i++) {
            arrStudents.remove(arrStudents.get(i).getNumberID());
            System.out.println("Đã xóa");
        }
    }

    //Hiển thị toàn bộ
    public void displayAll() {
        for (int i = 0; i < arrStudents.size(); i++) {
            System.out.println(arrStudents.get(i));
        }
    }

    //Tìm kiếm
    public void searchStudent() {
        byte count = 0;
        System.out.println("Nhập mã sinh viên cần tìm: ");
        int searchNumberID = scanner.nextInt();
        for (int i = 0; i < arrStudents.size(); i++) {
            if (searchNumberID == arrStudents.get(i).getNumberID()) {
                System.out.println(arrStudents.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tim thấy");
        }
    }

    //Sắp xếp theo mã học sinh
    public void sortStudent() {
        Collections.sort(arrStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getNumberID() > o2.getNumberID()) {
                    return 1;
                } else if (o1.getNumberID() < o2.getNumberID()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    //Sắp xếp theo điểm học sinh
    public void sortAVGNumber() {
        Collections.sort(arrStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAvgNumber() > o2.getAvgNumber()) {
                    return 1;
                } else if (o1.getAvgNumber() < o2.getAvgNumber()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    //Check học bổng
    public void checkScholarship() {
        System.out.println("Sinh viên được học bổng");
        for (int i = 0; i < arrStudents.size(); i++) {
            if (arrStudents.get(i).getAvgNumber() >= 8.0) {
                System.out.println(arrStudents.get(i));
            }
        }
    }

    //Đọc
    public void inputFile() {
        readAndWriteStudent.readFileStudent(arrStudents);
    }

    //Ghi
    public void outputFile() {
        readAndWriteStudent.writeFileStudent(arrStudents);
    }
}
