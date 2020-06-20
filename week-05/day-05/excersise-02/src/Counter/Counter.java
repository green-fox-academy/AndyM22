package Counter;

public class Counter {

    int fieldValue;

    public Counter() {
        this.fieldValue = 0;
    }

    public Counter(int fieldValue) {
        this.fieldValue = fieldValue;
    }

    public int getFieldValue() {
        return this.fieldValue;
    }

    public void setFieldValue(int fieldValue) {
        this.fieldValue = fieldValue;
    }

    public int get() {
        System.out.println(fieldValue);
        return fieldValue;
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
