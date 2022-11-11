public class Player {
    private String name;
    private int position;
    private boolean hasWon;

//constructor
    public Player(String name) {
        this.name=name;
        //this and non this is the same
        position=1;
        hasWon=false;

        verify();
            }
    public void verify(){
        if(this.name.equals("Rob")){
            this.position=2;
        }

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isHasWon() {
        return hasWon;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }
}