package programmer.muda.thread;

public class DaemonApp {
    public static void main(String[] args) {

        var thread = new Thread(()->{
            try {
                Thread.sleep(3_000);
                System.out.println("Run thread");
            }catch (InterruptedException exception){
                exception.printStackTrace();
            }
        });

        thread.setDaemon(true);
        thread.start();
    }
}
