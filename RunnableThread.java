package com.company;

// Threads can be created by implementing Runnable Interface and overriding the run method
class RThread1 implements Runnable
{
    public void run()
    {
        int i=0;
        while(i<1000)
        {
            System.out.println("Thread 1 is running....");
            i++;
        }
    }
}

class RThread2 implements Runnable
{
    public void run()
    {
        int i=0;
        while(i<1000)
        {
            System.out.println("Thread 2 is running....");
            i++;
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        RThread1 rt1 = new RThread1();  // make a runnable thread object and give it into Thread object
        Thread t1 = new Thread(rt1);

        RThread2 rt2 = new RThread2();
        Thread t2 = new Thread(rt2);

        t1.start();   // starts the thread execution by calling the run method
        t2.start();

    }
}
