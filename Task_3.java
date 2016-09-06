package ua.epam;

import java.util.Scanner; // scaner import

public class Main {

    public static void main(String[] args) {

        //task_1
        System.out.print("\nExample task_1\nEnter value: ");
        Scanner scan = new Scanner(System.in); //scaner object
        int even_NotEven = 2;
        int value = scan.nextInt();

        if (value % even_NotEven == 0){
            System.out.println("even number");
        } else
            System.out.println("not even number");


        //task_2
        System.out.println("\nExample task_2\nEnter double m and n: ");
        double m = scan.nextDouble();
        double n = scan.nextDouble();
        int border= 10;

        if ( (Math.abs(border - m)) < (Math.abs(border - n)) ){
            System.out.println("\ncloser m " + " m = " + (Math.abs(border - m)) + " n = " + (Math.abs(border - n)));
        } else
            System.out.println("closer n " + " m = " + (Math.abs(border - m)) + " n = " + (Math.abs(border - n)));


        //task_3
        int min = 100;
        int max = 1000;
        int value3 = (int) (min + Math.random() * (max - min)) ;

        System.out.println("\nExample task_3");

        if (value3 > max || value3 < min){
            System.out.println("error, unexpected value");
        } else
            System.out.println("random value = " + value3);

        int ten = 10;
        int soti  = value3 / min;
        int tmp = value3 % min;
        int desiati = tmp / ten;
        int odynytsi = tmp % ten;

        if ( soti > desiati && soti > odynytsi){
            System.out.println("max number = " + soti);
        } else
            if( desiati > soti && desiati > odynytsi){
                System.out.println("max number = " + desiati);
            } else
                if (soti == desiati || soti == odynytsi){
                    System.out.println("max number  = " + soti);
                } else
                    if (odynytsi == desiati || odynytsi == soti){
                        System.out.println("max number = " + odynytsi);
                    } else
                        if (soti == desiati && desiati == odynytsi){
                            System.out.println("max number = " + soti);
                        }else
                            System.out.println("max number = " + odynytsi);


        //task_4
        int minimum = 5;
        int maximum = 155;
        int borderMax = 100;
        int borderMin = 25;

        int interval = minimum + (int) (Math.random() * ((maximum - minimum) + 1)) ;

        System.out.println("\nExample task_4");
        System.out.println("Number with interval = " + interval);

        if (interval > borderMax || interval < borderMin){
            System.out.println("\nThe number " + interval +" is NOT contained in the range [25;100]");
        } else
            System.out.println("The number " + interval +" is contained in the range [25;100]");


        //task_5
        System.out.println("\nExample task_5");
        System.out.println( "Enter value: a , b , c: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println( "a = " + a + " b = " + b + " c = " + c);
        System.out.println( "Result");

        if ( a > b && a > c){
                if ( b > c){
                    System.out.println( c + " ," + b + " , " + a);
                } else
                    System.out.println( b + " ," + c + " , " + a);

        } else
            if ( b > a && b > c){
                if ( a > c){
                    System.out.println( c + " , " + a + " , " + b);
                } else
                    System.out.println( a + " , " + c + " , " + b);
            } else
                if (c > a && c > b){
                    if ( a > b){
                        System.out.println( b + " , " + a + " , " + c);
                    } else
                        System.out.println( a + " , " + b + " , " + c);
                }


        //task_5

        int minS = 0;
        int maxS = 28800;
        int hour = 3600;

        int timeS = minS + (int) (Math.random() * ((maxS - minS) + 1)) ;

        System.out.println("\nExample task_6");
        System.out.println("time in seconds = " + timeS);

        if ( (timeS / hour) < 1){ // 1 is 1 hour
            System.out.println("It has less than an hour");
        } else
            System.out.println("remaining time is " + timeS / hour + " hour(s)");



    }


}

