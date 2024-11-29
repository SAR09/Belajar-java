package programmer.muda.thread;

import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ForkJoinTest {
    @Test
    void create() {

        var forkJoinPool1 = ForkJoinPool.commonPool();
        var forkJoinPool2 = new  ForkJoinPool(5);

        var executor1 = Executors.newWorkStealingPool();
        var executor2 = Executors.newWorkStealingPool(5);


    }

    @Test
    void recrusiveAction() throws InterruptedException {

        var pool = ForkJoinPool.commonPool();
        List<Integer> integers = IntStream.range(0, 1000).boxed().collect(Collectors.toList());

        var task = new SimpleForkJoinTask(integers);
        pool.execute(task);

        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.DAYS);
    }

    @Test
    void recursiveTask() throws InterruptedException, ExecutionException {
        var pool = ForkJoinPool.commonPool();
        List<Integer> integers = IntStream.range(0, 1000).boxed().collect(Collectors.toList());

        var task = new TotalRecrusiveTask(integers);
        ForkJoinTask<Long> submit = pool.submit(task);

        Long along = submit.get();
        System.out.println(along);

        long sum = integers.stream().mapToLong(value -> value).sum();
        System.out.println(sum);

        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.DAYS);
    }

    public static class SimpleForkJoinTask extends RecursiveAction{

        private List<Integer> integers;

        public SimpleForkJoinTask(List<Integer> integers) {
            this.integers = integers;
        }

        @Override
        protected void compute() {
            if (integers.size() <= 10){
                //ekseukusi
                doExecute();
            }else {
                // forking
                forCompute();
            }
        }

        private void forCompute() {
            List<Integer> integer1 = integers.subList(0, integers.size() / 2);
            List<Integer> integer2 = this.integers.subList(this.integers.size() / 2, this.integers.size());

            SimpleForkJoinTask task1 = new SimpleForkJoinTask(integer1);
            SimpleForkJoinTask task2 = new SimpleForkJoinTask(integer2);

            ForkJoinTask.invokeAll(task1, task2);
        }

        private void doExecute() {
            integers.forEach(integer -> System.out.println(Thread.currentThread().getName() + " : " + integer));
        }
    }

    public static class TotalRecrusiveTask extends RecursiveTask<Long>{

        private List<Integer> integers;

        public TotalRecrusiveTask(List<Integer> integers) {
            this.integers = integers;
        }

        @Override
        protected Long compute() {
            if (integers.size() <= 10){
                return doCompute();
            }else {
                return forkCompute();
            }
        }

        private Long forkCompute() {
            List<Integer> integer1 = integers.subList(0, integers.size() / 2);
            List<Integer> integer2 = this.integers.subList(this.integers.size() / 2, this.integers.size());

            TotalRecrusiveTask task1 = new TotalRecrusiveTask(integer1);
            TotalRecrusiveTask task2 = new TotalRecrusiveTask(integer2);

            ForkJoinTask.invokeAll(task1, task2);

            return task1.join() + task2.join();

        }

        private Long doCompute() {
            return integers.stream().mapToLong(value -> value).peek(value -> {
                System.out.println(Thread.currentThread().getName() + " : " + value);
            }).sum();
        }
    }
}
