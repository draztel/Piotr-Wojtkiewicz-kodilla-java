package com.kodilla.stream.beautifier;

public class PoemBeatufier {
    public void executeDecorator(String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text);
        System.out.println(result);
    }

    public static String addLine(String text) {
        String line = "";
        for(int i=0; i < text.length(); i++) {
            line += "-";

        }
        return text + "\n" + line;
    }

    public static String addDot(String text) {
        return text + ".";
    }

    public static String addABCAtTheEnd(String text) {
        return text + "ABC";
    }

    public static String addABCAtTheBeginning(String text) {
        return "ABC" + text;
    }
}
