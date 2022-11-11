public class Dwarf extends Character {

    public Dwarf(String name, int x, int y, int speed, int xDest, int yDest) {
        super(name, x, y, speed, xDest, yDest);
    }

    @Override
    public void advise(Character character) {
        //check if character is a dwarf
        if(character instanceof Dwarf) {
            //check eah collection
            for (Guide x : this.collection) {
                //check if x has advice or not
                if (x instanceof Relic) {
                    if (!character.collection.contains(x)) {
                        character.addGuide(new Advice(x));
                    }
                }
            }
        }
    }

    @Override
    public String getTribe() {
        return "Dwarf";
    }

}
