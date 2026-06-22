package com.workintech.developers;

public class MidDeveloper extends Employee{

    public MidDeveloper(String name,double salary,int id){
        super(name,salary,id);
        salary=salary*1.15;
    }
    @Override
    public void work()
    {
        System.out.println("MidDeveloper work");
    }


}
