package service;

public class ManagerListSwitch {

    //Danh sách phương thức

    public void listChoice() {
        System.out.println("1. Thông tin sinh viên");
        System.out.println("2. Thông tin giáo viên");
        System.out.println("0. Exit");
        System.out.print("Choice number: ");
    }

    public void listStudent() {
        System.out.println("----------");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Sửa sinh viên");
        System.out.println("3. Xóa sinh viên");
        System.out.println("4. Hiển thị toàn bộ sinh viên");
        System.out.println("5. Tìm kiếm sinh viên");
        System.out.println("6. Sắp xếp theo mã sinh viên");
        System.out.println("7. Sắp xếp theo điểm trung bình");
        System.out.println("8. Hiển thị nhưng học sinh được học bổng");
        System.out.println("9. Đọc (Open)");
        System.out.println("10. Ghi (Save)");
        System.out.println("0. Trở về");
        System.out.print("Choice number: ");
    }

    public void listTeacher() {
        System.out.println("----------");
        System.out.println("1. Thêm giáo viên");
        System.out.println("2. Sửa giáo viên");
        System.out.println("3. Xóa giáo viên");
        System.out.println("4. Hiển thị toàn bộ giáo viên");
        System.out.println("5. Hiển thị giáo viên lương cao nhất");
        System.out.println("6. Tìm kiếm giáo viên");
        System.out.println("7. Sắp xếp giáo viên theo mã giáo viên");
        System.out.println("8. Tổng tiền của một giáo viên");
        System.out.println("9. Đọc (Open)");
        System.out.println("10. Ghi (Save)");
        System.out.println("0. Trở về");
        System.out.print("Choice number: ");
    }

}
