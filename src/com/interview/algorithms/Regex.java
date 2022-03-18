package com.interview.algorithms;

/**
 * Created by Deepak on 4/9/19.
 */
public class Regex {

    public static void main(String[] args) {
        System.out.println("[anchor:anytext]]Any text[/anchor]".replaceAll("\\[.*?\\]",""));
    }
}
