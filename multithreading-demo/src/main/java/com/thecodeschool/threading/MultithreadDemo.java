package com.thecodeschool.threading;

public class MultithreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        int n = 50;
        for (int i = 0; i < n; i++) {
            MyThread myThread = new MyThread();
            myThread.start();
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

