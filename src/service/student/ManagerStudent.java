package service;

import model.child.Student;
import storage.ReadAndWriteStudent;

import java.util.*;

public class ManagerStudent {

    //Tạo đối tượng
    Scanner scanner = new Scanner(System.in);
    Student student = new Student();
    private List<Student> arrStudents = new LinkedList<>();
    ReadAndWriteStudent readAndWriteStudent = new ReadAndWriteStudent();

    //Danh sách phương thức

    //1. Thêm
    public void addNewStudent() {
        student.inputInformation();
        arrStudents.add(student);
    }

    //2. Sửa
    public void editStudent() {
        System.out.println("Nhập mã sinh viên cần sửa: ");
        int editNumberID = scanner.nextInt();
        arrStudents.set(editNumberID, student);
    }

    //3. Xóa
    public void removeStudent() {
        System.out.println("Nhập mã sinh viên cần xóa: ");
        String removeNumberID = scanner.nextLine();
        for (int i = 0; i < arrStudents.size(); i++) {
            if (removeNumberID.equals(arrStudents.get(i).getNumberID())) {
                arrStudents.remove(arrStudents.get(i));
                System.out.println("Đã xóa");
            }
        }
    }

    //4. Hiển thị toàn bộ
    public void displayAll() {
        for (int i = 0; i < arrStudents.size(); i++) {
            System.out.println(arrStudents.get(i));
        }
    }

    //5. Tìm kiếm
    public void searchStudent() {
        byte count = 0;
        System.out.println("Nhập mã sinh viên cần tìm: ");
        String searchNumberID = scanner.nextLine();
        for (int i = 0; i < arrStudents.size(); i++) {
            if (searchNumberID.equals(arrStudents.get(i).getNumberID())) {
                System.out.println(arrStudents.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tim thấy");
        }
    }

    //6. Sắp xếp theo mã học sinh
    public void sortStudent() {
        Collections.sort(arrStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getNumberID().compareTo(o2.getNumberID());
            }
        });
        displayAll();
    }

    //7. Sắp xếp theo điểm học sinh
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
        displayAll();
    }

    //8. Check học bổng
    public void checkScholarship() {
        System.out.println("Sinh viên được học bổng");
        for (int i = 0; i < arrStudents.size(); i++) {
            if (arrStudents.get(i).getAvgNumber() >= 8.0) {
                System.out.println(arrStudents.get(i));
            }
        }
    }

    //9. Đọc
    public void inputFile() {
        readAndWriteStudent.readFileStudent(arrStudents);
        displayAll();
    }

    //10. Ghi
    public void outputFile() {
        readAndWriteStudent.writeFileStudent(arrStudents);
        System.out.println("Done");
    }

}
