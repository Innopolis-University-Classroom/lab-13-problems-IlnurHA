import java.util.ArrayDeque;

public class History<T> {
    ArrayDeque<Memento<T>> history;

    public void push(T state) {
        history.offer(new Memento<>(state));
    }

    public Memento<T> undo() {
        return history.poll();
    }
}
