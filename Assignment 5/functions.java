/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("What is the total of your bill?");
    double total = sc.nextDouble();
    System.out.println("How much would you like to tip?");
    double tip = sc.nextDouble();
    double tip_amount = tip(total, tip);
    double final_total = total + tip_amount;
    System.out.println("Your tip amount is $" + tip_amount + " and your total bill is $" + final_total);
    }

    public static double tip (double bill, double percent){
        return bill * percent * .01;
    }
   
}
