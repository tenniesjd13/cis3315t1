package part2;

/**
 * Set the genre to horror. See SciFi example...
 *
 * @author Your name
 */
public class Horror extends Book {

    public Horror(String title, String author) {
        super(title, author);
    }

    @Override
    public String getGenre() {
        return "horror";
    }
}
