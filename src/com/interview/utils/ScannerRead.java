package com.interview.utils;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ScannerRead {

    @SuppressWarnings( { "resource", "unchecked" } )
    public static void main( String[] args )
    {
        List<String> list = new ArrayList<String>(10);
        Vector v = new Vector();
        list.add("Tara");
        list.add("Deepak");
        list.add("Sheela");

        Iterator it = list.iterator();
        Enumeration e = v.elements();

        for( int i = 0; i < list.size(); i++ )
        {

        }
        List<Integer> s = new Stack<>();
        s.add(1);

        s.add(12);
        s.add(14);
        s.add(16);
        s.add(19);

    }

}
