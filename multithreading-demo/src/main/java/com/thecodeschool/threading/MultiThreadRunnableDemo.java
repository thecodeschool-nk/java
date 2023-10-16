package com.thecodeschool.threading;

public class MultiThreadRunnableDemo {
    /*public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            MyThreadRunnable myRunnable = new MyThreadRunnable();
            Thread myThread = new Thread(myRunnable);
            myThread.start();
        }
    }*/

    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            Thread myThread = new Thread(() -> System.out.println("Thread " + Thread.currentThread().getId() + " is running"));
            myThread.start();
        }
    }
}

class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    }
}