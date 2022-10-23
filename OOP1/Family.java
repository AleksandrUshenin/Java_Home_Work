package OOP1;

import java.util.ArrayList;
import java.util.List;

public class Family<T> {
    private T parent1;
    private T parent2;
    private List<People> children;

    public Family(T parent1, T parent2){
        this.parent1 = parent1;
        this.parent2 = parent2;
        children = new ArrayList<>();
    }

    public T getParent1(){
        return parent1;
    }
    public T getParent2(){
        return parent2;
    }
}
