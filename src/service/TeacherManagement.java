package service;

import model.Teacher;
import storage.TeacherReadAndWrite;

import java.util.*;

public class TeacherManagement implements Manager {

    Scanner scanner = new Scanner(System.in);
    private List<Teacher> arrTeachers = new ArrayList<>();

    //Danh sách phương thức

    //1. Thêm
    @Override
    public void addNewPerson() {
        Teacher teacher = new Teacher();
        teacher.inputInformation();
        arrTeachers.add(teacher);
    }

    //2. Sửa
    @Override
    public void editNewPerson() {
        boolean checkID = false;
        System.out.println("Nhập mã giáo viên cần sửa: ");
        String editNumberID = scanner.nextLine();
        for (int i = 0; i < arrTeachers.size(); i++) {
            if (editNumberID.equals(arrTeachers.get(i).getNumberID())) {
                Teacher teacher = new Teacher();
                teacher.inputInformation();
                arrTeachers.set(i, teacher);
                checkID = true;
            }
        }
        if (!checkID) {
            System.err.println("Không có mã giáo viên cần sửa");
        }
    }

    //3. Xóa
    @Override
    public void removePerson() {
        boolean checkID = false;
        System.out.println("Nhập mã giáo viên cần xóa: ");
        String removeNumberID = scanner.nextLine();
        for (int i = 0; i < arrTeachers.size(); i++) {
            if (removeNumberID.equals(arrTeachers.get(i).getNumberID())) {
                arrTeachers.remove(i);
                checkID = true;
            }
        }
        if (!checkID) {
            System.err.println("Không có mã giáo viên để xóa");
        }
    }

    //4. Hiển thị toàn bộ
    @Override
    public void displayAll() {
        for (int i = 0; i < arrTeachers.size(); i++) {
            System.out.println(arrTeachers.get(i));
        }
    }

    //5. Tìm kiếm
    @Override
    public void searchPerson() {
        byte count = 0;
        System.out.println("Nhập mã giáo viên cần tìm: ");
        String searchNumberID = scanner.nextLine();
        for (int i = 0; i < arrTeachers.size(); i++) {
            if (searchNumberID.equals(arrTeachers.get(i).getNumberID())) {
                System.out.println(arrTeachers.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.err.println("Không tìm thấy");
        }
    }

    //6. Hiển thị giáo viên có lương cao nhất
    public double findHighSalary() {
        double highSalary = arrTeachers.get(0).getTotalSalary();
        for (int i = 0; i < arrTeachers.size(); i++) {
            if (highSalary < arrTeachers.get(i).getTotalSalary()) {
                highSalary = arrTeachers.get(i).getTotalSalary();
            }
        }
        return highSalary;
    }

    public void showTeacherHighSalary() {
        for (int i = 0; i < arrTeachers.size(); i++) {
            if (findHighSalary() == arrTeachers.get(i).getTotalSalary()) {
                System.out.println(arrTeachers.get(i));
            }
        }
    }

    //7. Sắp xếp giáo viên theo mã giáo viên
    public void sortNumberIdTeacher() {
        Collections.sort(arrTeachers, new Comparator<>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                return o1.getNumberID().compareTo(o2.getNumberID());
            }
        });
        displayAll();
    }

    //8. Tổng tiền
    public void totalSalaryTeacher() {
        byte count = 0;
        System.out.println("Nhập mã giáo viên cần tính tổng: ");
        String searchNumberID = scanner.nextLine();
        for (int i = 0; i < arrTeachers.size(); i++) {
            if (searchNumberID.equals(arrTeachers.get(i).getNumberID())) {
                System.out.println("Giáo viên " + arrTeachers.get(i).getName()
                        + " có tổng tiền: " + arrTeachers.get(i).getTotalSalary());
                count++;
            }
        }
        if (count == 0) {
            System.err.println("Không tìm thấy");
        }
    }

    //9. Đọc
    @Override
    public void readFilePerson() {
        TeacherReadAndWrite readAndWriteTeacher = new TeacherReadAndWrite();
        readAndWriteTeacher.readFileTeacher(arrTeachers);
        displayAll();
    }

    //10. Ghi
    @Override
    public void writeFilePerson() {
        TeacherReadAndWrite readAndWriteTeacher = new TeacherReadAndWrite();
        readAndWriteTeacher.writeFileTeacher(arrTeachers);
        System.out.println("Done");
    }

}
