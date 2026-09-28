/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
!!!!!!
Look into things like charAt- DO NOT NAME YOUR VARIABLE "REVERSED". If you do, automatic 0 points!!!!!!
!!!!!!!
if you're confused reach out!
 */

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get the string 
        System.out.println("What is your favorite word?");
        String word = sc.nextLine();
        // I googled how to break a string into its characters
        // it took a mixture of google and trial and error to figure this out
        // this next line converts the string into an array of characters
        char[] letters = word.toCharArray();
        // get the length of the array of characters
        int length = letters.length;

        // itterate over each character in the array 
        // the first item in the array is at index 0 
        // the last item in the array is at index length - 1
        // therefore, the loop should start at 0 and go up to length - 1
        for (int i = 0; i < length; i++){
            // print the character as a new line
            System.out.println(letters[i]);
        }

    }
}
