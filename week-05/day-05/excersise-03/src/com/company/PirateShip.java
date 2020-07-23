package com.company;

import java.util.ArrayList;
import java.util.Random;

public class PirateShip extends com.company.Random {

    private ArrayList<Pirate> crew = new ArrayList<>();
    private Pirate captain = new Captain();
    private Random random = new Random();

    public Pirate getCaptain() {
        return captain;
    }

    PirateShip() {

    }

    public ArrayList<Pirate> getCrew() {
        return crew;
    }

    public void fillShip() {

        int numberOfPirates = getRandomNumber();

        if (this.crew.contains(this.captain)) {
            for (int i = 0; i < numberOfPirates; i++) {
                this.crew.add(new Pirate());
            }
        } else {
            this.crew.add(this.captain);
            for (int i = 0; i < numberOfPirates; i++) {
                this.crew.add(new Pirate());
            }
        }

    }

    public String getState() {
        String captainState;
        int consumedRumByCaptain = this.captain.getConsumedRum();
        int numberOfPiratesAlive = livePirates();

        if (this.captain.isAlive()) {
            captainState = "alive";
            if (captain.isPassedOut() == true) {
                captainState = captainState.concat(" but passed out");
            } else if (this.captain.isPassedOut() == false && consumedRumByCaptain > 0) {
                captainState = captainState.concat(" and drunk");
            } else {
                captainState = captainState.concat(", awake and sober");
            }
        } else {
            captainState = "dead";
        }

        return "There are " + numberOfPiratesAlive + " live pirate(s) on this ship. The Captain is " + captainState + ". ";
    }

    public int livePirates() {
        int numberOfPiratesAlive = 0;
        for (int i = 0; i < this.crew.size(); i++) {
            Pirate currentPirate = this.crew.get(i);
            if (currentPirate.isAlive()) {
                numberOfPiratesAlive += 1;
            }
        }
        return numberOfPiratesAlive;
    }

    public int score() {
        int score = livePirates() - (this.captain.getConsumedRum());
        return score;
    }

    public void party() {
        int number = getRandomNumber();
        for (int i = 0; i < this.crew.size(); i++) {
            Pirate currentPirate = this.crew.get(i);
            for (int j = 0; j < number; j++) {
                currentPirate.drinkSomeRum();
            }
        }
    }

    public boolean battle(PirateShip ship) {
        int thisScore = score();
        int otherScore = ship.score();

        if (thisScore > otherScore) {
            ship.loseBattle();
            party();
            return true;
        } else if (thisScore == otherScore) {
            party();
            ship.party();
            return true;
        } else {
            loseBattle();
            ship.party();
            return false;
        }
    }

    public void loseBattle() {
        int number = this.random.nextInt(this.crew.size() + 1);
        for (int i = 0; i < number; i++) {
            Pirate currentPirate = this.crew.get(i);
            currentPirate.die();
        }
    }

}
