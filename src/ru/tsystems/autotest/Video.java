package ru.tsystems.autotest;

public class Video extends Media {
    @Override
    public int getMaxSize() {
        System.out.println("10");
        return 0;
    }

    private String doc;
    private String message;

    public void play(String doc) {
        System.out.println("play");
    }
}

