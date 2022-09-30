package Lesson_2;
import java.io.*;
import java.util.List;

/**
 * Start
 */
public class Start {
    public static void main(String[] args) {
        Ex1();
    }
    static String[] Ex1(){
        String dir = System.getProperty("user.dir");
        File dirF = new File(dir);
        File[] arrFile = dirF.listFiles();
        String[] arrdir = new String[arrFile.length];
        for (int i = 0; i < arrFile.length; i++){
            arrdir[i] = arrFile[i].getName();
            System.out.println(arrdir[i]);
        }
        return arrdir;
    }
    static void Ex1_2(){
        
    }
}