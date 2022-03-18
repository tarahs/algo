package com.interview.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StringOpt {

    public static void main( String[] args )
    {
        //findFirstNonRepeatingChar("tarara");

        String s1 = "Debit card";
        String s2 = "abec";
        String anagram = "Bad credit";

        System.out.println("test1 " + s1.substring(2));
        System.out.println("test2 " + s1.substring(0));
        System.out.println("test3 " + s1.substring(0, 9));

        reverseAString(s1);
        System.out.println("reverse using Recursion " + reverseStringRecursion(s1));
        System.out.println("Is Anagram " + isAnagram(s1.toLowerCase(), anagram.toLowerCase()));
        System.out.println("Is Anagram " + isAnagramUsingSort(s1.toLowerCase(), anagram.toLowerCase()));

    }

    //Reversing a String
    public static void reverseAString( String s )
    {
        String reversedString = "";
        for( int i = (s.length() - 1); i >= 0; i-- )
        {
            reversedString = reversedString + s.charAt(i);
        }
        System.out.println("Reversed String is " + reversedString);
    }

    //Reverse a String recursion
    public static String reverseStringRecursion( String s )
    {
        if( s.length() < 2 )
            return s;
        return reverseStringRecursion(s.substring(1)) + s.charAt(0);

    }

    //isAnagram
    public static Boolean isAnagram( String text, String anagram )
    {
        if( text == null || text.isEmpty() || anagram == null || anagram.isEmpty() )
            return false;

        char[] textArray = text.toCharArray();
        for( char c : textArray )
        {
            int charIndex = anagram.indexOf(c);
            if( charIndex != -1 )
            {
                //Remove the matching char from anagram
                anagram = anagram.substring(0, charIndex) + anagram.substring((charIndex + 1), anagram.length());
            }
            else
                return false;

        }
        return true;

    }

    //simple Solution
    public static Boolean isAnagramUsingSort( String s1, String anagram )
    {
        if( s1 == null || s1.isEmpty() || anagram == null || anagram.isEmpty() )
            return false;

        char[] text1 = s1.toCharArray();
        char[] text2 = anagram.toCharArray();

        Arrays.sort(text1);
        Arrays.sort(text2);
        if( Arrays.equals(text1, text2) )
            return true;
        else
            return false;

    }

    static void printDuplicateChars( String s )
    {
        Map<Character, Integer> charCount = new HashMap<Character, Integer>();
        for( int i = 0; i < s.length(); i++ )
        {
            Character character = s.charAt(i);

            int count = 0;
            if( charCount.containsKey(character) )
            {
                count = charCount.get(character);
            }
            charCount.put(character, ++count);
        }

        Iterator iterator = charCount.entrySet().iterator();
        while( iterator.hasNext() )
        {
            Map.Entry<Character, Integer> pair = (Entry<Character, Integer>) iterator.next();
            if( pair.getValue() > 1 )
                System.out.println("Character " + pair.getKey() + "is duplicated");
        }
    }

    public static boolean isPalindrome(String input){

        if(input == null || input.equals("") || input.trim().equals("")){
            return false;
        }

        for(int i = 0;i<input.length();i++){

            if(input.charAt(i) != input.charAt((input.length()-1)-i))
                return false;
        }
        return true;
    }
}
