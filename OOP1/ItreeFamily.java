package OOP1;

import java.util.List;

public interface ItreeFamily {
    void wedding(People p1, People p2);
    void funeral(People p);
    void makeChildren(People father, People mother, String nameW, String nameM);
    void add(People p1);
    People getHeadData();
    public int getCount();
    public List<People> getListPeople();
    public void growChild(Child ch);
}
