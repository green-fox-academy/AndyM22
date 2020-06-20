package com.company;

import Animal.Animal;
import BlogPost.BlogPost;
import Counter.Counter;
import PostIt.PostIt;
import Sharpie.Sharpie;

public class Main {

    public static void main(String[] args) {

        //PostIt
        System.out.println("Post it Task:");

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
        System.out.println("\nBlogPost Task:");

        BlogPost blogPost1 = new BlogPost();
        blogPost1.createBlogPost("John Doe", "Lorem Ipsum", "2000.05.04.", "Lorem ipsum dolor sit amet.");

        BlogPost blogPost2 = new BlogPost();
        blogPost2.createBlogPost("Tim Urban", "Wait but why", "2010.10.10.", "A popular long-form, stick-figure-illustrated blog about almost everything.");

        BlogPost blogPost3 = new BlogPost();
        blogPost3.createBlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "2017.03.28.", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");


        //Animal
        System.out.println("\nAnimal Task:");

        Animal animal1 = new Animal();
        animal1.drink();
        animal1.eat();
        System.out.println(animal1.getHunger());
        System.out.println(animal1.getThirst());
        animal1.play();
        animal1.play();
        System.out.println(animal1.getThirst());
        System.out.println(animal1.getHunger());


        //Sharpie
        System.out.println("\nSharpie Task:");

        Sharpie sharpie1 = new Sharpie();
        sharpie1.create("Blue", (float) 6.72);
        sharpie1.use();
        System.out.println(sharpie1.getInkAmount());


        //Counter
        System.out.println("\nCounter Task:");

        Counter counter1 = new Counter();
        counter1.add(12);
        counter1.add(12);
        counter1.add();
        counter1.getCurrentValue();
        counter1.reset();

        




    }


}
