package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Arrays;

public class Conditionals {

    public static void main(String[] args) {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[]changedSpace = sentence.split(" ");
        System.out.println(Arrays.toString(changedSpace));

        String[]changedComma = sentence.split(".");
        System.out.println(Arrays.toString(changedComma));

        String[]changedEye = sentence.split("\\.");
        System.out.println(Arrays.toString(changedEye));


//        int[]  randomInts = { 1, 1, 2, 3, 5, 8};
//        for(int i : randomInts){
//            if(i % 2 == 1){
//                System.out.println(i);
//            }
//        }


    }
}
