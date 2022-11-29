package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//Define integer variables a and b.
//Read values a and b from the console and calculate: a+b, a-b, a*b, a/b.
//Output results on the console.

        float a = 5f;
        float b = 10f;
        System.out.println ("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));


//Output question “How are you?“.
//Define string variable answer.
//Read value answer and output on the console: “You are (answer)".

        Scanner scan1 = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = scan1.nextLine();
        System.out.println("You are " + answer);


//Read 3 variables of char type.
//Write message: “You enter (first char), (second char), (3 char)”

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter three chars: ");
        char first = scan2.next().charAt(0);
        char second = scan2.next().charAt(0);
        char third = scan2.next().charAt(0);
        System.out.println("You enter - " + first + "," + second + "," + third);


//Enter 2 integer numbers.
//Check if they are both positive – use bool expression

        int c = 10, d = 8;
        boolean isTrue = true;
        if (c % 2 == 0 && d % 2 == 0) {
            System.out.println(isTrue);
        } else {
            System.out.println(isTrue = false);
        }


//Define string name and integer age.
//Output question "What is your name?";
//Read value name and output next question: "How old are you, (name)?".
//Read value age and output whole information

        Scanner scan3 = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan3.nextLine();
        System.out.println("How old are you, " + name + "?");
        int age = scan3.nextInt();
        System.out.println("Your name is " + name + " and you are " + age + " years old");

    }
}