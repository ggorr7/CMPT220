public class oct29 {
    public static void main(String[] args) {

        people person1 = new people("Grace", 21);
        person1.says_hi();

        books book1 = new books("The Giving Tree", "Shel Silverstein", "children's lit");
        book1.giving_tree();
        books book2 = new books("The Giver", "Lois Lowry", "science fiction");
        book2.giving_tree();

        cars car1 = new cars("Toyota", "Rav 4", 2015, 145000);
        car1.miles_per_year();
        cars car2 = new cars("Honda", "Civic", 2026, 1000);
        car2.miles_per_year();
        cars car3 = new cars("Ford", "F-150", 2022, 20000);
        car3.miles_per_year();

    }
}
