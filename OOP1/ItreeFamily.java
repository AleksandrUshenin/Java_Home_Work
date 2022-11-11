package OOP1;

import java.util.List;

public interface ItreeFamily<T extends People> {
    public void wedding(T p1, T p2);
    public void funeral(T p);
    public void makeChildren(T father, T mother, String nameW, String nameM);
    public void add(T p1);
    public T getHeadData();
    public int getCount();
    public List<T> getListPeople();
    public void growChild(Child ch);
}
