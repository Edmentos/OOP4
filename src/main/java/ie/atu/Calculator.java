package ie.atu;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
       add();
       delete();
       divide();
       multiply();
    }

    public static void add() // This code makes it so that the calculator can add
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please input your second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber; // First number + the second number = total
        System.out.println("The total is: " + total);
    }

    public static void delete() // This code makes it so that the calculator can subtract
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please input your second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber; // First number - the second number = total
        System.out.println("The total is: " + total);
    }

    public static void divide() // This code makes it so that the calculator can divide
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please input your second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber / secondNumber; // First number / the second number = total
        System.out.println("The total is: " + total);
    }

    public static void multiply() // This code makes it so that the calculator can divide
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please input your second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber; // First number * the second number = total
        System.out.println("The total is: " + total);
    }









}
