package Sharpie;

public class Sharpie {

    private String color;
    private float width;
    private float inkAmount;

    public Sharpie(String color, float width) {
        setInkAmount(100);
        setColor(color);
        setWidth(width);
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
        this.inkAmount -= 1;
    }

}
