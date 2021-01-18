package model;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Teacher extends PPerson implements Serializable, IPerson {

    //Danh sách thuộc tính
    private String titleJob;
    private String classTeach;
    private double salaryInOneHour;
    private double hourTeachInMonth;

    //Constructor
    public Teacher() {
    }

    public Teacher(String jobInSchool, String classTeach, double salaryInOneHour, double hourTeachInMonth) {
        this.titleJob = jobInSchool;
        this.classTeach = classTeach;
        this.salaryInOneHour = salaryInOneHour;
        this.hourTeachInMonth = hourTeachInMonth;
    }

    public Teacher(String numberID, String name, String gender, String birthday, String address, String numberPhone, String jobInSchool, String classTeach, double salaryInOneHour, double hourTeachInMonth) {
        super(numberID, name, gender, birthday, address, numberPhone);
        this.titleJob = jobInSchool;
        this.classTeach = classTeach;
        this.salaryInOneHour = salaryInOneHour;
        this.hourTeachInMonth = hourTeachInMonth;
    }

    //Getter and Setter
    public String getTitleJob() {
        return titleJob;
    }

    public void setTitleJob(String titleJob) {
        this.titleJob = titleJob;
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

    //Tính tổng tiền  //Interface
    @Override
    public double getTotalSalary() {
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

    //Danh sách phương thức nhập

    //Phương thức nhập
    @Override
    public void inputInformation() {
        super.inputInformation();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.println("Nhập chức vụ giáo viên trong trường: ");
            titleJob = scanner.nextLine();
        } while (!checkJobInSchool(titleJob));
        do {
            System.out.println("Nhập lớp dạy: ");
            classTeach = scanner1.nextLine();
        } while (!checkClassTeach(classTeach));
        do {
            System.out.println("Nhập lương dạy trong 1 giờ: ");
            salaryInOneHour = Double.parseDouble(scanner.nextLine());
        } while (salaryInOneHour < 0.0);
        do {
            System.out.println("Nhập số giờ dạy trong tháng: ");
            hourTeachInMonth = scanner1.nextDouble();
        } while (hourTeachInMonth < 0.0);
    }

    //Check điều kiện nhập

    //Check chức vụ
    public boolean inputJobInSchool(String jobInSchool) {
        if (jobInSchool.equalsIgnoreCase("Giáo Sư Tiến Sĩ") || (jobInSchool.equalsIgnoreCase("Giao Su Tien Si")
                || jobInSchool.equalsIgnoreCase("Phó Giáo Sư Tiến Sĩ") || jobInSchool.equalsIgnoreCase("Pho Giao Su Tien Si")
                || jobInSchool.equalsIgnoreCase("Tiến Sĩ") || jobInSchool.equalsIgnoreCase("Tien Si")
                || jobInSchool.equalsIgnoreCase("Thạc Sĩ") || jobInSchool.equalsIgnoreCase("Thac Si"))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkJobInSchool(String jobInSchool) {
        if (!inputJobInSchool(jobInSchool)) {
            System.err.println("Nhập sai chức vụ");
            System.out.println("(Chức vụ đúng: Giáo Sư Tiến Sĩ, Phó Giáo Sư Tiến Sĩ, Tiến Sĩ, Thạc Sĩ)");
            return false;
        } else {
            return true;
        }
    }

    //Check phòng dạy
    public boolean checkClassTeach(String classTeach) {
        Pattern pattern = Pattern.compile("^[Cc]+\\d{4}[GgHhIiKkLlMm]+\\d*$");
        if (!pattern.matcher(classTeach).matches()) {
            System.err.println("Nhập sai tên lớp");
            System.err.println("Tên lớp phải có giờ dạy (Giờ G, H, I, K, L, M)");
            System.out.println("(Ví dụ tên lớp đúng: C1011G, C0903M, C1010K…)");
            return false;
        } else {
            return true;
        }
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
                "-----{                TEACHER                 }-----" + "\n" +
                "|                       [*]                        |" + "\n" +
                "  - Chức danh: " + titleJob + "\n" +
                "  - Lớp dạy: " + classTeach + "\n" +
                "  - Hệ số lương trong 1 giờ dạy: " + salaryInOneHour + "\n" +
                "  - Số giờ dạy trong tháng: " + hourTeachInMonth + "\n" +
                "\\__________________________________________________/" + "\n";
    }

}
