package com.interview.multipthreading.startingthread;

class Runner implements Runnable {

    @Override
    public void run()
    {

        Long startTime = System.currentTimeMillis();

        // TODO Auto-generated method stub
        for( int i = 0; i < 100; i++ )
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
        Long endTime = System.currentTimeMillis();
        System.out
                .println((endTime - startTime) + "ms is the total time taken to run for " + this.getClass().getName());

    }

}

public class RunnableMain {

    public static void main( String[] args ) throws InterruptedException {
        // TODO Auto-generated method stub
        Thread t1 = new Thread(new Runner());
        Thread t2 = new Thread(new Runner());
        t1.start();
        t2.start();
        t2.join();
        Thread t3 = new Thread(new Runnable() {

            @Override
            public void run()
            {
                try
                {
                    Thread.sleep(517);
                }
                catch( InterruptedException e )
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("This is a custom logic for Thread3");

            }
        });
        t3.start();

    }

}
