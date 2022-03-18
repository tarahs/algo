package com.interview.springs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

    public static void main( String[] args )
    {
        String s = "Tara";
        printDuplicateChars(s);
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

}
