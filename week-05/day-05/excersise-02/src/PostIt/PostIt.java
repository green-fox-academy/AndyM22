package PostIt;

public class PostIt {

    private String backgroundColor;
    private String text;
    private String textColor;

    public PostIt(){

    }

    public void setBackgroundColor(String backgroundColor){
        this.backgroundColor = backgroundColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getTextColor(){
        return textColor;
    }

    public void create(){
        System.out.println("The background color is: " + backgroundColor + ", the text is: " + text + ", the color of text is: " + textColor);
    }


}
