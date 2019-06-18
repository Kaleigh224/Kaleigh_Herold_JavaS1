package com.company;

import java.util.*;

public class SetIterator {
    public void numberSet(int num1, int num2, int num3, int num4, int num5) {
        Set<Integer> newSet = new HashSet<>();

        newSet.add(num1);
        newSet.add(num2);
        newSet.add(num3);
        newSet.add(num4);
        newSet.add(num5);

        Iterator<Integer> setIterator = newSet.iterator();

        while(setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }
    }
}
