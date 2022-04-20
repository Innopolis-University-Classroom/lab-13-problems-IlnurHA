public class DarkSoulsFan implements Observer<Game>{
    @Override
    public void update(Game game) {
        if (game.getTitle().equals("Dark Souls"))
            System.out.println("Dark Souls is updated");
    }
}
