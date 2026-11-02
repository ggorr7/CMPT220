public class cars {
    String make;
    String model;
    int year;
    int mileage;

    public cars(String m, String mo, int y, int mi) {
        make = m;
        model = mo;
        year = y;
        mileage = mi;
    }

    void miles_per_year() { 
        int years_owned = 2027 - this.year;
        int miles_per_year = this.mileage / years_owned;
        System.out.println("This " + this.make + " " + this.model + " has an average of " + miles_per_year + " miles per year.");
    }

}