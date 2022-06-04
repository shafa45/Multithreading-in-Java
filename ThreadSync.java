class MyData {
    synchronized void display(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}

class Thread1 extends Thread {
    MyData d;

    Thread1(MyData d) {
        this.d = d;
    }

    public void run() {
        d.display("Happy :)");

    }
}

class Thread2 extends Thread {
    MyData d;

    Thread2(MyData d) {
        this.d = d;
    }

    public void run() {
        d.display(" Sad :(");

    }
}

class Thread3 {
    public static void main(String[] args) {
        /*
         * Single data object shared by both thread in non synchronisation way unless
         * synchronisation keyword is used
         */
        MyData d = new MyData();
        Thread1 t1 = new Thread1(d);
        Thread2 t2 = new Thread2(d);
        t1.start();
        t2.start();
    }
}