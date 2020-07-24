package com.company;

import java.util.ArrayList;

public class Armada {

    private ArrayList<PirateShip> fleet = new ArrayList<>();

    public ArrayList<PirateShip> getFleet() {
        return fleet;
    }

    public void createArmada() {
        int number = RandomNumber.getRandomNumber();
        for (int i = 0; i < number; i++) {
            this.fleet.add(new PirateShip());
            this.fleet.get(i).fillShip();
        }
    }

    public boolean war(Armada armada) {

        int battles = this.fleet.size() + armada.getFleet().size();

        int thisShipsLeft = this.fleet.size();
        int otherShipsLeft = armada.getFleet().size();

        int thisShip = 0;
        int otherShip = 0;

        for (int i = 0; i < battles; i++) {

            PirateShip thisCurrentShip = this.fleet.get(thisShip);
            PirateShip otherCurrentShip = armada.getFleet().get(otherShip);

            if (thisCurrentShip.battle(otherCurrentShip) == true) {
                otherShip += 1;
                otherShipsLeft -= 1;
            } else {
                thisShip += 1;
                thisShipsLeft -= 1;
            }

            if (otherShipsLeft == 0 || thisShipsLeft == 0) {
                break;
            }

        }

        if (otherShipsLeft == 0) {
            return true;
        } else {
            return false;
        }

    }

}
