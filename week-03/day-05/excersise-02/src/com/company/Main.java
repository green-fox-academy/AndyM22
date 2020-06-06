package com.company;

public class Main {

    public static void main(String[] args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";

        String beforeUrl = url.substring(0,5);

        String afterUrl = url.substring(6);

        String newChar = ":/";

        String concatUrl = beforeUrl.concat(newChar);

        beforeUrl = concatUrl;

        url = beforeUrl.concat(afterUrl);

        url = url.replace("bots", "odds");

        System.out.print(url);

    }
}
