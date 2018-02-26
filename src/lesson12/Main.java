package lesson12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("1");
        Person p2 = new Person("2");
        Person p3 = new Person("3");

        HashMap<Person, String> map = new HashMap<>();
        map.put(p1,"String1");
        map.put(p2,"String2");
        map.put(p3,"String3");


        for (Person person : map.keySet()) {
            System.out.println(person);
        }

        String value = map.get(p1);
        System.out.println(value);

//        for (String integer : map.values()) {
//            System.out.println(integer);
//        }
//
//        for (Map.Entry item : map.entrySet()) {
//            System.out.println(item.getKey() + " " + item.getValue());
//        }


    }
}
