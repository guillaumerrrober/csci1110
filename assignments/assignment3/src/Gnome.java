public class Gnome extends Character {
    public Gnome(String name, int x, int y, int speed, int xDest, int yDest) {
        super(name, speed, x, y, xDest, yDest);
    }

    @Override
    public void advise(Character character) {
        //gnonme does not advise anyone
    }

    @Override
    public String getTribe() {
        return "Gnome";
    }
}
