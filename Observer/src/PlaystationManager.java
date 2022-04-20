import java.util.Scanner;

public class PlaystationManager {
    private Scanner scanner;
    private Playstation playstation;

    void addGame(Game game) {
        playstation.notify(game);
    }

    void subscribeToPlaystation(Observer<Game> observer) {
        playstation.subscribe(observer);
    }
}
