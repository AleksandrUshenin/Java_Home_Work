package OOP1;

import java.util.ArrayList;
import java.util.List;

import javax.crypto.spec.OAEPParameterSpec;

public abstract class People {
    private static int idStatic = 1;

    private String name;
    private String surName;
    private int id;
    private People parent1;
    private People parent2;
    private List<People> childrens;
    private List<People> brothers;
    private List<People> sisters;
    
    public People(String name, String surName, People parent1, People parent2) {
        this.name = name;
        this.surName = surName;
        this.id = idStatic++;
        this.parent1 = parent1;
        this.parent2 = parent2;
        childrens = new ArrayList<>();
    }
    public People(Child ch) {
        this.name = ch.getName();
        this.surName = ch.getSurName();
        this.id = ch.getId();
        this.parent1 = ch.getParent1();
        this.parent2 = ch.getParent2();
        childrens = new ArrayList<>();
    }

    public List<People> getChildrens() {
        return childrens;
    }

    public People getCildren(People p) {
        for (int i = 0; i < childrens.size(); i++) {
            if(childrens.get(i).id == p.id){
                return childrens.get(i);
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getId() {
        return id;
    }
    
    public People getParent1(){
        return parent1;
    }
    
    public People getParent2(){
        return parent2;
    }
    
    public abstract void death();

    public void addCildren(People cildren) {
        if (childrens.size() > 0){
            for (int i = 0; i < childrens.size(); i++) {
                childrens.get(i).addBrother(cildren);
            }
        }
        this.childrens.add(cildren);
    }
    public void growChildren(Child ch, People p){
        for (int i = 0; i < childrens.size(); i++) {
            if(childrens.get(i).id == ch.getId()){
                childrens.remove(i);
                childrens.add(p);
                return;
            }
        }
    }
    @Override
    public String toString() {
        return String.format("%s %s %s", name, surName, id);
    }

    public void addBrother(People p){
        brothers.add(p);
    }

    public List<People> getBrothers(){
        return brothers;
    }

    public People getBrother(int index){
        return brothers.get(index);
    }

    public void addSister(People p){
        sisters.add(p);
    }

    public List<People> getSisters(){
        return sisters;
    }

    public People getSister(int index){
        return sisters.get(index);
    }

}
