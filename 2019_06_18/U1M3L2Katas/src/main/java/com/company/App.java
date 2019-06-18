package com.company;

import java.util.*;

public class App {
    public static void main(String[] args) {

    }

    public static void printKeys(Map<String, String> map) {

        Set<String> getKeys = map.keySet();
        Iterator<String> iteratorString = getKeys.iterator()
        for(Map.Entry<String, String> myEntry: map.entrySet()) {
            System.out.println(myEntry.getKey());
        }
    }

    public static void printValues(Map<String, String> map) {

        Collection<String> values = map.values();
        Iterator<String> iteratorValues = values.iterator();
        while(iteratorValues.hasNext()) {
            System.out.println(iteratorValues.next());
        }
    }

    public static void printKeysAndValues(Map<String, String> map) {
        for(Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public Map mapFun(Map<String, Integer> map) {
        map.put("Ford Explorer", 2012);
        map.put("Smart Fortwo", 2013);
        map.remove("Jeep Wrangler");
        return map;
    }

    public Map carsList (List<Car> newCar) {
        Map<String, List<Car>> finalOutput = new HashMap<>();

        List<Car> toyota = new ArrayList<>();
        List<Car> ford = new ArrayList<>();
        List<Car> honda = new ArrayList<>();

        for(Car userCar: newCar) {
            if(userCar.getMake() == "Toyota") {
                toyota.add(userCar);
            }else if (userCar.getMake() == "Ford") {
                ford.add(userCar);
            }else if (userCar.getMake() == "Honda") {
                honda.add(userCar);
            }
        }

        finalOutput.put("Toyota", toyota);
        finalOutput.put("Ford", ford);
        finalOutput.put("Honda", honda);
    }
    
}
