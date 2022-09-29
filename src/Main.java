import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Define Variables
        double inputC = 0;
        double outputF = 0;
        String trash;
        Scanner in = new Scanner(System.in);
        //Input Code
        System.out.print("Enter your temperature in Celsius: ");

        if(in.hasNextDouble())
        {
            // OK safe to read in a double
            inputC = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
            outputF = (inputC * 1.8) + 32;
            System.out.println("Your temperature translates to " + outputF + " degrees fahrenheit");
        }
        else
        {
            // Not a int can’t use nextInt() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nYou said your temperature was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);  // terminate the program
        }

    }
}