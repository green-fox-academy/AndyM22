package com.greenfox.newreddit.Model;

public class Page {

    private int size;
    private int start;

    public Page() {
    }

    public Page(int start) {
        this.start = 0;
        this.size = 5;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    void nextPage() {
        setStart(getStart() + getSize());
    }

    void previousPage() {
        setStart(getStart() - getSize());
    }

}
