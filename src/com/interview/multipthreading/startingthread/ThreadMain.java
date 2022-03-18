package com.interview.multipthreading.startingthread;

class ThreadClass extends Thread {

    public void run()
    {
        for( int i = 0; i < 5; i++ )
        {
            System.out.println("Tara " + i);
            try
            {
                Thread.sleep(100);
            }
            catch( InterruptedException e )
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

public class ThreadMain {

    public static void main( String[] args )
    {
        ThreadClass t1 = new ThreadClass();
        t1.start();

        ThreadClass t2 = new ThreadClass();
        t2.start();
    }

}
