package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main (String[]args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Welcome to module 7 - Stream");

        poemBeautifier.executeDecorator("byl sobie krol", PoemBeautifier::addDot);
        poemBeautifier.executeDecorator("byl sobie krol", PoemBeautifier::addABCAtTheBeginning);
        poemBeautifier.executeDecorator("byl sobie krol", PoemBeautifier::addABCAtTheEnd);
        poemBeautifier.executeDecorator("byl sobie krol", PoemBeautifier::addLine);
        poemBeautifier.executeDecorator("byl sobie krol", (text) -> text.toUpperCase());
        poemBeautifier.executeDecorator("BYL SOBIE KROL", (text) -> text.toLowerCase());
    }
}
