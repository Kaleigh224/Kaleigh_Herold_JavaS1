package com.company;

import java.util.Arrays;

public class ArrayFunReverseIt {
    public static void main(String[] args) {
        int [] ogArr = {1, 2, 3, 4, 5};
        int [] reverseArr = new int [ogArr.length];
        int index = 0;

        for(int i = ogArr.length - 1; i >= 0; i--) {
            reverseArr[index] = ogArr[i];
            index++;
        }
        System.out.println(Arrays.toString(ogArr));
        System.out.println(Arrays.toString(reverseArr));
    }
}
