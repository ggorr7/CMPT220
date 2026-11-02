import java.util.Random;

public class Main {
    public static void main(String[] args) {

        student student1 = new student("Emily", "Senior", 4.0, 12);
        student student2 = new student("Declan", "Freshman", 3.0, 17);
        student student3 = new student("Anna", "Sophomore", 3.3, 21);
        student student4 = new student("Joey", "Senior", 3.8, 24);
        student student5 = new student("Liam", "Sophomore", 2.5, 19);

        student1.honor_roll();
        student2.honor_roll();
        student3.honor_roll();
        student4.honor_roll();
        student5.honor_roll();

        student1.free_lunch();
        student2.free_lunch();
        student3.free_lunch();
        student4.free_lunch();
        student5.free_lunch();
    }
}

// doing this assignment, I learned how to use Random to generate numbers in Java
// https://www.geeksforgeeks.org/java/generating-random-numbers-in-java/ 