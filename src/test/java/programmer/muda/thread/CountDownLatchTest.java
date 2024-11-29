package programmer.muda.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountDownLatchTest {

    @Test
    void test() throws InterruptedException {

        final var countDownLatch = new CountDownLatch(5);
        final var executer = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 5; i++) {
            executer.execute(()->{
                try {
                    System.out.println("Start task");
                    Thread.sleep(2000);
                    System.out.println("Finish task");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    countDownLatch.countDown();
                }
            });
        }

        executer.execute(()->{
            try {
                countDownLatch.await();
                System.out.println("Finish All task");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executer.awaitTermination(1, TimeUnit.DAYS);
    }
}
