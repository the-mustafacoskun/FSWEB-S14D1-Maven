package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(String name,double salary,int id){
        super(name,salary,id);
        salary=salary*1.05;
    }
    @Override
    public void work()
    {
        System.out.println("JuniorDeveloper work");
    }

}
