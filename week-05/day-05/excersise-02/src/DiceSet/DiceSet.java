package DiceSet;

import java.util.ArrayList;
import java.util.List;

public class DiceSet {
    ArrayList<Integer> dice = new ArrayList<>();

    public List<Integer> roll() {
        for (int i = 0; i < 6; i++) {
            dice.add((int) (Math.random() * 6) + 1);
        }
        return dice;
    }

    public List<Integer> getCurrent() {
        return dice;
    }

    public int getCurrent(int i) {
        return dice.get(i);
    }

    public void reroll() {
        for (int i = 0; i < dice.size(); i++) {
            dice.set(i, (int) (Math.random() * 6) + 1);
        }
    }

    public void reroll(int k) {
        dice.set(k, (int) (Math.random() * 6) + 1);
    }

    public static void main(String[] args) {
        // You have a `DiceSet` class which has a list for 6 dice
        // You can roll all of them with roll()
        // Check the current rolled numbers with getCurrent()
        // You can reroll with reroll()
        // Your task is to roll the dice until all of the dice are 6

        DiceSet diceSet = new DiceSet();
        System.out.println(diceSet.getCurrent());
        diceSet.roll();
        System.out.println(diceSet.getCurrent());

        for (int i = 0; i < 6; i++) {
            if (diceSet.getCurrent(i) != 6) {
                diceSet.reroll(i);
                for (int j = 0; j < 6; j++) {
                    if (diceSet.getCurrent(j) != 6) {
                        diceSet.reroll(j);
                        for (int k = 0; k < 6; k++) {
                            if (diceSet.getCurrent(k) != 6) {
                                diceSet.reroll(k);
                                for (int l = 0; l < 6; l++) {
                                    if (diceSet.getCurrent(l) != 6) {
                                        diceSet.reroll(l);
                                        for (int m = 0; m < 6; m++) {
                                            if (diceSet.getCurrent(m) != 6) {
                                                diceSet.reroll(m);
                                                for (int n = 0; n < 6; n++) {
                                                    if (diceSet.getCurrent(n) != 6) {
                                                        diceSet.reroll(n);
                                                    }

                                                }
                                            }

                                        }
                                    }
                                }

                            }
                        }

                    }
                }
            }
        }

        System.out.println(diceSet.getCurrent());

    }
}