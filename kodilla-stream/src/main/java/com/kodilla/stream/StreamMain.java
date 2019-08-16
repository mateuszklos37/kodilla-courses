package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;

public class StreamMain {
    public static void main(String[] args) {
        //ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        //expressionExecutor.executeExpression(10, 5, (a, b) -> a+b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a*b);
        //expressionExecutor.executeExpression(10, 5, (b, a) -> b-a);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a/b);
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("text", (string -> string.toUpperCase()));
        poemBeautifier.beautify("TEXT", (string -> string.toLowerCase()));
        poemBeautifier.beautify("So much ...", (string -> string+ "beautiful text"));
        poemBeautifier.beautify("Mateusz", (string -> string.substring(2,4)));
    }
}
