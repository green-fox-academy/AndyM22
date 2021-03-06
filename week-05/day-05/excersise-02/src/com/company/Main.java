package com.company;

import Animal.Animal;
import Animal.Farm;
import BlogPost.BlogPost;
import BlogPost.Blog;
import Counter.Counter;
import DiceSet.DiceSet;
import Dominoes.Domino;
import FleetOfThings.Fleet;
import FleetOfThings.Thing;
import PetrolStation.Car;
import PetrolStation.Station;
import PostIt.PostIt;
import Sharpie.Sharpie;
import Pokemon.Pokemon;
import TeachersAndStudents.Student;
import TeachersAndStudents.Teacher;

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

        Sharpie sharpie1 = new Sharpie("Blue", (float) 6.72);
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
        Thing thing3 = new Thing("Stand up");
        Thing thing4 = new Thing("Eat lunch");

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

        //DiceSet
        System.out.println("\nDiceSet Task:");

        DiceSet diceSet = new DiceSet();

        diceSet.roll();

        int diceSetSize = diceSet.getCurrent().size();

        for (int i = 0; i < diceSetSize; i++) {
            while (diceSet.getCurrent(i) != 6) {
                diceSet.reroll(i);
            }
        }
        System.out.println(diceSet.getCurrent());


        //Dominoes
        System.out.println("\n\nDominoes Task:");

        List<Domino> dominoes = initializeDominoes();

        List<Domino> sortedDominoes = new ArrayList<>();
        sortedDominoes.add(dominoes.get(0));

        int rightSide = sortedDominoes.get(0).getRightSide();
        int size = dominoes.size();

        while (sortedDominoes.size() != size) {
            for (int i = 1; i < dominoes.size(); i++) {
                if (rightSide == dominoes.get(i).getLeftSide()) {
                    sortedDominoes.add(dominoes.get(i));
                    rightSide = dominoes.get(i).getRightSide();
                    dominoes.remove(i);
                    //break;
                }
            }
        }

        System.out.println(sortedDominoes);


        //Teachers and Students
        System.out.println("\n\nTeachers and Students Task:");

        Teacher teacher = new Teacher();
        Student student = new Student();

        teacher.teach(student);
        student.question(teacher);


        //Petrol Station
        System.out.println("\n\nPetrol Station Task:");

        Car car = new Car();
        Station station = new Station();

       /* car.getCapacity();
        car.getGasAmount();

        station.getGasAmount();*/

        station.refill(car);

       /* car.getCapacity();
        car.getGasAmount();
        station.getGasAmount();
*/

        //Farm Task
        System.out.println("\n\nFarm Task: ");

        Farm farm = new Farm();

        System.out.println(farm.getSlots());
        farm.breed();
        farm.breed();
        System.out.println(farm.getSlots());
        farm.slaughter();
        System.out.println(farm.getSlots());


        //Blog and BlogPost Task
        System.out.println("\n\nBlog and BlogPost Task: ");

        BlogPost post1 = new BlogPost("John Doe", "Lorem Ipsum", "2000.05.04.", "Lorem ipsum dolor sit amet.");
        BlogPost post2 = new BlogPost("Tim Urban", "Wait but why", "2010.10.10.", "A popular long-form, stick-figure-illustrated blog about almost everything.");
        BlogPost post3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "2017.03.28.", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");

        Blog blog = new Blog();

        blog.addBlogPost(post1);
        blog.addBlogPost(post2);

        blog.updateBlogPost(0, post3);
        blog.deleteBlogPost(1);

        for (int i = 0; i < blog.getBlogPosts().size(); i++) {
            BlogPost currentPost = blog.getBlogPosts().get(i);
            System.out.println(currentPost.printBlogPost());
        }
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
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
