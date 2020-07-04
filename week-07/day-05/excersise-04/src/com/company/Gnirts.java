package com.company;

public class Gnirts implements CharSequence {

    protected String string;

    Gnirts(String string) {
        this.string = string;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        int character = string.length() - index - 1;
        return string.charAt(character);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        int startChar = string.length() - start;
        int endChar = string.length() - end - 1;
        return string.subSequence(endChar, startChar);
    }
}
