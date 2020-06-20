package BlogPost;

public class BlogPost {

    private String authorName;
    private String title;
    private String text;
    private String publicationDate;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void createBlogPost(String authorName, String title, String publicationDate, String text) {
        System.out.println("\"" + title + "\"" + " titled by " + authorName + "posted at " + "\"" + publicationDate + "\"" + "\n" + "    " + "\u25AA" + "  " + text);
    }

}
