package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    private Map<String, List<String>> map;

    public PhoneBook(Map<String, List<String>> map) {
        this.map = map;

    }

    public PhoneBook() {
        this.map = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        ArrayList<String> currentNumbers = new ArrayList<>();
        currentNumbers.add(phoneNumber);
        map.put(name, currentNumbers);
    }

    public void addAll(String name, String... phoneNumbers) {
        ArrayList<String> currentNumbers = new ArrayList<>();
        for(String phoneNumber : phoneNumbers){
            currentNumbers.add(phoneNumber);
            map.put(name,currentNumbers);
        }
    }

    public void remove(String name) {
        map.remove(name);
    }

    public Boolean hasEntry(String name) {
        return map.containsKey(name);
    }

    public List<String> lookup(String name) {
        return map.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        HashSet<String> names = new HashSet<>();
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            if(Objects.equals(phoneNumber,entry.getValue())){
                names.add(entry.getKey());
            }
        }
        System.out.println(names.toString());
        String name = names.toString();
        return name;
    }

    public List<String> getAllContactNames() {
        Set<String> namesSet = map.keySet();
        ArrayList<String> namesList = new ArrayList<>();
        for(String name : namesSet){
            namesList.add(name);
        }
        namesList.sort(Comparator.comparing(String::toString).reversed());
        return namesList;
    }

    public Map<String, List<String>> getMap() {
        return map;
    }
}