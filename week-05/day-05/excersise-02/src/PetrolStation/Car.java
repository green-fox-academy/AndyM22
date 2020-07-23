package PetrolStation;

public class Car {

    private int gasAmount;
    private int capacity;

    public Car() {
        this.gasAmount = 0;
        this.capacity = 100;
    }

    public void setGasAmount(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public int getCapacity() {
        return capacity;
    }

}
