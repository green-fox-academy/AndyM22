package com.company;

import BlogPost.BlogPost;
import PostIt.PostIt;

public class Main {

    public static void main(String[] args) {

        //PostIt

        PostIt object1 = new PostIt();
        object1.setBackgroundColor("ORANGE");
        object1.setText("Idea 1");
        object1.setTextColor("BLUE");
        object1.createPostIn();

        PostIt object2 = new PostIt();
        object2.setBackgroundColor("PINK");
        object2.setText("Awesome");
        object2.setTextColor("BLACK");
        object2.createPostIn();

        PostIt object3 = new PostIt();
        object3.setBackgroundColor("YELLOW");
        object3.setText("Superb!");
        object3.setTextColor("GREEN");
        object3.createPostIn();

        //BlogPost

        BlogPost blogPost1 = new BlogPost();
        blogPost1.createBlogPost("John Doe", "Lorem Ipsum", "2000.05.04.", "Lorem ipsum dolor sit amet.");

        BlogPost blogPost2 = new BlogPost();
        blogPost2.createBlogPost("Tim Urban", "Wait but why", "2010.10.10.", "A popular long-form, stick-figure-illustrated blog about almost everything.");

        BlogPost blogPost3 = new BlogPost();
        blogPost3.createBlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "2017.03.28.", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");
    }
}
