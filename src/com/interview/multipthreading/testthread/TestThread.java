package com.interview.multipthreading.testthread;

public class TestThread {


    public static void main(String args[]) {
        Object Lock1 = new Object();
        Object Lock2 = new Object();
        ThreadDemo1 T1 = new ThreadDemo1(Lock1, Lock2);
        ThreadDemo2 T2 = new ThreadDemo2(Lock1, Lock2);
        T1.start();
        T2.start();
    }


}
