package BlogPost;

public class BlogPost {

    private String authorName;
    private String title;
    private String text;
    private String publicationDate;

    public BlogPost(String authorName, String title, String publicationDate, String text){
        this.authorName = authorName;
        this.title = title;
        this.publicationDate = publicationDate;
        this.text = text;
    }

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

    public String printBlogPost(){
        String post = "";
        String head = "\n" + this.title + " titled by " + this.authorName + " posted at " + this.publicationDate;
        String text = "\n" + this.text;

        post = post.concat(head);
        post = post.concat(text);

        return post;
    }

}
