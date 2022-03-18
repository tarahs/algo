package com.interview.singleton;

public class Singleton {

    private static volatile Singleton uniqueClass;

    private Singleton()
    {

    }

    public static synchronized Singleton getInstanceNotOptimized()
    {
        if( uniqueClass == null )
            uniqueClass = new Singleton();
        return uniqueClass;
    }

    //Double checked locking
    public static Singleton getInstance()
    {
        if( uniqueClass == null )
        {
            synchronized( Singleton.class )
            {
                if( uniqueClass == null )
                {
                    uniqueClass = new Singleton();
                }
            }
        }

        return uniqueClass;
    }

}
