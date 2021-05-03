package com.vmware.quiz.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrencyQueue<o> {
    private int maxSize;
    private List<Integer> storage;
    private int a = 0;

    public ConcurrencyQueue(int maxSize) {
        this.maxSize = maxSize;
        this.storage = new CopyOnWriteArrayList<>();
    }

    public synchronized void push() {
        while (storage.size() == maxSize){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        storage.add(a++);

        notify();
    }

    public synchronized void pop() {
        while(storage.size() == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        storage.get(0);
        storage.remove(0);
        notify();
    }
}
