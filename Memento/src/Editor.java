public class Editor<T> {
    History<T> history;

    Editor() {
        history = new History<>();
    }

    public void write(T state) {
        history.push(state);
    }

    public T undo() {
        return history.undo().state;
    }
}
