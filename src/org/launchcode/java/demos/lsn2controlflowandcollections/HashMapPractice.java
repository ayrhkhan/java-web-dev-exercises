package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newID;

        System.out.println("Enter your student IDs (or ENTER to finish):");


        do {

            System.out.print("Student iD: ");
            newID = input.nextInt();

            if (!newID.equals("")) {
                System.out.print("Name: ");
                String newName = input.nextLine();
                students.put(newID, newName);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newID.equals(""));

        System.out.println("\nClass roster:");

//        for (Map.Entry<Integer, String> student : students.entrySet()) {
//            System.out.println(student.getKey() + " (" + student.getValue() + ")");
//        }

    }
}