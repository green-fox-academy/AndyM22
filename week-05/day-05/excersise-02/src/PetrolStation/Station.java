package PetrolStation;

public class Station {

    private int gasAmount;

    public void refill(Car car) {
        this.gasAmount = this.gasAmount - car.getCapacity();
        car.setGasAmount(100);
    }

}
