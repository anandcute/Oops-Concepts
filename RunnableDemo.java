class ThreadRun implements Runnable{
    public void run(){
        for (int i=0; i< 5; i++){
            System.out.println("Child Thread " + i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable r =new ThreadRun();
        Thread t = new Thread(r);
        t+++++++++++.start();
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
