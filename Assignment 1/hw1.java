// always start with importing our scanner so we can use it!

import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        //finish this one for me by receiving and printing the user's age back to them
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you? ");
        String ageInput = sc.nextLine();
        System.out.println("Hello! You are " + ageInput + " years old."); 

        //can you do some math for me? take these variables and print out the sum of them!
        int num1 = 10;
        int num2 = 37;
        System.out.println(num1 + num2);
        // What I learned: 
        // If you want to record a numerical input, you can still record it as a string. This might be helpful in case the user inputs 10 as "ten." 
        // Java is a very clunky language. You have to be very careful with your syntax.

 }
}
