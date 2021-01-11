package service;

import model.Teacher;
import storage.ReadAndWriteTeacher;

import java.util.*;

public class ManagerTeacher {

    //Tạo đối tượng
    Scanner scanner = new Scanner(System.in);
    Teacher teacher = new Teacher();
    private List<Teacher> arrTeachers = new ArrayList<>();
    ReadAndWriteTeacher readAndWriteTeacher = new ReadAndWriteTeacher();

    //Danh sách phương thức

    //Thêm
    public void addNewTeacher() {
        teacher.inputInformation();
        arrTeachers.add(teacher);
    }

    //Sửa
    public void editTeacher() {
        System.out.println("Nhập mã giáo viên cần sửa: ");
        int editNumberID = scanner.nextInt();
        arrTeachers.set(editNumberID, teacher);
    }

    //Xóa
    public void removeTeacher() {
        System.out.println("Nhập mã giáo viên cần xóa: ");
        int removeNumberID = scanner.nextInt();
        arrTeachers.remove(removeNumberID);
    }

    //Hiển thị toàn bộ
    public void displayAll() {
        for (int i = 0; i < arrTeachers.size(); i++) {
            System.out.println(arrTeachers.get(i));
        }
    }

    //Hiển thị giáo viên có lương cao nhất
    public void showTeacherHighSalary() {
        int highSalary = 0;
        for (int i = 0; i < arrTeachers.size(); i++) {
            if (highSalary < arrTeachers.get(i).totalSalaryTeach()) {
                System.out.println(arrTeachers.get(i));
            }
        }
    }

    //Tìm kiếm
    public void searchTeacher() {
        byte count = 0;
        System.out.println("Nhập mã giáo viên cần tìm: ");
        int searchNumberID = scanner.nextInt();
        for (int i = 0; i < arrTeachers.size(); i++) {
            if (searchNumberID == arrTeachers.get(i).getNumberID()) {
                System.out.println(arrTeachers.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.err.println("Không tìm thấy");
        }
    }

    //Sắp xếp giáo viên theo mã giáo viên
    public void sortNumberIdTeacher() {
        Collections.sort(arrTeachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
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

    public void inputFile() {
        readAndWriteTeacher.readFileTeacher(arrTeachers);
    }

    public void outputFile() {
        readAndWriteTeacher.writeFileTeacher(arrTeachers);
    }
}
