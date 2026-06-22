package com.workintech.developers;

public class HRManager extends Employee{

     private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[5];
     private MidDeveloper[]  midDevelopers = new MidDeveloper[5];
     private SeniorDeveloper[] seniorDevelopers  = new SeniorDeveloper[5];

    public HRManager(String name,double salary,int id){
        super(name,salary,id);
    }

    @Override
    public void work() {
        System.out.println("HRManager work");
    }
    public void addEmployee(JuniorDeveloper juniorDeveloper){
        for(int i = 0; i < juniorDevelopers.length; i++){
            if(juniorDevelopers[i] == null){
                juniorDevelopers[i] = juniorDeveloper;
            }else {
                System.out.println(juniorDevelopers[i].getName() + " is already work");
            }
        }
    }
    public void addEmployee(MidDeveloper midDeveloper){
        for(int i = 0; i < midDevelopers.length; i++){
            if(midDevelopers[i] == null){
                midDevelopers[i] = midDeveloper;
            } else {
                System.out.println(midDevelopers[i].getName() + " is already work");
            }
        }
    }
    public void addEmployee(SeniorDeveloper seniorDeveloper){
        for(int i = 0; i < seniorDevelopers.length; i++){
            if(seniorDevelopers[i] == null){
                seniorDevelopers[i] = seniorDeveloper;
            } else {
                System.out.println(seniorDevelopers[i].getName() + " is already work");
            }
        }
    }
}
