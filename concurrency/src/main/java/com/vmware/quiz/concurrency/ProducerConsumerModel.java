package com.vmware.quiz.concurrency;

public class ProducerConsumerModel {

    public static void main(String[] args) {
        ConcurrencyQueue queue = new ConcurrencyQueue(20);
        Producer p = new Producer(queue);
        Consumer c = new Consumer(queue);

        new Thread(p).start();
        new Thread(c).start();

    }

    static class Producer implements Runnable {
        private ConcurrencyQueue queue ;

        public Producer(ConcurrencyQueue queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                queue.push();
            }
        }
    }

    static class Consumer implements Runnable {
        private ConcurrencyQueue queue;

        public Consumer(ConcurrencyQueue queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                queue.pop();
            }
        }
    }
}
