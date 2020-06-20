package Counter;

public class Counter {

    int fieldValue;

    public Counter() {
        fieldValue = 0;
    }

    public int getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(int fieldValue) {
        this.fieldValue = fieldValue;
    }

    public void get() {
        System.out.println(fieldValue);
    }

    public void add(int number) {
        fieldValue = fieldValue + number;
        System.out.println(fieldValue);
    }

    public void add() {
        fieldValue += 1;
        System.out.println(fieldValue);
    }

    public void reset() {
        fieldValue = 0;
        System.out.println(fieldValue);
    }


}
