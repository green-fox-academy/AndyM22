package com.greenfox.frontend.Model;

public class Doubler {

    private long received;
    private long result;

    public Doubler() {
    }

    public Doubler(Long received) {
        this.received = received;
        this.result = received * 2;
    }

    public long getReceived() {
        return received;
    }

    public void setReceived(long received) {
        this.received = received;
    }

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }
}
