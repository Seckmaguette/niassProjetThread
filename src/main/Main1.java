package main;

import threads.Thread1;
import threads.Thread2;
import threads.Thread3;

import java.util.concurrent.TimeUnit;

public class Main1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        System.out.println("Name = " + t1.getName());
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 1;
                while (true){
                    try {
                        //Thread.sleep(1000);
                        TimeUnit.SECONDS.sleep(1);
                        if(i == 10) break;
                        System.out.println("Thread main, i = "+i);
                        i++;
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        t3.start();

        Runnable r = ()->{
            int i = 1;
            while (true){
                try {
                    Thread.sleep(1000);
                    if(i == 10) break;
                    System.out.println("Thread 4, i = "+i);
                    i++;
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        };

        Thread t4 = new Thread(r);
        t4.run();
    }
}
