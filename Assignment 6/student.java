import java.util.Random;

public class student {
    String name;
    String year;
    double gpa;
    int id;

    public student(String n, String y, double g, int i) {
        name = n;
        year = y;
        gpa = g;
        id = i;
    }

    void honor_roll() {
        if (this.gpa >= 3.6) {
            System.out.println(this.name + " is an honor roll student.");
        } else {
            System.out.println(this.name + " is not on the honor roll.");
        }
    }

    void free_lunch() { 
        Random r = new Random();
        int random_id = r.nextInt(30) + 1; 
        if (this.id == random_id) {
            System.out.println(this.name + " gets a free lunch!");
        } else {
            System.out.println(this.name + " does not get a free lunch. Maybe tomorrow :(");
        }
    } 


}
