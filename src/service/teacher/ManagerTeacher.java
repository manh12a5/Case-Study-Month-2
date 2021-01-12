package service;

import model.child.Teacher;
import storage.ReadAndWriteTeacher;

import java.util.*;

public class ManagerTeacher {

    //Tạo đối tượng
    Scanner scanner = new Scanner(System.in);
    Teacher teacher = new Teacher();
    private List<Teacher> arrTeachers = new ArrayList<>();
    ReadAndWriteTeacher readAndWriteTeacher = new ReadAndWriteTeacher();

    //Danh sách phương thức

    //1. Thêm
    public void addNewTeacher() {
        teacher.inputInformation();
        arrTeachers.add(teacher);
    }

    //2. Sửa
    public void editTeacher() {
        System.out.println("Nhập mã giáo viên cần sửa: ");
        int editNumberID = scanner.nextInt();
        arrTeachers.set(editNumberID, teacher);
    }

    //3. Xóa
    public void removeTeacher() {
        System.out.println("Nhập mã giáo viên cần xóa: ");
        int removeNumberID = scanner.nextInt();
        arrTeachers.remove(removeNumberID);
    }

    //4. Hiển thị toàn bộ
    public void displayAll() {
        for (int i = 0; i < arrTeachers.size(); i++) {
            System.out.println(arrTeachers.get(i));
        }
    }

    //5. Hiển thị giáo viên có lương cao nhất
    public void showTeacherHighSalary() {
        Collections.sort(arrTeachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                if (o1.totalSalary() > o2.totalSalary()) {
                    return 1;
                } else if (o1.totalSalary() < o2.totalSalary()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
            System.out.println(arrTeachers.get(1));
    }

    //6. Tìm kiếm
    public void searchTeacher() {
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

    //8. Tổng tiền của một giáo viên
    public void totalSalaryOneTeacher() {
        byte count = 0;
        System.out.println("Nhập mã giáo viên cần tính tổng: ");
        String searchNumberID = scanner.nextLine();
        for (int i = 0; i < arrTeachers.size(); i++) {
            if (searchNumberID.equals(arrTeachers.get(i).getNumberID())) {
                System.out.println("Giáo viên " + arrTeachers.get(i).getName()
                        + " có tổng tiền: " + arrTeachers.get(i).totalSalary());
                count++;
            }
        }
        if (count == 0) {
            System.err.println("Không tìm thấy");
        }
    }

    //9.
    public void inputFile() {
        readAndWriteTeacher.readFileTeacher(arrTeachers);
        displayAll();
    }

    //10.
    public void outputFile() {
        readAndWriteTeacher.writeFileTeacher(arrTeachers);
        System.out.println("Done");
    }

}
