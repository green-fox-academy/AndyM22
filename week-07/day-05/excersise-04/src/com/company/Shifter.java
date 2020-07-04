package com.company;

public class Shifter implements CharSequence {
    protected String string;
    protected int number;

    Shifter(String string, int number) {
        this.string = string;
        this.number = number;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(index + this.number);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return string.subSequence(start + this.number, end + this.number + 1);
    }
}
