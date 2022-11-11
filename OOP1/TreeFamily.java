package OOP1;

import java.util.ArrayList;
import java.util.List;

public class TreeFamily implements ItreeFamily {
    private People headData;
    private int count;
    private List<People> listPeople;

    public TreeFamily() {
        this.count = 0;
        listPeople = new ArrayList<>();
    }
    

    @Override
    public void wedding(People p1, People p2) {
        if(isCurrentFamily(p1, p2)){
            Men men = getMenType(p1);
            Women women = getWomenType(p2);
            if (men == null){
                men = getMenType(p2);
                women = getWomenType(p1);
            }
            men.setWife(women);
            women.setHusband(men);
            add(p1);
            add(p2);
        }
    }

    @Override
    public void funeral(People p) {
        p.death();
        for (int i = 0; i < listPeople.size(); i++) {
            if (listPeople.get(i).getId() == p.getId()){
                listPeople.remove(i);
                return;
            }
        }
    }

    @Override
    public void makeChildren(People father, People mother, String nameW, String nameM) {
        if (isCurrentFamily(father, mother)){
            Women women;
            if (mother instanceof Women){
                women = (Women)mother;
                women.makePeople(nameW, nameM);
            }
        }
    }

    @Override
    public void add(People p1) {
        if (!listPeople.contains(p1)){
            if (headData == null && p1 != null){
                headData = p1;
            }
            listPeople.add(p1);
        }
    }
    
    private boolean isCurrentFamily(People p1, People p2){
        if (p1 instanceof Men && p2 instanceof Women || 
            p2 instanceof Men && p1 instanceof Women ){
                return true;
            }
            return false;
    }
    
    private Men getMenType(People p1){
        if(p1 instanceof Men){
            return (Men)p1;
        }
        return null;
    }
    
    private Women getWomenType(People p1){
        if(p1 instanceof Women){
            return (Women)p1;
        }
        return null;
    }

    @Override
    public People getHeadData() {
        return headData;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public List<People> getListPeople() {
        return listPeople;
    }

    @Override
    public void growChild(Child ch){
        listPeople.add(ch.grow());
    }

}
