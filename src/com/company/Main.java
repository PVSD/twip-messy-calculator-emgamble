package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner Int1Reader = new Scanner(System.in);
        System.out.println("What is your first number? ");
        double a = Int1Reader.nextInt();

        Scanner Int2Reader = new Scanner(System.in);
        System.out.println("What is your second number? ");
        double x = Int2Reader.nextInt();

        System.out.println("Would you like to add, subtract, multiply, or divide? ");
        Scanner ActionReader = new Scanner(System.in);
        String c = ActionReader.nextLine();
        if (c.equals ("add"))
            System.out.println("Your answer is " + Math.sqrt(a + x));
        else if (c.equals("subtract"))
            System.out.println("Your answer is " + Math.sqrt(a - x));
        else if (c.equals ("multiply"))
            System.out.println("Your answer is " + Math.sqrt(a * x));
        else
            System.out.println("Your answer is " + Math.sqrt(a/x));

        Scanner Ans1Reader = new Scanner(System.in);
        Scanner Ans2Reader = new Scanner(System.in);
        System.out.println("Are you satisfied with your results?");
        String e = Ans1Reader.nextLine();
        if (e.equals("no"))
            System.out.println("Can you identify which math class method the real answer went through?");
            String y = Ans2Reader.nextLine();
                    if (y.equals("sqrt"))
                        System.out.println("Congratulations and Goodbye!");
        else
            System.out.println("Well you shouldn't be satisfied because that's not the correct answer. Whatever bye.");








    }
}
