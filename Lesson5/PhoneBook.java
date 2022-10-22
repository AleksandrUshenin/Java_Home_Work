package Lesson5;
import java.util.*;

public class PhoneBook {
    private HashMap<String, String[]> users;

    public PhoneBook(){
        users = new HashMap<>();
    }

    public void add(String name, String number){
        if (users.containsKey(name)){
            var data = users.get(name);
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null){
                    data[i] = number;
                    users.put(name, data);
                    return;
                }
            }
            String[] data2 = new String[data.length * 2];
            data2 = Arrays.copyOf(data, data.length);
            users.put(name, data2);
            return;
        }
        String[] num = new String[10];
        num[0] = number;
        users.put(name, num);
    }
    public String[] getUser(String name){
        var data = users.get(name);
        return data;
    }
    public String getUsesrLine(String name){
        StringBuilder sb = new StringBuilder();
        for (String data : getUser(name)) {
            if (data != null){
                sb.append(data + " ");
            }
        }
        return sb.toString();
    }
}
