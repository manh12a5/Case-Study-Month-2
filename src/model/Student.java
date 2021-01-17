package model;

import java.io.Serializable;
import java.util.Scanner;

import java.util.regex.Pattern;

public class Student extends PPerson implements Serializable {

    //Danh sách thuộc tính
    private double avgNumber;
    private String email;

    //Constructor
    public Student() {
    }

    public Student(double avgNumber, String email) {
        this.avgNumber = avgNumber;
        this.email = email;
    }

    public Student(String numberID, String name, String gender, String birthday, String address, String numberPhone, double avgNumber, String email) {
        super(numberID, name, gender, birthday, address, numberPhone);
        this.avgNumber = avgNumber;
        this.email = email;
    }

    //Getter and Setter
    public double getAvgNumber() {
        return avgNumber;
    }

    public void setAvgNumber(double avgNumber) {
        this.avgNumber = avgNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Danh sách phương thức nhập

    //Nhập thông tin học sinh
    @Override
    public void inputInformation() {
        super.inputInformation();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.println("Nhập điểm trung bình: ");
            avgNumber = scanner.nextDouble();
        } while (!checkAVGNumber(avgNumber));
        do {
            System.out.println("Nhập email: ");
            email = scanner1.nextLine();
        } while (!checkEmail(email));
    }

    //Check thông tin

    //Check điểm trung bình
    public boolean checkAVGNumber(double avgNumber) {
        if (avgNumber < 0 || avgNumber > 10) {
            System.err.println("Điểm chỉ trong khoảng (0-10)");
            return false;
        } else {
            return true;
        }
    }

    //Check Email
    public boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile("^\\w+[A-Za-z0-9.]+@\\w+.\\w{2,6}$");
        if (!pattern.matcher(email).matches()) {
            System.err.println("Nhập sai Email");
            return false;
        } else {
            return true;
        }
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
                "-----{                STUDENT                 }-----" + "\n" +
                "|                       [*]                        |" + "\n" +
                "  - Điểm trung bình: " + avgNumber + "\n" +
                "  - Email: " + email + "\n" +
                "\\__________________________________________________/" + "\n";
    }

}
