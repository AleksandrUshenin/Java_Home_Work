package Lesson5;

import java.util.*;

/**
 * Start
 */
public class Start {
    public static void main(String[] args) {
        PhoneBook ph = new PhoneBook();
        ph.add("user", "123");
        ph.add("user", "456");
        ph.add("admin", "789");
        System.out.println(ph.getUsesrLine("user"));
        System.out.println();

        ex2();

        ex3();
    }
    static void ex2(){
        //Users users = new Users();
        List<String> users = new LinkedList<>();
        users.add("Иван Иванов");//4
        users.add("Светлана Петрова");
        users.add("Кристина Белова");
        users.add("Анна Мусина");//3
        users.add("Анна Крутова");
        users.add("Иван Юрин");
        users.add("Петр Лыков");//3
        users.add("Павел Чернов");
        users.add("Петр Чернышов");
        users.add("Мария Федотова");
        users.add("Марина Светлова");
        users.add("Мария Савина");
        users.add("Мария Рыкова");//3
        users.add("Марина Лугова");//2
        users.add("Анна Владимировна");
        users.add("Иван Мечников");
        users.add("Петр Петин");
        users.add("Иван Ежов");
        
        System.out.println(ex2_sort(users));
    }
    static String ex2_sort(List<String> users){
        Map<Integer, ArrayList<String>> map3 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer k1, Integer k2){
                return Integer.compare(k2, k1);
            }
        });

        for (int i = 0; i < users.size(); i++) {

            var data22 = map3.values();
            boolean reez2222 = true;
            for (var datas : data22) {
                if (datas.contains(users.get(i).split(" ")[0])){
                    reez2222 = false;
                }
            }

            if (reez2222){
                for (int j = i + 1; j < users.size(); j++) {
                    if(users.get(i).split(" ")[0].equals(users.get(j).split(" ")[0])){
                        String re = users.get(i).split(" ")[0];
                        String re2 = users.get(j).split(" ")[0];
    
                        var data = map3.values();
                        //.contains(users.get(i).split(" ")[0]);
                        boolean reez2 = false;
                        for (var datas : data) {
                            if (datas.contains(users.get(j).split(" ")[0])){
                                reez2 = true;
                            }
                        }
    
                        //if (!map3.containsValue(users.get(i).split(" ")[0])){
                        //если нет в списке 
                        if (!reez2){
                            if(!map3.containsKey(2)){
                                ArrayList<String> list = new ArrayList<>();
                                list.add(users.get(i).split(" ")[0]);
                                map3.put(2, list);
                            }
                            else {
                                ArrayList<String> list = map3.get(2);
                                list.add(users.get(i).split(" ")[0]);
                            }
                        }
                        else {//если есть в списке 
                            boolean raz = true;
                            int index = 2;
                            while (raz){
                                ArrayList<String> list = map3.get(index);
    
                                if (list != null){
    
                                    if (list.contains(users.get(i).split(" ")[0])){
    
                                        list.remove(list.indexOf(users.get(i).split(" ")[0]));
    
                                        if (map3.containsKey(index + 1)){
                                            ArrayList<String> llist = map3.get(index + 1);
                                            llist.add(users.get(i).split(" ")[0]);
                                            raz = false;
                                        }
                                        else{
                                            ArrayList<String> llist = new ArrayList<>();
                                            llist.add(users.get(i).split(" ")[0]);
                                            map3.put(index + 1, llist);
                                            raz = false;
                                        }
                                    }
                                    index++;
                                    if (index > users.size())
                                    {
                                        raz = false;
                                    }
                                }
                                else{
                                    raz = false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return map3.toString();
    }
    static void ex3(){
        MapBilder mb = new MapBilder();
        mb.add(new int[] { 11, 12, 10, 9, 16, 15, 18, 6, 7, 5});
        System.out.println("11, 12, 10, 9, 16, 15, 18, 6, 7, 5");
        System.out.println(mb.getSorter());
    }
}   