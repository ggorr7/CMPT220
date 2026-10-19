/*
Referencing your homework from https://github.com/melissachodziutko/CMPT-220/blob/main/Assignment%203/Debug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;

public class debug {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your first number to be added");
    int firstInput = sc.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = sc.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();

    System.out.println("Enter a third number to find the factorial of");
    int number = sc.nextInt();
    System.out.println(factorial(number));
    

    System.out.println("Enter a fourth number and I will find the sum of all odd numbers up to that number");
    int number2 = sc.nextInt();
    System.out.println(skip_add(number2));

    sc.nextLine();
    System.out.println("What is your favorite word? I'll print it in reverse!");
    String word = sc.nextLine();
    System.out.println(reverse(word));
    } 
    
  
    public static int add(int zyx, int tuv){
        return(zyx + tuv);
    }
  
    public static void printDog(){
        System.out.println("Dog");
    }

    public static int factorial (int num){
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int skip_add (int num){ 
        int sum = 0;
        for (int i = 1; i <= num; i=i+2){
            sum = sum + i;
        }
        return sum;
    }

    public static String reverse (String word){
        char[] letters = word.toCharArray();
        int length = letters.length;
        char[] word_reversed = new char[length];
        for (int i = length - 1; i >= 0; i--){
            word_reversed[length - 1 - i] = letters[i];
        }
        return new String(word_reversed);
    } 

}   

