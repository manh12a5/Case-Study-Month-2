package model;

import java.io.Serializable;
import java.util.Scanner;

import java.util.regex.Pattern;

public class Person implements Serializable {

    //Danh sách thuộc tính
    private String name;
    private String gender;
    private String birthday;
    private String address;

    //Constructor
    public Person() {
    }

    public Person(String name, String gender, String birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Danh sách phương thức

    //Nhập thông tin
    public void inputInformation() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.println("Nhập họ tên: ");
            name = scanner.nextLine();
        } while (!checkName(name));
        do {
            System.out.println("Nhập giới tính (Nam/Nữ): ");
            gender = scanner1.nextLine();
        } while (!checkGender(gender));
        do {
            System.out.println("Nhập ngày sinh (dd/MM/yyyy): ");
            birthday = scanner.nextLine();
        } while (!checkBirthday(birthday));
        do {
            System.out.println("Nhập địa chỉ: ");
            address = scanner1.nextLine();
        } while (address.length() < 0);
    }

    //Check thông tin
    public boolean checkName(String name) {
        Pattern pattern = Pattern.compile("^\\w+\\s*\\w*\\s*\\w*\\s*\\w*$", Pattern.UNICODE_CHARACTER_CLASS);
        if (!pattern.matcher(name).matches()) {
            System.err.println("Họ tên sai");
            return false;
        } else {
            return true;
        }

    }
    public boolean checkBirthday(String birthday) {
        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$");
        if (!pattern.matcher(birthday).matches()) {
            System.err.println("Nhập sai ngày sinh");
            return false;
        } else {
            return true;
        }
    }

    public boolean checkGender(String gender) {
        if (!gender.equalsIgnoreCase("Nam")
                && !gender.equalsIgnoreCase("Nữ") && !gender.equalsIgnoreCase("Nu")) {
            System.err.println("Nhập sai giới tính");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "{ Thông tin chung }" + "\n" +
                "Họ tên: " + name + " ' " +
                "Giới tính: " + gender + " ' " +
                "Ngày sinh: " + birthday + " ' " +
                "Địa chỉ: " + address + "\n";
    }

}
