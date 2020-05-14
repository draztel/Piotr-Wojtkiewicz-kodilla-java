package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeatufier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;

public class StreamMain {
    public static void main (String[]args) {
        PoemBeatufier poemBeatufier = new PoemBeatufier();

        System.out.println("Welcome to module 7 - Stream");

        poemBeatufier.executeDecorator("byl sobie krol", PoemBeatufier::addDot);
        poemBeatufier.executeDecorator("byl sobie krol", PoemBeatufier::addABCAtTheBeginning);
        poemBeatufier.executeDecorator("byl sobie krol", PoemBeatufier::addABCAtTheEnd);
        poemBeatufier.executeDecorator("byl sobie krol", PoemBeatufier::addLine);
        poemBeatufier.executeDecorator("byl sobie krol", (text) -> text.toUpperCase());
        poemBeatufier.executeDecorator("BYL SOBIE KROL", (text) -> text.toLowerCase());
    }
}
