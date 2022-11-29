
public class Example2 {
    public int[] ex1(int[] arr1, int[] arr2){
        int arrLength = arr1.length > arr2.length ? arr1.length : arr2.length;
        int[] arrRes = new int[arrLength];
        try {
            for (int i = 0; i < arrLength; i++) {
                arrRes[i] = arr1[i] - arr2[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
        return arrRes;
    }
}
