package service;

import model.Student;
import storage.StudentReadAndWrite;

import java.util.*;

public class StudentService implements IService {

    Scanner scanner = new Scanner(System.in);
    private List<Student> arrStudents = new LinkedList<>();

    //Danh sách phương thức

    //1. Thêm
    @Override
    public void addPerson() {
        Student student = new Student();
        student.inputInformation();
        arrStudents.add(student);
    }

    //2. Sửa
    @Override
    public void editPerson() {
        boolean checkID = false;
        System.out.print("Nhập mã sinh viên cần sửa: ");
        String editNumberID = scanner.nextLine();
        for (int i = 0; i < arrStudents.size(); i++) {
            if (editNumberID.equals(arrStudents.get(i).getNumberID())) {
                Student student = new Student();
                arrStudents.set(i, student);
                checkID = true;
            }
        }
        if (!checkID) {
            System.out.println("  - Không có mã học sinh cần sửa");
        }
    }

    //3. Xóa
    @Override
    public void removePerson() {
        boolean checkID = false;
        System.out.print("Nhập mã học sinh cần xóa: ");
        String removeNumberID = scanner.nextLine();
        for (int i = 0; i < arrStudents.size(); i++) {
            if (removeNumberID.equals(arrStudents.get(i).getNumberID())) {
                arrStudents.remove(arrStudents.get(i));
                System.out.println("Đã xóa");
                checkID = true;
            }
        }
        if (!checkID) {
            System.out.println("  - Không có mã sinh viên để xóa");
        }
    }

    //4. Hiển thị toàn bộ
    @Override
    public void displayAll() {
        for (int i = 0; i < arrStudents.size(); i++) {
            System.out.println("|                      { " + (i + 1) + " }                       |" + "\n" +
                    arrStudents.get(i));
        }
    }

    //5. Tìm kiếm
    @Override
    public void searchPerson() {
        byte count = 0;
        System.out.print("Nhập mã học sinh cần tìm: ");
        String searchNumberID = scanner.nextLine();
        for (int i = 0; i < arrStudents.size(); i++) {
            if (searchNumberID.equals(arrStudents.get(i).getNumberID())) {
                System.out.println(arrStudents.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("  - Không tim thấy");
        }
    }

    //6. Sắp xếp theo mã học sinh
    public void sortNumberID() {
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
    public void showStudentScholarship() {
        System.out.println("Học sinh được học bổng");
        for (int i = 0; i < arrStudents.size(); i++) {
            if (arrStudents.get(i).getAvgNumber() >= 8.0) {
                System.out.println("|                      { " + (i + 1) + " }                       |" + "\n" +
                        arrStudents.get(i));
            }
        }
    }

    //9. Đọc
    @Override
    public void readFilePerson() {
        StudentReadAndWrite readAndWriteStudent = new StudentReadAndWrite();
        readAndWriteStudent.readFileStudent(arrStudents);
        displayAll();
    }

    //10. Ghi
    @Override
    public void writeFilePerson() {
        StudentReadAndWrite readAndWriteStudent = new StudentReadAndWrite();
        readAndWriteStudent.writeFileStudent(arrStudents);
        System.out.println("Done");
    }

}
