package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class characterCount {
        public static void main(String[] args) {

            HashMap<Character, Integer> counts = new HashMap<>();
            Scanner input = new Scanner(System.in);
            Integer characterCounts = 1;


//            }
            String oneWord = "here";
            String sentenceToCount = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
            char[] charactersInString = sentenceToCount.toLowerCase().toCharArray();

            for(char character : charactersInString ){

                boolean isLetter = Character.isLetter(character);
                    if(isLetter) {
                        if (counts.containsKey(character)) {
                            counts.put(character, counts.get(character) + 1);
                        }
                    else{
                        counts.put(character,1);
                    }

                }


            }
            for (Map.Entry<Character, Integer> count : counts.entrySet()) {
                System.out.println(count.getKey() + ":" + count.getValue());
            }








//            for (int i = 0; i < charactersInString.length; i++) {
//                System.out.println(charactersInString[i]);
//
//                if(!counts.containsKey(charactersInString[i])){
//                    characterCounts++;
//                    counts.put(charactersInString[i],characterCounts);
//                    continue;
//                    System.out.println(characterCounts);
//                    System.out.println(charactersInString[i]);
//                }else{
//                    for (int count : counts.values()) {
//                        characterCounts += count;
//                        System.out.println(count);
//                    }
//                }
//            }
//            for (Map.Entry<Character, Integer> count : counts.entrySet()) {
//                System.out.println(count.getKey() + ":" + count.getValue());
//            }


            System.out.print(counts);
        }
    }
