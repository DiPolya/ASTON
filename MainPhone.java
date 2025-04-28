package org.example;

import java.util.*;

class PhoneDirectory{
    private Map<String,List<String>> phoneDirectory = new HashMap<>();
    //Метод добавляет записи
    public void add(String surname, String phoneNumber){
        if (!phoneDirectory.containsKey(surname)){
            phoneDirectory.put(surname, new ArrayList<>());
        }
        phoneDirectory.get(surname).add(phoneNumber);
    }
    //Метод ищет номера телефонов по фамилии
    public List<String> get(String surname){
        if (phoneDirectory.containsKey(surname)){
            return phoneDirectory.get(surname);
        }
        else { return Collections.emptyList();}
    }
}

public class MainPhone {
    public static void main (String[] args){
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Краснова", "+7(959)237-42-70");
        phoneDirectory.add("Петров", "+7(959)210-92-11");
        phoneDirectory.add("Васильев", "+7(959)237-42-33");
        phoneDirectory.add("Петров", "+7(959)237-45-55");
        phoneDirectory.add("Краснова", "+7(959)237-42-28");

        System.out.println("Номера телефонов по фамилии Петров: " + phoneDirectory.get("Петров"));
        System.out.println("Номера телефонов по фамилии Краснова: " + phoneDirectory.get("Краснова"));
        System.out.println("Номера телефонов по фамилии Васильев: " + phoneDirectory.get("Васильев"));
        System.out.println("Номера телефонов по фамилии Журавлёв: " + phoneDirectory.get("Журавлёв"));
    }
}