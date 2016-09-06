package ua.epam;

import java.util.Scanner; // scaner import

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //scaner object

        //task_1
        int n = 25;
        int const_ten = 10;
        int min = 100;
        int max = 1000;

        int sumN = getSumN(n, const_ten);
        System.out.println ( "Example task_1\n n = " + n + " and sumN = " + sumN);


        //task_2
        System.out.print("\nEnter three digit number: ");

        int value2 = scan.nextInt();

        if (value2 >= min && value2 < max){

            int desiati = value2 % min;
            int sum1 = value2 / min + desiati / const_ten + desiati % const_ten;

            System.out.println ("sum1 = " + sum1);
        } else
            System.out.println("Error, enter value > 99 and value < 1000");


        //task_3
        System.out.print("\nEnter two digit number: ");
        int value = scan.nextInt();
        if (value < min){
            int sum = value / const_ten + value % const_ten;
            System.out.println ("sum = " + sum);
        } else
            System.out.println("Error, enter value < 100");


        //task_4
       System.out.print("\nEnter value for round: ");
         double valueD = scan.nextDouble();
         int roundV = (int)Math.round(valueD);
         System.out.println("round value = " + roundV);

        System.out.println("\nStatic numbers for round: ");
        double a = 12.254;
        double b = 0.999;
        double c = 31.000051;

        System.out.println("\n a = " + a + " b = " + " c = " + c);
        System.out.println("\nround");
        System.out.println("a = " + Math.round(a) + " b = " + Math.round(b) + " c = " + Math.round(c));
        System.out.println("\nceil");
        System.out.println("a = " + Math.ceil(a) + " b = " + Math.ceil(b) + " c = " + Math.ceil(c));
        System.out.println("\nfloor");
        System.out.println("a = " + Math.floor(a) + " b = " + Math.floor(b) + " c = " + Math.floor(c));
    }

    public static int getSumN(int n, int const_ten) {
        return n / const_ten + n % const_ten;
    }


}

