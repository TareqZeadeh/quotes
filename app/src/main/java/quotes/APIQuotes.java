package quotes;

public class APIQuotes {
    private String quoteText;
    private String quoteAuthor;
    private String senderName;
    private String senderLink;
    private String quoteLink;

    public APIQuotes(String quoteText, String quoteAuthor, String senderName, String senderLink, String quoteLink) {
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
        this.senderName = senderName;
        this.senderLink = senderLink;
        this.quoteLink = quoteLink;
    }

    @Override
    public String toString() {
        return String.format("Quote{QuoteText: %s, Author: %s}\n",quoteText, quoteAuthor);
    }
}
