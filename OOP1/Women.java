package OOP1;

import java.util.Random;

public class Women extends People implements IWomen {
    private Men husband;

    public Women(String name, String surName, People parent1, People parent2) {
        super(name, surName, parent1, parent2);
    }
    public Women(Child ch) {
        super(ch);
    }

    public Men getHusband() {
        return husband;
    }

    public void setHusband(Men husband) {
        if (this.husband == null){
            this.husband = husband;
        }
    }
    @Override
    public void makePeople(String nameW, String nameM){
        if (husband != null){
            Random rand = new Random();
            People child;
            if (rand.nextInt(2) == 1){
                //child = new Men(nameM, husband.getSurName(), this, husband);
                child = new Child(nameM, husband.getSurName(), this, husband, 4);
            }
            else{
                child = new Child(nameW, husband.getSurName(), this, husband, 0);
            }
            super.addCildren(child);
            husband.addCildren(child);
        }
    }

    @Override
    public void death() {
       husband.setWife(null); 
       husband = null;
    }
}
