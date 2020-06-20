package com.company;

import Animal.Animal;
import BlogPost.BlogPost;
import Counter.Counter;
import FleetOfThings.Fleet;
import FleetOfThings.Thing;
import PostIt.PostIt;
import Sharpie.Sharpie;
import Pokemon.Pokemon;

import java.util.ArrayList;
import java.util.List;

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
        counter1.get();
        counter1.reset();


        //Pokemon
        System.out.println("\nPokemon Task:");

        List<Pokemon> pokemonOfAsh = initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        // Which pokemon should Ash use?
        for (int i = 0; i < pokemonOfAsh.size(); i++) {
            if (pokemonOfAsh.get(i).isEffectiveAgainst(wildPokemon) == true) {
                System.out.println("Ash should chose pokemon of index " + i);
            }
        }

        System.out.print("I choose you, Charizard");

        //Fleet of things
        System.out.println("\n\nFleet of things Task:");

        Fleet fleet = new Fleet();

        Thing thing1 = new Thing("Get milk");
        Thing thing2 = new Thing("Remove the obstacles");
        Thing thing3 = new Thing ("Stand up");
        Thing thing4 = new Thing ("Eat lunch");

        thing3.complete();
        thing4.complete();

        thing1.toString();
        thing2.toString();
        thing3.toString();
        thing4.toString();

        fleet.add(thing1);
        fleet.add(thing2);
        fleet.add(thing3);
        fleet.add(thing4);

        fleet.toString();

        System.out.println(fleet);



    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }





}
