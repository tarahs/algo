package com.interview.algorithms;

import java.util.*;

public class NonRepeatedChar {

    public static void main( String[] args )
    {
        // TODO Auto-generated method stub

        String s = "arzorzthink";
        findByNonRepeatingCharUsingHashMap(s);
        findByRepeatingCharUsingIteration(s);

    }

    public static Character findByNonRepeatingCharUsingHashMap( String str )
    {
        Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
        for( char c : str.toCharArray() )
        {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }

        for(char c : str.toCharArray()){
            if(counts.get(c) == 1){
                System.out.println("Char " + c + " is not repeated");
                return c;
            }
        }

        throw new RuntimeException("Did not find non repeating key");
    }

    public static void findByRepeatingCharUsingIteration( String s )
    {
        for( int i = 0; i < s.length(); i++ )
        {

            for( int j = i + 1; j < s.length(); j++ )
            {
                if( s.charAt(i) == s.charAt(j) )
                {
                    System.out.println("Char " + s.charAt(i) + " is repeated");
                    return;

                }
            }

        }
        System.out.println("There is no repeating char found");
    }


    public static void findByRepeatingChar( String s ){
        List<Character> nonRepeatingChar = new ArrayList<>();
        Character charRep;
        for(int i= 0 ;i<s.length();i++) {
            Character c = s.charAt(i);
            if (nonRepeatingChar.contains(c)) {
                charRep = c;
                break;
            } else {
                nonRepeatingChar.add(c);
            }

        }
    }

}
