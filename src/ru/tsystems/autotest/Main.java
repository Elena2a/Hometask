package ru.tsystems.autotest;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        printType(Type.RECORD);
        printType(Type.COMMENT);
        printType(Type.REPOST);
    }


    private static void printType(Type type) {
        System.out.println(type);


    }

    TextWriting textWriting = new TextWriting();

    Media media = new Media();



    static void printMessage(IPrinter textWriting, IPrinter Image, String message) {

        textWriting.print(message);
        Image.print (message);



    }

    static void scanMessage(IPlayer Audio, IPlayer Video, String doc) {
        Audio.play(doc);
        Video.play(doc);



    }
}
