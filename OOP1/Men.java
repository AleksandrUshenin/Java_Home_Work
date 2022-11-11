package OOP1;

public class Men extends People {
    private Women wife;

    public Men(String name, String surName, People parent1, People parent2) {
        super(name, surName, parent1, parent2);
    }

    public Men(Child ch) {
        super(ch);
    }

    public Women getWife() {
        return wife;
    }

    public void setWife(Women wife) {
        if (this.wife == null){
            this.wife = wife;
        }
    }
    @Override
    public void death() {
        wife.setHusband(null);
        wife = null;
    }
}
