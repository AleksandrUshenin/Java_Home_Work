package Lesson_3;
import java.util.*;

import java.util.Arrays;

/**
 * Satart
 */
public class Satart {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 51; i++) {
            list.add(i);
        }
        Ex1(list);
        System.out.println(list);
        Ex2(list);

        int[] arr = {8, 4, 1, 5, 7, 2, 6, 3};
        PrintArr(arr);
        PrintArr(SorterArr(arr));

        int[] arr2 = {8, 4, 1, 5, 7, 2, 6, 3, 9, 10};
        PrintArr(arr2);
        PrintArr(SorterArr(arr2));
        
    }
    private static void Ex1(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 ==0){
                list.remove(i);
            }
        }
    }
    private static void Ex2(List<Integer> list){
        int min = list.get(0);
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)){
                min = list.get(i);
            }
            if (max < list.get(i)){
                max = list.get(i);
            }
        }
        double midle = (double)max / list.size();
    }

    private static int[] SorterArr(int[] arr){
        int len1 = arr.length;
        int len2 = 2;
        int len3 = len1;
        int[][] arr2 = new int[len1][];
        int[][] res;

        int ind = 0;
        for (int i = 0; i < len1; i++) {
            arr2[i] = new int[len2 - 1];
            for (int j = 0; j < len2 - 1; j++) {
                arr2[i][j] = arr[ind];
                ind++;
            }
        }

        int index1 = 0;
        int index2 = 1;
        int index3 = 0;
        int count = 1;
        if (len1 % 2 != 0){
            len1 /= 2 + 1;
        }
        else{
            len1 /= 2;
        }
        res = new int[len1][];
        while(count != arr.length / 2){

            res[index3] = ex3(arr2[index1], arr2[index2]);
            
            if (index3 != len1 - 1){
                index3++;
            }
            else{
                len3 = len1;
                if (len1 % 2 != 0){
                    len1 = len1 / 2 + 1;
                }
                else{
                    len1 /= 2;
                }
                len2 *= 2;
                arr2 = Arrays.copyOf(res, arr.length);
                res = new int[len1][];
                count++;
                index3 = 0;
                index2 = 1;
                index1 = 0;
                continue;
            }
            if(index1 != arr2.length){//(index1 != arr.length)
                index1 += 2;
                index2 += 2;
                if (index2 >= len3){
                    len3 = len1;
                    res[index3] = arr2[index2 - 1];
                    if (len1 % 2 != 0){
                        len1 = len1 / 2 + 1;
                    }
                    else{
                        len1 /= 2;
                    }
                    len2 *= 2;
                    arr2 = Arrays.copyOf(res, arr.length);
                    res = new int[len1][];
                    count++;
                    index3 = 0;
                    index2 = 1;
                    index1 = 0;
                    continue;
                }
                // if (index2 != arr2[index1].length){
                //     index2 += 3;
                // }
                // else{
                //     index2 = 0;
                // }
            }
            else{
                index1 = 0;
                index2 = 0;
            }
        }
        //PrintArr(arr2[0]);
        return arr2[0];
    }
    private static int[] ex3(int[] left, int[] right){
        int[] res = new int[left.length + right.length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < res.length; i++) {
            if (left[index1] > right[index2]){
                res[i] = right[index2];
                index2++;
            }
            else{
                res[i] = left[index1];
                index1++;
            }
            if (index2 == right.length){
                res[i + 1] = left[index1];
                break;
            }
            if (index1 == left.length){
                res[i + 1] = right[index2];
                break;
            }
        }
        if (index2 != right.length){
            res[res.length - 1] = right[right.length - 1];
        }
        return res;
    }
    private static void PrintArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.print("\n");
    }
}