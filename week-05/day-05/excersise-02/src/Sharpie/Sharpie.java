package Sharpie;

public class Sharpie {

    private String color;
    private float width;
    private float inkAmount;

    public Sharpie() {
        inkAmount = 100;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public float getWidth() {

        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getInkAmount() {

        return inkAmount;
    }

    public void setInkAmount(float inkAmount) {

        this.inkAmount = inkAmount;
    }

    public void use() {
        inkAmount -= 1;
    }

    public void create(String color, Float width) {
        System.out.println("The color of Sharpie is " + color + " and its width is " + width);
    }

}
