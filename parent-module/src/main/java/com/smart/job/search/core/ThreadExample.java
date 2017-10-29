package com.smart.job.search.core;

public class ThreadExample {

    public static void main(String[] args) {


        //start --->run
        //stop(interrupt)
        //sleep
        //wait

        MyThread1 t1=new MyThread1();
        t1.start(); //--------------->submit to scheduler------>queue()
        //Team work(------------wait)
        //notify()

       Thread t2=new Thread(new MyThread2());
       t2.start(); //------------------>submit to scheduler

    }

}



class MyThread1 extends Thread{

    @Override
    public void run() {
        System.out.println("Hello 1");
    }
}

class MyThread2 implements Runnable{

    public void run() {

        System.out.println("Hello 1");


    }
}





//Thread class extends , Runnable implements