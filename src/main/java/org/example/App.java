package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int cAge;
        int rAge;
        int x;



        Scanner currentAge = new Scanner(System.in);
        System.out.println("How old are you?");
        cAge = currentAge.nextInt();

        Scanner retirementAge = new Scanner(System.in);
        System.out.println("What age do you want to retire?");
        rAge = retirementAge.nextInt();

        x=rAge-cAge;

        System.out.println("You have " + x + " years left until you can retire.");

        int y=x+2021;

        System.out.println("It's 2021, so you can retire in " + y);



    }
}
