package ds.queue;

public class app {
    public static void main(String[] args) {
        Queue que = new Queue(5);
        que.insert(2);
        que.insert(2);
        que.view();
    }
}
