package Ex_2;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Exe1
 */
public class Exe1 {
    public float getNum(){
        Scanner scanner = new Scanner(System.in);
        float res = 0;

        try {
            System.out.print("Введите число: ");
            res = Float.parseFloat(scanner.nextLine());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        return res;
    }
    
    public void exe2(int[] intArray){
        int d = 0;
        try {
            double catchedRes1 = intArray[8] / d;

            System.out.println("catchRes1 = " + catchedRes1);
        }
        catch (ArithmeticException e){
            System.out.println("Catching exeption: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index 8 out of bounds for length " + intArray.length + " intArray");
        }
    }
    
    public void exe4() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String res = scanner.nextLine();
        if (res.isEmpty())
            throw new Exception("Пустая строка");
        System.out.println("Введенная строка: " + res);
    }
   
    public void exe3()
    {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);

            printSum(23, 234);

            int[] abc = { 1, 2 };
            abc[3] = 9;
            
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        }
         catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        catch(FileNotFoundException ex){
            System.out.println("Файл не найден");
        }
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    
    public void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}