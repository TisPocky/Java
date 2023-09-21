public class ThreadRunnable {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        t1.start();
        t2.start();
    }

}
