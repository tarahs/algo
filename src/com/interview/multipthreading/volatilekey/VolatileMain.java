package com.interview.multipthreading.volatilekey;

import java.util.Scanner;

class Runner extends Thread {

    private volatile Boolean isTrue = true;

    @Override
    public void run()
    {

        System.out.println(isTrue + " " + this.getId());
        while( isTrue )
        {
            System.out.println(isTrue);
        }

    }

    public void shutDown()
    {
        isTrue = false;
    }

}

public class VolatileMain {

    public static void main( String[] args )
    {
        // TODO Auto-generated method stub
        Runner t1 = new Runner();
        Runner t2 = new Runner();
        t1.start();
        t2.start();

        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        t1.shutDown();
        t2.shutDown();

    }

}