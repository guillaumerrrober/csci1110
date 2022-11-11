public class Elf extends Character{
    public Elf(String name, int x, int y, int speed, int xDest, int yDest) {
        super(name, x, y, speed, xDest, yDest);
    }

    @Override
    public void advise(Character character) {
        for(Guide x : this.collection){
            //check if x is advice
            if(x instanceof Relic) {
                if(!character.collection.contains(x)) {
                    character.addGuide(new Advice(x));
                }
            }
        }
    }

    @Override
    public String getTribe() {
        return "Elf";
    }
}
