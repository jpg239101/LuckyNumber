package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner kb = new Scanner(System.in);
        int test;

        do {
            System.out.println("What is your name");
            String name = kb.nextLine();

            SquareR me = new SquareR(name);

            System.out.println(me.name + " " + me.squ() + " press 0 to exit and 1 for a new randomNumber or 2 to enter another name");
            test = kb.nextInt();

            do {


                if (test == 1) {
                    System.out.println(me.name + " Your new number is " + me.squ() + " press 0 to exit and 1 for a new randomNumber or 2 to enter another name");
                    test = kb.nextInt();
                }

            }while (test == 1);
        }while (test == 2);



    }
}
