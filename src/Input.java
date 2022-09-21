

import java.util.Scanner;

public class Input
{
    public  static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("What is your name?");
        String name = keyboard.nextLine();

        System.out.println("What school do you go to?");
        String school = keyboard.nextLine();

        System.out.println("Enter as much of Pi as you know?");
        double piVal = keyboard.nextDouble();

        keyboard.nextLine();

        System.out.println("How old are you?");
        double age = keyboard.nextDouble();

        keyboard.nextLine();

        System.out.println("A number between 1 and 32 that you like.");
        short like = keyboard.nextShort();

        System.out.println("A number between 1 and 32 that you hate.");
        short hate = keyboard.nextShort();

        System.out.println("What is the biggest number you can think of?");
        float longest = keyboard.nextFloat();

        System.out.println("What is the shortest number you can think of?");
        float shortest = keyboard.nextFloat();

        System.out.println("Who is your favorite celebrity?");
        int celeb = keyboard.nextInt();

        System.out.println("Do you have siblings?" );
        int yesNo = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println("Your Name is " + name);
        System.out.println("You attend " + school);
        System.out.println("You know " + piVal + " is Pi");
        System.out.println("You are :: " + age);
        System.out.println("You like the number :: " + like);
        System.out.println("You don't like the number :: " + hate);
        System.out.println("The biggest number you know is :: " + longest);
        System.out.println("The biggest number you know is :: " + shortest);
        System.out.println("Your favorite celebrity is :: " + celeb);
        System.out.println("Do you have siblings? :: " + yesNo );
    }

}
