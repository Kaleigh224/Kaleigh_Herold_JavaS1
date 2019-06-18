package com.company;

import java.util.ArrayList;
import java.util.List;

public class ClassmatesList {
   private List<Classmate> classmates = new ArrayList<>();

   public void add(Classmate classmate) {
       classmates.add(classmate);
   }

   public Classmate get(int num) {
       return classmates.get(num);
   }

   public List<Classmate> getAll() {
       return classmates;
    }
}
