package com.zipcodewilmington.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        return map.containsValue(name);
    }

    public List<String> lookup(String name) {
        return map.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
    return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return map;
    }
}
