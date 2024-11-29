package programmer.muda.thread;

import org.junit.jupiter.api.Test;

public class ThreadTest {
    @Test
    void mainThread() {
        var name = Thread.currentThread().getName();
        System.out.println(name);
    }

    @Test
    void createThread() {
        Runnable runnable = () -> {
            System.out.println("Hello from thread : " + Thread.currentThread().getName());
        };

        var thread = new  Thread(runnable);
        thread.start();

        System.out.println("Program Selesai");
    }

    @Test
    void testThreadSleep() throws InterruptedException {

        Runnable runnable = () ->{
            try {
                Thread.sleep(2_000);
                System.out.println("Hello from thread : " + Thread.currentThread().getName());
            }catch (InterruptedException exception){
                exception.printStackTrace();
            }
        };

        var thread = new Thread(runnable);
        thread.start();

        System.out.println("program selesai");

        Thread.sleep(3_000);

    }

    @Test
    void testThreadJoin() throws InterruptedException {

        Runnable runnable = () ->{
            try {
                Thread.sleep(2_000);
                System.out.println("Hello from thread : " + Thread.currentThread().getName());
            }catch (InterruptedException exception){
                exception.printStackTrace();
            }
        };

        var thread = new Thread(runnable);
        thread.start();
        System.out.println("menunggu selesai");
        thread.join();

        System.out.println("program selesai");



    }

    @Test
    void testThreadJInteruptIncorrect() throws InterruptedException {

        Runnable runnable = () ->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable : " + i);
                try {
                    Thread.sleep(1_000);
                }catch (InterruptedException exception){
                    exception.printStackTrace();
                }
            }
        };

        var thread = new Thread(runnable);
        thread.start();
        Thread.sleep(5_000);
        thread.interrupt();
        System.out.println("menunggu selesai");
        thread.join();

        System.out.println("program selesai");

    }

    @Test
    void testThreadJInteruptCorrect() throws InterruptedException {

        Runnable runnable = () ->{
            for (int i = 0; i < 10; i++) {
                // manual check interrupted
//                if (Thread.interrupted()){
//                    return;
//                }
                System.out.println("Runnable : " + i);
                try {
                    Thread.sleep(1_000);
                }catch (InterruptedException exception){
                    return;
                }
            }
        };

        var thread = new Thread(runnable);
        thread.start();
        Thread.sleep(5_000);
        thread.interrupt();
        System.out.println("menunggu selesai");
        thread.join();

        System.out.println("program selesai");

    }

    @Test
    void threadName() {
        var thread =  new Thread(()->{
            System.out.println("Run in thread : " + Thread.currentThread().getName());
        });
        thread.setName("Saiful");
        thread.start();
    }

    @Test
    void threadState() throws InterruptedException {
        var thread =  new Thread(()->{
            System.out.println(Thread.currentThread().getState());
            System.out.println("Run in thread : " + Thread.currentThread().getName());
        });
        thread.setName("Saiful");
        System.out.println(thread.getState());
        thread.start();
        thread.join();
        System.out.println(thread.getState());
    }
}
