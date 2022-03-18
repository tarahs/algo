package com.interview.sortelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainSort {

    public static void main( String[] args )
    {

        //----Sorting an Array--------
        String[] list = new String[] { "Tara", "Sheela", "Deepu", "Anita", "Savita" };
        System.out.println("Before sorting an Array");
        for( int i = 0; i < list.length; i++ )
        {
            System.out.print(list[i] + " \t");
        }

        Arrays.sort(list);
        System.out.println("\n\nAfter sorting an Array");
        for( int i = 0; i < list.length; i++ )
        {
            System.out.print(list[i] + "\t");
        }

        //-------Sorting an ArrayList
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Tara");
        arrayList.add("Sheela");
        arrayList.add("Deepu");
        arrayList.add("Anita");
        arrayList.add("Savita");

        System.out.println("\n\nBefore sorting an ArrayList");
        for( int i = 0; i < arrayList.size(); i++ )
        {
            System.out.print(arrayList.get(i) + " \t");
        }

        Collections.sort(arrayList);

        System.out.println("\n\nAfter sorting an ArrayList");
        for( int i = 0; i < arrayList.size(); i++ )
        {
            System.out.print(arrayList.get(i) + " \t");
        }

        //-------Sorting an ArrayList of Objects
        List<User> usersList = new ArrayList<User>();
        User usr1 = new User(1, "a", "b");
        User usr2 = new User(2, "a", "b");
        User usr3 = new User(3, "a", "b");
        User usr4 = new User(4, "a", "b");
        User usr5 = new User(5, "a", "b");
        usersList.add(usr4);
        usersList.add(usr2);
        usersList.add(usr5);
        usersList.add(usr1);
        usersList.add(usr3);
        System.out.println("\n\nBefore sorting an ArrayList of Objects");
        for( User usr : usersList )
        {
            System.out.print(usr.getId() + "\t");
        }

        Collections.sort(usersList);
        System.out.println("\n\nAfter sorting an ArrayList of Objects");
        for( User usr : usersList )
        {
            System.out.print(usr.getId() + "\t");
        }

    }

}
