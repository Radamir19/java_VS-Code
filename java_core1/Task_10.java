package java_core1;

import java.util.*;

public class Task_10 {
    public static void main(String[] args) {
        Phonebook.secondMethod();
        Work.firstMethod();
    }
}

class Work
{
    public static void firstMethod(){
            Map<String, Integer> hm = new HashMap<>();
            String[] words = {
                    "Coffee", "Potato", "Alpha",
                    "Cheese", "Beta", "Humster",
                    "Dog", "Cat", "Java",
                    "Yava", "Kent", "Coffee",
                    "Dog", "Beta", "Humster",
                    "Cat", "Java", "Yava", "Dog"
            };

            for (int i = 0; i < words.length; i++) {
                if (hm.containsKey(words[i]))
                    hm.put(words[i], hm.get(words[i]) + 1);
                else
                    hm.put(words[i], 1);
            }
            System.out.println(hm);
    }
}

class Phonebook{
    public static void secondMethod() {
        Map<String, List<String>> name = new LinkedHashMap<>();
        List<String> phone = new ArrayList<>();
        phone.add("8-977-132-21-22");
        phone.add("8-977-132-21-20");
        name.put("Petr",phone);

        System.out.println(name.get("Petr"));
    }
}
