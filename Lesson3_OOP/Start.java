package Lesson3_OOP;

/**
 * Start
 */
public class Start {
    public static void main(String[] args) {
        MySorter ms = new MySorter();

        int[] a = {14, 23, 32, 41, 59, 68, 77, 86, 95}; 
        ms.sorter(a);
        print(a);

        int[] a2 = {13, 23, 36, 432, 50, 678, 71, 814, 937}; 
        ms.sorter(a2);
        print(a2);


        MyList ml = new MyList();
        ml.add("A");
        ml.add("B");
        ml.add("C");
        ml.add("D");
        ml.add("E");
        for (String data : ml) {
            System.out.println(data);
        }
        ml.add("1010");
        for (String data : ml) {
            System.out.println(data);
        }
    }
    public static void print(int[] arr)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}