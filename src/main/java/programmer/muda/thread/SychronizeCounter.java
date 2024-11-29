package programmer.muda.thread;

public class SychronizeCounter {

    private Long value = 0L;

    public void increment(){
        synchronized (this){
            value++;
        }
    }

    public Long getValue(){
        return value;
    }
}
