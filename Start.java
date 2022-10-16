import java.util.Calendar;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner sc = new Scanner(System.in);
        System.out.println(Ex1(sc.nextLine()));
        
        byte[] arr = new byte[] { 1, 1, 0, 1, 1, 1 };
        Ex2(arr);
        int[] arre = new int[] { 3, 2, 2, 3 };
        Ex3(arre, 3);
        int[] arre2 = new int[] { 3, 1, 3, 0, 4, 3, 5, 2, 2, 3 };
        Ex3(arre2, 3);

        System.out.println(Ex4(2));
        System.out.println(Ex4(3));
        System.out.println(Ex4(4));

        Ex5("2?", "?5", 69);
        Ex5("2?", "?5", 45);
        Ex5("?4", "1?", 55);  
    }
    static String Ex1(String name){
        Calendar calendar = Calendar.getInstance();
        var time = calendar.getTime();
        //DateTime datatime = DateTime.Now;
        String message;
        //int Hours = datatime.TimeOfDay.Hours;
        int Hours = time.getHours();
        if (Hours >= 5 && Hours < 12)
        {
            message = "Доброе утро " + name;
        }
        else if (Hours >= 12 && Hours < 18)
        {
            message = "Добрый день " + name;
        }
        else if (Hours >= 18 && Hours < 23)
        {
            message = "Добрый вечер " + name;
        }
        else
        {
            message = "Доброй ночи " + name;
        }
        return message;
    }
    static void Ex2(byte[] arr) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int index2 = i;
            int count2 = 0;
            if (arr[i] != 0) {
                for (int e = i; e < arr.length; e++) {
                    if (arr[e] != 0) {
                        count2++;
                    } else {
                        break;
                    }
                }
            }
            if (count2 > count) {
                index = index2;
                count = count2;
            }
        }
        byte[] res = new byte[count];
        for (int i = 0; i < count; i++)
        {
            System.out.println(res[i] = arr[index + i]);
        }
    }
    static  void  Ex3(int[] arr, int num){
        int index = arr.length - 1;
        for (int i = arr.length - 1; i > -1 ; i--) {
            if(arr[i] == num && arr[index] != num){
                arr[i] = arr[index];
                arr[index] = num;
                index--;
            }
            if (arr[index] == num){
                index--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(">>>>>>>>>>>>");
    }
    static int Ex4(int TnuS){
        return (TnuS * (TnuS + 1)) / 2;
    }
    static void Ex5(String q, String w, int e){
        //q + w = eS//2? +S?5 = 69
        int res = 0;
        int registr1 = q.charAt(0) == '?' ? 0 : 1;
        int registr2 = w.charAt(0) == '?' ? 0 : 1;
        String q2 = String.valueOf(q.charAt(1));
        String w2 = String.valueOf(w.charAt(1));
        int num1 = registr1 == 0 ? Integer.parseInt(String.valueOf(q.charAt(1))) :
                Integer.parseInt(String.valueOf(q.charAt(0))) * 10;
        int num2 = registr2 == 0 ? Integer.parseInt(String.valueOf(w.charAt(1))) :
                Integer.parseInt(String.valueOf(w.charAt(0))) * 10;
        int num3 = 0;
        while (res != e)
        {
            num3++;
            res = num1 + num2 + num3;
        }
        num1 = registr1 == 0 ? num1 + 10 * (num3 / 10) : num1 + (num3 % 10);
        num2 = registr2 == 0 ? num2 + 10 * (num3 / 10) : num2 + (num3 % 10);
        System.out.printf("%s + %s = %s\n", num1, num2, e);//num1, num2, e;
    }
}
