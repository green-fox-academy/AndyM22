package BlogPost;

import java.util.ArrayList;

public class Blog {

    ArrayList<BlogPost> blogPosts = new ArrayList<BlogPost>();

    public ArrayList<BlogPost> getBlogPosts() {
        return blogPosts;
    }

    public void addBlogPost(BlogPost blogPost){
        this.blogPosts.add(blogPost);
    }

    public void deleteBlogPost(int numberOfBlogPostIndex){
        this.blogPosts.remove(numberOfBlogPostIndex);
    }

    public void updateBlogPost(int numberOfBlogPostIndex, BlogPost newBlogPost){
        this.blogPosts.set(numberOfBlogPostIndex, newBlogPost);
    }

}
