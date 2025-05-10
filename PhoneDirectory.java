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
