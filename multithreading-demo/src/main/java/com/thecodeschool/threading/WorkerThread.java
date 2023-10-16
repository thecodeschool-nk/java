package com.thecodeschool.threading;

class WorkerThread implements Runnable {  
    private String message;  
    public WorkerThread(String s){  
        this.message=s;  
    }  

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
        processMessage();
        System.out.println(Thread.currentThread().getName()+" (End)");
    }  
    private void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WorkerThread workerThread = new WorkerThread("message1");
        Thread t1 = new Thread(workerThread);
        t1.start();

        Thread t2 = new Thread(workerThread);
        t2.start();
    }
}  