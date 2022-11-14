package Lesson3_OOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList implements Iterable<String> {
    private List<String> myList;

    public MyList()
    {
        myList = new ArrayList<>(); 
    }

    public void add(String data)
    {
        myList.add(data);
    }

    public String get(int index)
    {
        return myList.get(index);
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                if (index < myList.size())
                    return true;
                return false;
            }

            @Override
            public String next() {
                return myList.get(index++);
            }
        };
    }
}
