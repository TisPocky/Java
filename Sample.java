public class Sample extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}