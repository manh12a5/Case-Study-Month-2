package model;

import java.io.Serializable;
import java.util.Scanner;

import java.util.regex.Pattern;

public class Student extends Person implements Serializable {

    //Danh sách thuộc tính
    private int numberID;
    private double avgNumber;
    private String email;

    //Constructor
    public Student() {
    }

    public Student(int numberID, double avgNumber, String email) {
        this.numberID = numberID;
        this.avgNumber = avgNumber;
        this.email = email;
    }

    public Student(String name, String gender, String birthday, String address, int numberID, double avgNumber, String email) {
        super(name, gender, birthday, address);
        this.numberID = numberID;
        this.avgNumber = avgNumber;
        this.email = email;
    }

    //Getter and Setter
    public int getNumberID() {
        return numberID;
    }

    public void setNumberID(int numberID) {
        this.numberID = numberID;
    }

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


    //Danh sách phương thức

    //Nhập thông tin học sinh

    @Override
    public void inputInformation() {
        super.inputInformation();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.println("Nhập mã sinh viên: ");
            numberID = Integer.parseInt(scanner.nextLine());
        } while (!checkNumberID(numberID));
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
    public boolean checkNumberID(int numberID) {
        if (numberID < 0) {
            System.out.println("Mã sinh viên phải lơn hơn 0");
            return false;
        } else {
            return true;
        }
    }

    public boolean checkAVGNumber(double avgNumber) {
        if (avgNumber < 0 || avgNumber > 10) {
            System.err.println("Điểm chỉ trong khoảng (0-10)");
            return false;
        } else {
            return true;
        }
    }

    public boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile("^\\w+[A-Za-z0-9]+@[A-Za-z]+.\\w{2,6}$");
        if (!pattern.matcher(email).matches()) {
            System.err.println("Nhập sai Email");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "{ Student }" + "\n" +
                "Mã sinh viên: " + numberID + " ' " +
                "Điểm trung bình: " + avgNumber + " ' " +
                "Email: " + email;
    }

}
