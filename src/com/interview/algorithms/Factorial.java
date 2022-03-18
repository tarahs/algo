package com.interview.algorithms;

public class Factorial {

    //5! = 5*4*3*2*1

    static int num = 7;

    public static void main( String[] args )
    {
        findFactorial();
        System.out.println("Factorial of " + num + " is " + fact(num));
    }

    public static void findFactorial()
    {
        int factorial = 1;
        int n = num;
        while( n > 0 )
        {
            factorial = factorial * n;
            n--;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }

    public static int fact( int n )
    {

        if( n == 1 || n == 0 )
            return 1;

        return n * fact(n - 1);
    }

}
