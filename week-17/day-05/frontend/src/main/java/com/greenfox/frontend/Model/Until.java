package com.greenfox.frontend.Model;

public class Until {

    private long until;
    private String actions;

    public Until() {
    }

    public Until(long until, String actions) {
        this.until = until;
        this.actions = actions;
    }

    public long getFactor(long number) {
        long result = 0;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public long getSum(long number) {
        long result = 0;
        for (int i = 0; i <= number; i++) {
            result += i;
        }
        return result;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }


    public long getUntil() {
        return until;
    }

    public void setUntil(long until) {
        this.until = until;
    }
}
