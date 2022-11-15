package com.company;

class My_thread extends Thread
{
    public My_thread(String name)
    {
        super(name);
    }

    public void run()
    {
        int i=0;
        while(i<10)
        {
            System.out.println(this.getName() + " is running....");
            System.out.println("id : " + this.getId());
            i++;
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        My_thread t1 = new My_thread("ABC");
        My_thread t2 = new My_thread("DEF");
        My_thread t3 = new My_thread("GHI");
        My_thread t4 = new My_thread("JKL");

        t4.setPriority(Thread.MAX_PRIORITY);  // we  can set priority to threads
        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(7);

        // The OS itself sets a priority
        // Therefore priority setting is not very reliable
        // Priority is dependant on OS

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
