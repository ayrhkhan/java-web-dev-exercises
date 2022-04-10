package exercises;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Scanner myScanner = new Scanner();


        System.out.println("Enter rectangle length:");
        Double length = input.nextDouble();
        System.out.println("Enter rectangle width:");
        Double width = input.nextDouble();

        if(length <= 0 || width <= 0){
            System.out.println("Error! try again:");
        }else if(length == null || width == null){
            System.out.println("Error! try again:");
        }else{
            System.out.println(length * width);
        }
    }




}
