package Lesson_2;
import java.io.*;
import java.util.logging.*;
import java.util.List;

/**
 * Start
 */
public class Start {
    public static void main(String[] args) {
        Ex12(Ex1());
        Ex21(Ex1());
        Ex30();
    }
    private static String[] Ex1(){
        String dir = System.getProperty("user.dir");
        File file = new File(dir);
        File[] files = file.listFiles();
        String[] res = new String[files.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = files[i].getName();
        }
        return res;
    }
    private static void  Ex12(String[] files) {
        try(FileWriter fw = new FileWriter("file.txt", false)) {
            for (String line : files) {
                fw.write(line);
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception ex){
            Logger log = Logger.getLogger(Start.class.getName());
            log.setLevel(Level.INFO);

            try {
                FileHandler fh = new FileHandler("log.txt");
                log.addHandler(fh);
                SimpleFormatter sf = new SimpleFormatter();
                fh.setFormatter(sf);
                log.log(Level.WARNING, ex.getMessage());
                log.info(ex.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            //ConsoleHandler ch = new ConsoleHandler();
            //ch.setFormatter(sf);

            //System.out.println(ex.getMessage());
        }
    }
    private static File[] Ex2(){
        String dir = System.getProperty("user.dir");
        File file = new File(dir);
        File[] files = file.listFiles();
        return  files;
    }
    private static void Ex21(String[] files){
        for (String Sfile : files) {
            var f = Sfile.split("\\.");
            if (f.length > 1 && f[0].length() > 0){
                System.out.printf("Расширение файла: %s\n", f[f.length - 1]);

            }
        }
    }
    private static void Ex30(){
        StringBuilder data = new StringBuilder(6);
        data.append("name:'Ivanov', country:'Russia', city:'Moscow', age:'null'");
        data.append("name:'Igor', country:'Russia', city:'Kirovsk', age:'15'");
        data.append("name:'Alexandr', country:'Russia', city:'London', age:'32'");
        data.append("name:'Marina', country:'Russia', city:'Moscow', age:'null'");
        data.append("name:'Rita', country:'Belarus', city:'Saint-Petersburg', age:'41'");
        data.append("name:'Anna', country:'Russia', city:'null', age:'25'");
        data.append("name:'Elisaveta', country:'null', city:'London', age:'97'");

        StringBuilder sql = new StringBuilder("select * from students where");
        sql.append("name Marina");
        System.out.println(Ex3(sql.toString(), data.toString()));

        sql = new StringBuilder("select * from students where");
        sql.append("country Belarus");
        System.out.println(Ex3(sql.toString(), data.toString()));

        sql = new StringBuilder("select * from students where");
        sql.append("age 32");
        System.out.println(Ex3(sql.toString(), data.toString()));

        sql = new StringBuilder("select * from students where");
        sql.append("age 97");
        System.out.println(Ex3(sql.toString(), data.toString()));
    }
    private static String Ex3(String sql, String data) {
        String search = sql.split("where")[1].split(" ")[1];
        String[] datas = data.split("name");
        StringBuilder result = new StringBuilder();

        for (String line : datas) {
            if (line.indexOf(search) > 0) {
                //System.out.println(line);
                result.append("name");
                datas = line.split(",");
                for (int i = 0; i < datas.length; i++) {
                    result.append(Ex32(datas[i]));
                }
                Ex31(result, "'", false);
                Ex31(result, ":", true);
                break;
            }
        }
        return result.toString();
    }
    private static void  Ex31(StringBuilder result, String znak, boolean add){
        int index = result.indexOf(znak);
        while (index > 0){
            //result.delete(index, index + 1);
            if (!add){
                result.deleteCharAt(index);
            }else {
                result.setCharAt(index, '=');
            }
            index = result.indexOf(znak);
        }
    }
    private static String Ex32(String result){
        if(result.indexOf("null") > 0){
            result = "";
        }
        return result;
    }
}