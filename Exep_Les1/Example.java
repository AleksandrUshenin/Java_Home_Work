
import java.beans.Introspector;
import java.util.List;

public class Example {
    public int culc(int a1, int a2){
        int res = 0;
        try
        {
            res = a1 / a2;
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        return res;
    }
    public int[] addInt(int[] arr, int index, int data) throws ArrayIndexOutOfBoundsException{
        arr[index] = data;
        return arr;
    }
    public void ex(List<String> list) throws NullPointerException{
        System.out.println(list.get(5));
    }

    public int[] arr1(int[] arr1 , int[] arr2){
        //int arrLength = (arr1.length + arr2.length) / 2;
        int arrLength = arr1.length > arr2.length ? arr1.length : arr2.length;
        int[] arr3 = new int[arrLength];
        try {
            for (int i = 0; i < arrLength; i++) {
                arr3[i] = arr1[i] - arr2[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("Длинна массивов не равна");
        }
        return arr3;
    }
    public int getInt(String num){
        int res = 0;
        try {
            res = Integer.parseInt(num);
            //res = Integer.getInteger(num);
        }catch (NumberFormatException ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        return res;
    }
}
