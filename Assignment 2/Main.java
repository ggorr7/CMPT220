//always start with importing our scanner so we can use it!
import java.util.Scanner;

/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class Main {
    public static void main(String[] args) {

        //first question 
        int score = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the capital of Djibouti?"); 
        String capital = sc.nextLine();
        if (capital.equals("Djibouti City")) {
            System.out.println("Correct!");
            score = score + 1;
        } else {
            System.out.println("Incorrect! The correct answer is Djibouti City.");
        }

        // second question 
        System.out.println("What is the largest country in Africa??"); 
        String country = sc.nextLine();
        if (country.equals("Algeria")) {
            System.out.println("Correct!");
            score = score + 1;
        } else {
            System.out.println("Incorrect! The correct answer is Algeria.");
        }

        // third question 
        System.out.println("What's the name of the tallest mountain in Africa?"); 
        String mountain = sc.nextLine();
        if (mountain.equals("Mount Kilimanjaro")) {
            System.out.println("Correct!");
            score = score + 1;
        } else {
            System.out.println("Incorrect! The correct answer is Mount Kilimanjaro.");
        }
        
        System.out.println("Your final score is " + score + " out of 3.");

    }
}