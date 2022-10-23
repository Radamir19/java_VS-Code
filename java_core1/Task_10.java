package java_core1;


import java.util.*;

public class Task_10 {
    public static void main(String[] args) {
        taskOne();
        PhoneBook.taskTwo();
    }

    public static void taskOne() {
        String[] strings = {"Hello", "Hola", "Hi", "Sasha", "Hi", "Alex", "Hola", "George", "Alex", "Night"};
        Map<String, Integer> hm = new HashMap<>();
        for (String string: strings) {
            hm.put(string,hm.getOrDefault(string,0) + 1);
        }
        System.out.println(hm);
    }
}

class PhoneBook{
    public static void taskTwo(){
        Map<String,List<String>> name = new LinkedHashMap<>();
        List<String> phone = new ArrayList<>();
        phone.add("8-999-888-77-66");
        phone.add("8-999-777-66-55");
        name.put("Alex",phone);

        System.out.println(name.get("Alex"));
    }
}