public class ThreadExample {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample();
        s1.start();
        s2.start();
    }
}
