package quotes;

public class Quotes {
    String[] tags;
    String author;
    String text;
    String likes;


    public Quotes(String[] tags, String author, String text, String likes) {
        this.tags = tags;
        this.author = author;
        this.text = text;
        this.likes = likes;
    }

    @Override
    public String toString() {
        return String.format("Quote{author: %s, quote: %s}\n",author,text);
    }
}
