import java.util.Scanner;
class Input
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        //add more variables, at least 2 of each type:
        //double, float, short, String
        double popularRealValue = 2048;
        double popularValue = 10923;
        float realValue = 48.5f;
        float anotherRealValue = 974.12f;
        short anotherValue = 84;
        short anotherPopularValue = 34;
        String animalName = "Buddy";



        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();

        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        //add in input for all variables

        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );

        //add output for all variables


    }
}