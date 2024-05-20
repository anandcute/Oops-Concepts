//THREAD
class Demo extends Thread {
    public void run() {
        for (int i=0; i< 5; i++){
            System.out.println("Child Thread " + i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
}   }



public class MultiThreadDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.start();
        for (int i=0; i< 5; i++){
            System.out.println("main Thread " + i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
