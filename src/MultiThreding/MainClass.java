package MultiThreding;

public class MainClass {
    public static void main(String[] args) {

        Runnable rt1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread t1 = new Thread(rt1);
        t1.start();

    }
}
