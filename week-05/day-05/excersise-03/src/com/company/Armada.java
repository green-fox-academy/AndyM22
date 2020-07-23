package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Armada extends com.company.Random {

    private ArrayList<PirateShip> fleet = new ArrayList<>();
    private Random random = new Random();

    public ArrayList<PirateShip> getFleet() {
        return fleet;
    }

    public void createArmada() {
        int number = getRandomNumber();
        for (int i = 0; i < number; i++) {
            this.fleet.add(new PirateShip());
            this.fleet.get(i).fillShip();
        }
    }

    public boolean war(Armada armada) {
        int thisFleet = this.fleet.size();
        int otherFleet = armada.getFleet().size();

        int battles = thisFleet + otherFleet;

        int thisShipsLeft = thisFleet;
        int otherShipsLeft = otherFleet;

        int thisShip = 0;
        int otherShip = 0;

        PirateShip thisCurrentShip = this.fleet.get(thisShip);
        PirateShip otherCurrentShip = armada.getFleet().get(otherShip);

        for (int i = 0; i < battles; i++) {
            if (otherShipsLeft == 0 || thisShipsLeft == 0) {
                break;
            } else if (thisCurrentShip.battle(otherCurrentShip) == true) {
                otherShip += 1;
                otherShipsLeft -= 1;
            } else {
                thisShip += 1;
                thisShipsLeft -= 1;
            }
        }

        if (otherShipsLeft == 0) {
            return true;
        } else {
            return false;
        }

    }

}
