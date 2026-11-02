public class people {
    String name;
    int age;

    public people(String n, int a) {
        name = n;
        age = a;
    }

    void says_hi() {
        System.out.println(this.name + " says hi!");
    }

}


