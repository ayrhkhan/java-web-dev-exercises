package org.launchcode.java.studios.areaofacircle;

import org.launchcode.java.studios.areaofacircle.Circle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of a circle:");
        double radius;


        do{
            System.out.println("Please enter a positive decimal number: ");
            radius  = input.nextDouble();
            while (!input.hasNextDouble() ){
                System.out.println("that is a negative number");
                input.next();
            }
            radius  = input.nextDouble();
        }while (radius <= 0 );

//        do{
//            System.out.println("Please enter a positive decimal number: ");
//            radius  = input.nextDouble();
//            while (radius <= 0){
//                System.out.println("that is a negitive number");
//                radius  = input.nextDouble();
//                input.next();
//            }
//        }while (!input.hasNextDouble());



//        while (!input.hasNextDouble()){
//            System.out.println("This isn't a decimal, please enter another choice");
//            input.next();
//        }
//
//        radius  = input.nextDouble();
//
//        while (radius <= 0){
//            System.out.println("that is a negitive number");
//            input.next();
//        }

        Double area = Circle.getArea(radius);
        System.out.println("The are of a circle is of radius "+area);
        input.close();

    }




//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter radius of a circle:");
//        Double radius;
//
//        while (!input.hasNextDouble()){
//            System.out.println("This isn't a decimal, please enter another choice");
//            input.next();
//        }
//
//        radius  = input.nextDouble();
//
//        while (radius <= 0){
//            System.out.println("that is a negitive number");
//            input.next();
//        }
//
//        Double area = Circle.getArea(radius);
//        System.out.println("The are of a circle is of radius "+area);
//        input.close();
//
//    }



    //    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter radius of a circle:");
//        Double radius;
//
////        Double area = radius * radius * 3.14;
////        boolean radius = input.hasNextDouble();
//
//        while (!input.hasNextDouble()){
//            System.out.println("This isn't a decimal, please enter another choice");
////            input.next();
//        }
//        radius  = input.nextDouble();
////        System.out.println(radius);
//
////        if(radius <= 0){
////            System.out.println("The radius is invalid:");
////
////        }else{
////            Double area = Circle.getArea(radius);
////            System.out.println("The are of a circle is of radius "+area);
////        }
//        Double area = Circle.getArea(radius);
//        System.out.println("The are of a circle is of radius "+area);
//        input.close();
//
//    }


}
