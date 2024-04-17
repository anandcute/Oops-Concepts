class Multi1 extends Thread {
   public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("first multithreading" + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }

        }
    }
}
class Multi2 extends Thread {
   public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("second multithreading" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

        }
    }

}

public class MultiThreading {
    public static void main(String[] args) {
        Multi1 m =new Multi1();
        Multi2 m1 =new Multi2();
        m.start();
        m1.start();
    }
}
