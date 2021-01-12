package model.child;

import model.parent.Person;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Teacher extends Person implements Serializable {

    //Danh sách thuộc tính
    private String numberID;
    private String classTeach;
    private double salaryInOneHour;
    private double hourTeachInMonth;

    //Constructor
    public Teacher() {
    }

    public Teacher(String numberID, String classTeach, double salaryInOneHour, double hourTeachInMonth) {
        this.numberID = numberID;
        this.classTeach = classTeach;
        this.salaryInOneHour = salaryInOneHour;
        this.hourTeachInMonth = hourTeachInMonth;
    }

    public Teacher(String name, String gender, String birthday, String address, String numberID, String classTeach, double salaryInOneHour, double hourTeachInMonth) {
        super(name, gender, birthday, address);
        this.numberID = numberID;
        this.classTeach = classTeach;
        this.salaryInOneHour = salaryInOneHour;
        this.hourTeachInMonth = hourTeachInMonth;
    }

    //Getter and Setter
    public String getNumberID() {
        return numberID;
    }

    public void setNumberID(String numberID) {
        this.numberID = numberID;
    }

    public String getClassTeach() {
        return classTeach;
    }

    public void setClassTeach(String classTeach) {
        this.classTeach = classTeach;
    }

    public double getSalaryInOneHour() {
        return salaryInOneHour;
    }

    public void setSalaryInOneHour(double salaryInOneHour) {
        this.salaryInOneHour = salaryInOneHour;
    }

    public double getHourTeachInMonth() {
        return hourTeachInMonth;
    }

    public void setHourTeachInMonth(double hourTeachInMonth) {
        this.hourTeachInMonth = hourTeachInMonth;
    }

    //Danh sách thuộc tính

    @Override
    public void inputInformation() {
        super.inputInformation();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập mã giáo viên: ");
            numberID = scanner.nextLine();
        } while (!checkTeacherID(numberID));
        do {
            System.out.println("Nhập lớp dạy: ");
            classTeach = scanner.nextLine();
        } while (!checkClassTeach(classTeach));
        do {
            System.out.println("Nhập lương dạy trong 1 giờ: ");
            salaryInOneHour = Double.parseDouble(scanner.nextLine());
        } while (salaryInOneHour < 0.0);
        do {
            System.out.println("Nhập số giờ dạy trong tháng: ");
            hourTeachInMonth = scanner.nextDouble();
        } while (hourTeachInMonth < 0.0);
    }

    //Check thông tin

    //Check ID
    public boolean checkTeacherID(String numberID) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]+$");
        if (!pattern.matcher(numberID).matches()) {
            System.err.println("Mã giáo viên sai");
            return false;
        } else {
            return true;
        }
    }

    //Điều kiện nhập phòng dạy
    public boolean checkClassTeach(String classTeach) {
        Pattern pattern = Pattern.compile("^[Cc]+\\d{4}[GgHhIiKkLlMm]+\\d*$");
        if (!pattern.matcher(classTeach).matches()) {
            System.err.println("Nhập sai tên lớp");
            System.err.println("Tên lớp phải có giờ dạy (Giờ G, H, I, K, L, M)");
            System.out.println("Ví dụ tên lớp đúng: C1011G, C0903M, C1010K…");
            return false;
        } else {
            return true;
        }
    }

    //Tính tổng tiền
    public double totalSalary() {
        double totalSalary = 0.0;
        for (int i = 0; i < classTeach.length(); i++) {
            if (classTeach.contains("G") || classTeach.contains("g")
                    || classTeach.contains("H") || classTeach.contains("h")
                    || classTeach.contains("I") || classTeach.contains("i")
                    || classTeach.contains("K") || classTeach.contains("k")) {
                totalSalary = salaryInOneHour * hourTeachInMonth;
            } else if (classTeach.contains("L") || classTeach.contains("l")
                    || classTeach.contains("M") || classTeach.contains("m")) {
                totalSalary = (salaryInOneHour + 200000) * hourTeachInMonth;
            }
        }
        return totalSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "{ Teacher }" + "\n" +
                "Mã giáo viên: " + numberID + " ' " +
                "Lớp dạy: " + classTeach + " ' " +
                "Hệ số lương trong 1 giờ dạy: " + salaryInOneHour + " ' " +
                "Số giờ dạy trong tháng: " + hourTeachInMonth;
    }

}
