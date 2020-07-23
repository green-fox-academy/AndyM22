package com.company;

public class Main {

    public static void main(String[] args) {
        PirateShip ship = new PirateShip();

        PirateShip ship2 = new PirateShip();

        ship2.fillShip();

        System.out.println(ship2.getCrew().size());

        ship2.fillShip();

        System.out.println(ship2.getCrew().size());

        ship2.getCaptain().drinkSomeRum();
        ship2.getCaptain().drinkSomeRum();
        ship2.getCaptain().drinkSomeRum();
        ship2.getCaptain().drinkSomeRum();
        ship2.getCaptain().drinkSomeRum();

        ship.fillShip();

        System.out.println("Ship won: " + ship.battle(ship2));
        System.out.println("Ship: " + ship.getState());
        System.out.println("Ship2: " + ship2.getState());

        Armada kokos = new Armada();
        kokos.createArmada();

        Armada vlašák = new Armada();
        vlašák.createArmada();

        System.out.println("Kokos win: " + kokos.war(vlašák));

    }
}
