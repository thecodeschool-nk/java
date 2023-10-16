package com.thecodeschool.threading;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyIssueDemo {

  public static void main(String[] args) {
    MyConcurrentThread thread1 = new MyConcurrentThread();
    MyConcurrentThread thread2 = new MyConcurrentThread();
    thread1.start();
//    while(thread1.isAlive());
    thread2.start();
  }
}

class MyConcurrentThread extends Thread {
  private static int amount = 0;
  private static final ReentrantLock reentrantLock = new ReentrantLock();

  public void run() {
    System.out.println(Thread.currentThread() + "::Before increment " + getAmount());
    increment();
    System.out.println(Thread.currentThread() + "::After increment " + getAmount());
  }

  private static int getAmount() {
    System.out.println("Thread " + Thread.currentThread() + " is reading.");
    return amount;
  }
/*  private static void increment() {
    System.out.println("Thread " + Thread.currentThread() + " is incrementing. Amount: " + amount);
    amount++;
  }*/

  private /*synchronized*/ static void increment() {
    reentrantLock.lock();
    System.out.println("Thread " + Thread.currentThread() + " is incrementing. Amount: " + amount);
//    synchronized (MyConcurrentThread.class) {
//      amount++;
//    }
    reentrantLock.unlock();
  }

}