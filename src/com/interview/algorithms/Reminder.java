package com.interview.algorithms;

public class Reminder {

    public static void main( String[] args )
    {
        reminder(2, 8);
    }

    public static void reminder( int nue, int deno )
    {

        int rem = nue - (nue / deno) * deno;
        int remin = nue % deno;

        System.out.println("without using modulo " + rem);
        System.out.println("with using modulo " + remin);
    }

}
