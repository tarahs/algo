package com.interview.algorithms;

import java.util.Scanner;

public class ConvertToBinary {

    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String binary = binary(n);
        System.out.println("Base10 to Binary "+binary);
        System.out.println("Binary to Base10 "+toBase10(binary));

    }

    //Base 10 to Binary
    public static String binary( int n )
    {
        if( n == 0 )
            return Integer.toString(0);

        int quotient = (n / 2);
        int reminder = n % 2;

        return binary(quotient) + Integer.toString(reminder);
    }

    public static int toBase10(String binary){
        int base10 = 0;
        int indCount = 0;
        for(int i = binary.length()-1;i>=0;i--){
            if(binary.charAt(i) == '1'){
                base10 = base10+(int)Math.pow((double)2,(double)indCount);
            }
            indCount++;
        }
        return base10;
    }
}
