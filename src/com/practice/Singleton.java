package com.practice;

/**
 * Created by Deepak on 8/13/19.
 */
public class Singleton {
    private static volatile Singleton singletonInstance;

    private Singleton(){}

    public static Singleton getSingletonInstance(){
        if(singletonInstance == null){
            synchronized (Singleton.class){
                if (singletonInstance == null)
                    singletonInstance = new Singleton();
            }
        }
        return singletonInstance;
    }

    

}
