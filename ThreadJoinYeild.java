class ThreadTest2 extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }

    public static void main(String[] args) throws Exception {

        ThreadTest2 t = new ThreadTest2();
        // t.setDaemon(true); // thread will not execute as main thread ends
        t.start();
        // Thread mainThread = new Thread(currentThread());
        // try {
        // Thread.sleep(100);
        // }
        // t.join();

        // catch (InterruptedException e) {
        // }

        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;
            Thread.yield(); // guve more priority to other threads
        }

    }
}
