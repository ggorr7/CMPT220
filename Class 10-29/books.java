public class books {
    String title;
    String author;
    String genre;

    public books(String t, String a, String g) {
        title = t;
        author = a;
        genre = g;
    }

    void giving_tree() {
        if (this.title.equalsIgnoreCase("The Giving Tree")) {
            System.out.println("Shel Silverstein is creepy.");
        } else {
            System.out.println("This is " + this.title + ", not The Giving Tree.");
        }
    }
}