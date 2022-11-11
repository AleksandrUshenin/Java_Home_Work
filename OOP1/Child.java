package OOP1;

public class Child extends People implements Сhildren {
    private int gender;

    public Child(People p) {
        super(null,null, null, null);
        setGender(p);
    }
    public Child(String name, String surName, People parent1, People parent2, int gender) {
        super(name, surName, parent1, parent2);
        this.gender = gender;
    }

    @Override
    public People grow() {
        People me = super.getParent1().getCildren(this);
        if (gender == 0){
            me = new Women(this);
        }
        else{
            me = new Men(this);
        }
        super.getParent1().growChildren(this, me); 
        super.getParent2().growChildren(this, me); 
        return me;
    }

    @Override
    public void study() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public People getGender() {
        return null;
    }

    @Override
    public void setGender(People p) {
    }

    @Override
    public void death() {
        // TODO Auto-generated method stub
        
    }
}
