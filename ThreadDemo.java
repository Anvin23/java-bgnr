package com.company;

// Threads can be created by extending Thread class and overriding the run method
class Mythread1 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while(i<1000)
        {
            System.out.println("First thread runnning");
            i++;
        }
    }
}

class Mythread2 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while(i<1000)
        {
            System.out.println("Second thread runnning");
            i++;
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();  // start is used to start the thread
        t2.start();  // start executes the 'run' method of the thread
    }
}
