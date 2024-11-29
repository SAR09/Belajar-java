package programmer.muda.thread;

public class MainAplication {

    public static void main(String[] args) {
        var name = Thread.currentThread().getName();
        System.out.println(name);
    }
}
