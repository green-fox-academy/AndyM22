package Dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        List<Domino> sortedDominoes = new ArrayList<>();
        sortedDominoes.add(dominoes.get(0));

        int rightSide = sortedDominoes.get(0).getRightSide();
        int size = dominoes.size();

        while (sortedDominoes.size() != size){
            for (int i = 1; i < size; i++) {
                if (rightSide == dominoes.get(i).getLeftSide()){
                    sortedDominoes.add(dominoes.get(i));
                    rightSide = dominoes.get(i).getRightSide();
                    dominoes.remove(i);
                    break;
                }
            }
        }

        System.out.println(sortedDominoes);


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
}