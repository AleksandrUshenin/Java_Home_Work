package Lesson4;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Lesson_4
 */
public class Lesson_4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        list = ex1(list);
        System.out.println(list); 

        ex2(list);
        ex3();
    }
    private static LinkedList<String> ex1(LinkedList<String> list){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size() / 2; i++) {
            sb.append(list.get(i));
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, sb.toString());
            sb.delete(0, sb.length());
        }
        return list;
    }
    private static void ex2(LinkedList<String> list){
        Lesson4_2<String> myList = new Lesson4_2<String>(list);
        System.out.println(myList.getAll());
        
        myList.enqueue("six");
        System.out.println(myList.getAll());
        System.out.println(myList.dequeue());
        System.out.println(myList.getAll());
        System.out.println(myList.first());
        System.out.println(myList.getAll());
    }
    private static void ex3(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int sum = 0;
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            sum += iter.next();
        }
        System.out.println(sum);
    }
}