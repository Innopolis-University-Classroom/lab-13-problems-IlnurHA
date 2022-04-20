import java.util.ArrayList;

public class Playstation {
    ArrayList<Observer<Game>> mObserver;

    public void subscribe(Observer<Game> gameObserver) {
        mObserver.add(gameObserver);
    }

    public void notify(Game game) {
        for (Observer<Game> observer : mObserver) {
            observer.update(game);
        }
    }
}
