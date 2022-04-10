package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> randomInt = new ArrayList<>();
        randomInt.add(1);
        randomInt.add(1);
        randomInt.add(1);
        randomInt.add(1);
        randomInt.add(1);
        randomInt.add(1);
        randomInt.add(1);
        randomInt.add(1);
        randomInt.add(1);
        randomInt.add(1);
        System.out.println(randomInt);
        sumOfList(randomInt);


        ArrayList<String> randomWords = new ArrayList<>();
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String[] sentenceSplit = sentence.split(" ");
        ArrayList<String> strList = new ArrayList<String>(
                Arrays.asList(sentenceSplit));

        randomWords.add("candy");
        randomWords.add("im");
        randomWords.add("tryin");
        randomWords.add("its a lot");
//        printedWords(randomWords);
        printedWords(strList);



    }

    public static int sumOfList(ArrayList<Integer> list){
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            sum += list.get(i);
        }
        System.out.println(sum);
        return sum;
    }



    public static void printedWords(ArrayList<String> list){

        ArrayList<String> approvedWordLength = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Double searchedLength;

        System.out.println("Enter the word length you would like to search: ");
        searchedLength = input.nextDouble();

        for (String item : list) {
            if(item.length() == searchedLength){
                System.out.print(item + " ");
            }
        }
    }




}
