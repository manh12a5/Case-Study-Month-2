package model;

import java.io.Serializable;
import java.util.Scanner;

import java.util.regex.Pattern;

public class PPerson implements Serializable {

    //Danh sách thuộc tính
    private String numberID;
    private String name;
    private String gender;
    private String birthday;
    private String address;
    private String numberPhone;

    //Constructor
    public PPerson() {
    }

    public PPerson(String numberID, String name, String gender, String birthday, String address, String numberPhone) {
        this.numberID = numberID;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.numberPhone = numberPhone;
    }

    //Getter and Setter
    public String getNumberID() {
        return numberID;
    }

    public void setNumberID(String numberID) {
        this.numberID = numberID;
    }

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

    public String getNumber() {
        return numberPhone;
    }

    public void setNumber(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    //Danh sách phương thức nhập

    //Nhập thông tin
    public void inputInformation() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.println("Nhập mã ID: ");
            numberID = scanner.nextLine();
        } while (!checkNumberID(numberID));
        do {
            System.out.println("Nhập họ tên: ");
            name = scanner1.nextLine();
        } while (!checkName(name));
        do {
            System.out.println("Nhập giới tính (Nam/Nữ): ");
            gender = scanner.nextLine();
        } while (!checkGender(gender));
        do {
            System.out.println("Nhập ngày sinh (dd/MM/yyyy): ");
            birthday = scanner1.nextLine();
        } while (!checkBirthday(birthday));
        do {
            System.out.println("Nhập địa chỉ: ");
            address = scanner.nextLine();
        } while (!checkAddress(address));
        do {
            System.out.println("Nhập số điện thoại: ");
            numberPhone = scanner1.nextLine();
        } while (!checkNumberPhone(numberPhone));
    }

    //Check điều kiện nhập

    //Check mã ID
    public boolean checkNumberID(String numberID) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]{5,}$");
        if (!pattern.matcher(numberID).matches()) {
            System.err.println("Mã ID sai (tối thiểu phải có 5 ký tự)");
            return false;
        } else {
            return true;
        }
    }

    //Check địa chỉ
    public boolean checkAddress(String address) {
        Pattern pattern = Pattern.compile("^[$&+,:;=?@#|]*$");
        if (pattern.matcher(address).matches()) {
            System.err.println("Địa chỉ không được có ký tự đặc biệt");
            return false;
        } else {
            return true;
        }
    }

    //Check họ tên
    public boolean checkName(String name) {
        Pattern pattern = Pattern.compile("^\\w{2,}\\s*\\w*\\s*\\w*\\s*\\w*$", Pattern.UNICODE_CHARACTER_CLASS);
        if (!pattern.matcher(name).matches()) {
            System.err.println("Họ tên sai");
            return false;
        } else {
            return true;
        }
    }

    //Check ngày sinh
    public boolean checkBirthday(String birthday) {
        Pattern pattern = Pattern.compile("\\d{2}/\\d{2}/\\d{4}$");
        if (!pattern.matcher(birthday).matches()) {
            System.err.println("Nhập sai ngày sinh");
            System.out.println("(Ngày sinh đúng: 01/01/2021)");
            return false;
        } else {
            return true;
        }
    }

    //Check giới tính
    public boolean checkGender(String gender) {
        if (!gender.equalsIgnoreCase("Nam")
                && !gender.equalsIgnoreCase("Nữ") && !gender.equalsIgnoreCase("Nu")) {
            System.err.println("Nhập sai giới tính");
            return false;
        } else {
            return true;
        }
    }

    //Check số điện thoại
    public boolean checkNumberPhone(String numberPhone) {
        Pattern pattern = Pattern.compile("^[0-9]{10,11}$");
        if (!pattern.matcher(numberPhone).matches()) {
            System.err.println("Nhập sai số điện thoại di động");
            System.out.println("(Số điện thoại phải có 10-11 số)");
            return false;
        } else {
            return true;
        }
    }

    //toString
    @Override
    public String toString() {
        return "----------------------------------------------------" + "\n" +
                "-----{            THÔNG TIN CHUNG             }-----" + "\n" +
                "|                       |*|                        |" + "\n" +
                "  - Mã ID: " + numberID + "\n" +
                "  - Họ tên: " + name + "\n" +
                "  - Giới tính: " + gender + "\n" +
                "  - Ngày sinh: " + birthday + "\n" +
                "  - Địa chỉ: " + address + "\n";
    }

}
