/*class MyRun implements Runnable
{
    public void run()
    {
        
    }
}*/
class MyThread extends Thread {
    public MyThread(String name) {

        super(name);
        if (name.equals("My Thread 1"))
            setPriority(Thread.MAX_PRIORITY);
        // setPriority(Thread.MIN_PRIORITY+2);
    }

    public void run() {
        int count = 1;
        while (true) {
            System.out.println("NAME: " + this.getName() + "Count - " + count);
            System.out.println("Priority " + this.getPriority());
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadTest1 {

    public static void main(String[] args) {
        // Thread t=new Thread(new MyRun(),"My Name");

        MyThread t1 = new MyThread("My Thread 1");
        MyThread t2 = new MyThread("My Thread 2");
        t1.start();
        t2.start();
        // MyThread t = new MyThread("My Thread 1");

        // t.start();
        // t.interrupt();

        // System.out.println("ID " + t.getId());
        // System.out.println("Name " + t.getName());
        // System.out.println("Priority " + t.getPriority());
        // t.start();
        // System.out.println("State " + t.getState());
        // System.out.println("Alive " + t.isAlive());

    }

}