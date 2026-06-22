package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(String name,double salary,int id) {
        super(name,salary,id);
        salary=salary*1.3;
    }
    @Override
    public void work() {
        System.out.println("SeniorDeveloper work");
    }

}
