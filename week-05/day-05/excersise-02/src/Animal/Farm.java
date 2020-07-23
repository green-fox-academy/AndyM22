package Animal;

import java.util.ArrayList;

public class Farm {

    private ArrayList<Animal> animals = new ArrayList<>();

    int slots = 20;

    public Farm(){

    }

    public int getSlots() {
        return slots;
    }

    public void breed(){
        if (this.animals.size() < this.slots){
            animals.add(new Animal());
            this.slots -= 1;
        } else {
            System.out.println("The farm is full!");
        }
    }

    public void slaughter(){
        if (this.animals.size() != 0){
            Animal leastHungry = this.animals.get(0);
            int hunger = this.animals.get(0).getHunger();
            for (int i = 0; i < this.animals.size(); i++) {
                Animal currentAnimal = this.animals.get(i);
                if (hunger < currentAnimal.getHunger()){
                    hunger = currentAnimal.getHunger();
                }
            }
            this.animals.remove(leastHungry);
            this.slots += 1;
        } else {
            System.out.println("The are no animals!");
        }
    }

}
