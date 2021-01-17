package model;

import java.io.Serializable;
import java.util.Scanner;

public class Employee extends PPerson implements Serializable, IPerson {

    //Danh sách thuộc tính
    private String job;
    private double originalSalary;
    private double bonusSalary;
    private double forfeitSalary;

    //Constructor
    public Employee() {
    }

    public Employee(String job, double originalSalary, double bonusSalary, double forfeitSalary) {
        this.job = job;
        this.originalSalary = originalSalary;
        this.bonusSalary = bonusSalary;
        this.forfeitSalary = forfeitSalary;
    }

    public Employee(String numberID, String name, String gender, String birthday, String address, String numberPhone, String job, double originalSalary, double bonusSalary, double forfeitSalary) {
        super(numberID, name, gender, birthday, address, numberPhone);
        this.job = job;
        this.originalSalary = originalSalary;
        this.bonusSalary = bonusSalary;
        this.forfeitSalary = forfeitSalary;
    }

    //Getter and Setter
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getOriginalSalary() {
        return originalSalary;
    }

    public void setOriginalSalary(double originalSalary) {
        this.originalSalary = originalSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getForfeitSalary() {
        return forfeitSalary;
    }

    public void setForfeitSalary(double forfeitSalary) {
        this.forfeitSalary = forfeitSalary;
    }

    @Override
    public double getTotalSalary() {
        double totalSalary = 0.0;
        for (int i = 0; i < job.length(); i++) {
            if (job.equalsIgnoreCase("Bảo Vệ") || job.equalsIgnoreCase("Bao Ve")) {
                totalSalary = (originalSalary + 400000) + bonusSalary - forfeitSalary;
            } else if (job.equalsIgnoreCase("Lao Công") || job.equalsIgnoreCase("Lao Cong")) {
                totalSalary = (originalSalary * 1.2) + bonusSalary - forfeitSalary;
            } else if (job.equalsIgnoreCase("Y Tá") || job.equalsIgnoreCase("Y Ta")) {
                totalSalary = originalSalary + bonusSalary - forfeitSalary;
            }
        }
        return totalSalary;
    }

    //Danh sách phương thức nhập

    //Nhập thông tin nhân viên
    @Override
    public void inputInformation() {
        super.inputInformation();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.println("Nhập nghề nghiệp nhân viên: ");
            job = scanner.nextLine();
        } while (!checkJob(job));
        do {
            System.out.println("Nhập lương cơ bản: ");
            originalSalary = scanner1.nextDouble();
        } while (!checkOriginalSalary(originalSalary));
        do {
            System.out.println("Nhập lương làm thêm giờ: ");
            bonusSalary = scanner.nextDouble();
        } while (bonusSalary < 0.0);
        do {
            System.out.println("Nhập số tiền phạt: ");
            forfeitSalary = scanner1.nextDouble();
        } while (forfeitSalary < 0.0);
    }

    //Check điều kiện nhập

    //Check nghê nghiệp
    public boolean checkJob(String job) {
        for (int i = 0; i < job.length(); i++) {
            if (!job.equalsIgnoreCase("Bảo Vệ") && !job.equalsIgnoreCase("Bao Ve")
                    && !job.equalsIgnoreCase("Lao Công") && !job.equalsIgnoreCase("Lao Cong")
                    && !job.equalsIgnoreCase("Y Tá") && !job.equalsIgnoreCase("Y Ta") )
            {
                System.err.println("Nhập sai nghề nghiệp trong trường");
                System.out.println("(Nhân viên trong trường chỉ có: Bảo vệ, Lao công, Y tá)");
                return false;
            }
        }
        return true;
    }

    //Check lương cơ bản
    public boolean checkOriginalSalary(double originalSalary) {
        if (originalSalary < 3000000) {
            System.err.println("Lương tối thiểu phải trên 3 triệu");
            return false;
        } else {
            return true;
        }
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
                "-----{                EMPLOYEE                }-----" + "\n" +
                "|                       [*]                        |" + "\n" +
                "  - Nghề ngiệp: " + job + "\n" +
                "  - Lương cơ bản: " + originalSalary + "\n" +
                "  - Số tiền làm thêm: " + bonusSalary + "\n" +
                "  - Số tiền phạt: " + forfeitSalary + "\n" +
                "\\__________________________________________________/" + "\n";
    }

}
