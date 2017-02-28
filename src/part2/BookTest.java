package part2;

/**
 * Follow the SciFi example to fix Horror and Romance classes. 
 *
 * @author Your name here
 */
public class BookTest {
    public static void main(String[] args) {
        Book b1 = new SciFi("Ender's Game", "Orson Scott Card");
        Book b2 = new Horror("Frankenstein", "Mary Shelley");
        Book b3 = new Romance("The Princess Bride", "William Goldman");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
