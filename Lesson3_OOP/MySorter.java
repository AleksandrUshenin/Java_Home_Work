package Lesson3_OOP;

import java.util.Arrays;
import java.util.Comparator;

/**
 * MySorter
 */
public class MySorter{
    public int[] sorter(int[] arr)
    {
        Integer[] arr2 = new Integer[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10)
                    return 1;
                if (o1 % 10 < o2 % 10)
                    return -1;
                return 0;
            }
            
        });
        
        for (int i = 0; i < arr2.length; i++) {
            arr[i] = arr2[i];
        }

        return arr;
    }
}