package com.ct.day2;

import java.util.HashMap;
import java.util.Map;
//task filter student who has above  75 marks 

public class Stram_Task_1 {
    public static void main(String[] args) {
        
        Map<String,Integer> students = new HashMap<>();
        students.put("Ram", 90);
        students.put("kishor", 70);
        students.put("Kiran", 30);
        students.put("Piyush", 50);

        // Stream over entrySet to access both name and marks
        students.entrySet().stream()
                .filter(entry -> entry.getValue() > 75)   // condition: pass marks > 35
                .map(Map.Entry::getKey)                   // extract only names
                .forEach(System.out::println);            // print names
    }
    
}