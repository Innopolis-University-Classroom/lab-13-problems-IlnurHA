public class PlaystationFan implements Observer<Game> {
    @Override
    public void update(Game game) {
        if (game.getTitle().equals("PlayStation"))
            System.out.println("Playstation is updated");
    }
}
