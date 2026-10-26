import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get initial information from user (current gpa and number of completed credits)

        System.out.println("What is your current GPA?");
        double current_gpa = scanner.nextDouble();

        System.out.println("How many credits have you already completed? (not including credits in process now)");
        int completed_credits = scanner.nextInt();

        System.out.println("How many courses are you taking right now?");
        int number_courses = scanner.nextInt();

        // explain what information is needed from user to calculate gpa 
        System.out.println("Now I need to know your anticipated grades and the number of credits for each course.");
        System.out.println("All possible anticipated grades are as follows: A, A-, B+, B, B-, C+, C, C-, D+, D, D-, or F");
        System.out.println("Please enter the following information:");

        // create variables to store the total number of points and credits for the semester
        double semester_gpa = 0;
        int semester_credits = 0;

        // loop through the number of courses to get grades and credits from the user
        for (int i = 0; i < number_courses; i++) {
            System.out.print("Enter your anticipated grade for course " + (i + 1) + ": ");
            String grade = scanner.next();
            System.out.print("How many credits is course " + (i + 1) + "? ");
            int credits = scanner.nextInt();

            // add the number of credits to the total number of credits for the semester
            semester_credits = semester_credits + credits;

            // calculate the number of points for the course based on the grade and number of credits 
            // and add it to the total number of points for the semester
            if (grade.equalsIgnoreCase("A")) {
                semester_gpa = semester_gpa + (4.0 * credits);
            } else if (grade.equalsIgnoreCase("A-")) {
                semester_gpa = semester_gpa + (3.7 * credits);
            } else if (grade.equalsIgnoreCase("B+")) {
                semester_gpa = semester_gpa + (3.3 * credits);
            } else if (grade.equalsIgnoreCase("B")) {
                semester_gpa = semester_gpa + (3.0 * credits);
            } else if (grade.equalsIgnoreCase("B-")) {
                semester_gpa = semester_gpa + (2.7 * credits);
            } else if (grade.equalsIgnoreCase("C+")) {
                semester_gpa = semester_gpa + (2.3 * credits);
            } else if (grade.equalsIgnoreCase("C")) {
                semester_gpa = semester_gpa + (2.0 * credits);
            } else if (grade.equalsIgnoreCase("C-")) {
                semester_gpa = semester_gpa + (1.7 * credits);
            } else if (grade.equalsIgnoreCase("D+")) {
                semester_gpa = semester_gpa + (1.3 * credits);
            } else if (grade.equalsIgnoreCase("D")) {
                semester_gpa = semester_gpa + (1.0 * credits);
            } else if (grade.equalsIgnoreCase("D-")) {
                semester_gpa = semester_gpa + (0.7 * credits);
            } else {
                semester_gpa = semester_gpa + (0.0 * credits);
            } 
        } 

        // calculate the user's anticipated gpa and print it out 
        System.out.println("Your anticipated semester GPA is:");
        // establish gpa so it can be referenced in the if statement below
        double gpa;
        // if the user has completed credits, calculate cumulative gpa
        // if the user has not completed any credits (else), calculate first semester gpa
        if (completed_credits > 0) {
            gpa = cumulative_gpa(current_gpa, completed_credits, semester_gpa, semester_credits);
            System.out.println(gpa); 
        } else {
            gpa = first_semester_gpa(semester_gpa, semester_credits);
            System.out.println(gpa);
        }

        // print out a message based on the user's anticipated gpa
        if (gpa >= 3.95) {
            System.out.println("Woah, braniac! Are you the valedictorian?");
        } else if (gpa >= 3.6) {
            System.out.println("Congrats on Dean's List!");
        } else if (gpa >= 3.0) {
            System.out.println("Good job!");
        } else if (gpa >= 2.0) {
            System.out.println("Maybe you should consider studying more.");
        } else {
            System.out.println("You are on academic probation.");
        }

        scanner.close();
    }

    // method to calculate first semester gpa
    public static double first_semester_gpa(double points, int credits) {
        double gpa = points / credits;
        return gpa;
    }

    // method to calculate cumulative gpa
    public static double cumulative_gpa(double current_gpa, int completed_credits, double semester_points, int semester_credits) {
        int total_credits = completed_credits + semester_credits;
        double total_points = (current_gpa * completed_credits) + semester_points;
        double gpa = total_points / total_credits;
        return gpa;
    }

} 