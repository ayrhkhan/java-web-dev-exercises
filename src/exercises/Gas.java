package exercises;

import java.util.Scanner;

public class Gas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles they have driven:");
        Double milesDriven = input.nextDouble();
        System.out.println("the amount of gas they’ve consumed (in gallons):");
        Double gasConsumed = input.nextDouble();
        System.out.println(milesDriven / gasConsumed);
    }


}


//    miles driven ÷ gallons used = mpg