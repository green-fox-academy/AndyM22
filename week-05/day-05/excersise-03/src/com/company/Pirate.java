package com.company;

import java.util.Random;

public class Pirate {

    private int consumedRum = 0;
    private boolean alive = true;
    private boolean passedOut = false;
    private Random random = new Random();

    Pirate() {

    }

    public boolean isAlive() {
        return alive;
    }

    public boolean isPassedOut() {
        return passedOut;
    }

    public int getConsumedRum() {
        return consumedRum;
    }

    public void drinkSomeRum() {
        if (this.alive == false) {
            System.out.println("he's dead");
        } else if (this.passedOut != true) {
            if (this.consumedRum < 4) {
                this.consumedRum += 1;
            } else {
                this.consumedRum += 1;
                passOut();
            }
        }
    }

    public void passOut() {
        if (this.alive == false) {
            System.out.println("he's dead");
        } else {
            this.passedOut = true;
        }
    }

    public String howsItGoingMate() {
        String replies = null;
        if (this.alive == false) {
            replies = "he's dead";
        } else if (this.consumedRum <= 4) {
            replies = "Pour me anudder!";
        } else {
            replies = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
            passOut();
        }
        return replies;
    }

    public void die() {
        this.alive = false;
    }

    public void brawl(Pirate pirate) {
        int number = this.random.nextInt(3);
        if (this.alive == true && pirate.alive == true) {
            if (number == 0) {
                this.passedOut = true;
                pirate.passedOut = true;
            } else if (number == 1) {
                this.alive = false;
            } else {
                pirate.alive = false;
            }
        } else {
            System.out.println("You cannot fight dead pirate!");
        }
    }

}
