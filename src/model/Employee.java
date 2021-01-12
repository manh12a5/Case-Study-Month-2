package model;

import model.parent.Person;

public class Employee extends Person implements IStaff {


    @Override
    public double getTotalSalary() {
        return 0;
    }
}
