/*
Take the given array and keep track of:
1. Any duplicate numbers
2. How many times the duplicate numbers appear
3. Print out those duplicate numbers with how many times they appear
*/


public class Main {
    public static void main(String[] args) {

        //Don't let the size of this scare you! no matter how big an array is, it all works the same!
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10, 5566, 87,93,17,10,2,87, 267,3176,3,82};
        //you cannot use the array util. Do this one by hand :(

        // iterate through each number in the array 
        for (int i = 0; i < myArray.length; i++) {

            // initial count is zero
            int count = 0; 

            // set checked to false initially
            boolean checked = false; 

            // determine if a number has already been checked for duplicates
            // this number would have already shown up earlier 
            for (int j = 0; j < i; j++) { 
                if (myArray[i] == myArray[j]) {
                    checked = true;
                }
            }

            // if the number has already been checked, skip counting it again
            if (checked){
                continue;
            }
  
            // otherwise count how many times the current number appears in the array
            for (int k = 0; k < myArray.length; k++){
                if(myArray[i] == myArray[k]){
                    count++; 
                }
            }
            
            // print out duplicates and their relative counts 
            if (count>1){
                System.out.println("The number " + myArray[i] + " is a duplicate and appears " + count + " times"); 
            }
        }
            
        // i learned that i don't like nested loops
        // and that I should carefully read the Brightspace instructions before starting an assignment, number 5 was the hardest to figure out :(
        // on a more serious note, nested loops can be used to do a lot, but they aren't always the most efficient solution

    }
} 
