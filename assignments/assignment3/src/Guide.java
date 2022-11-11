abstract class Guide {
    protected String id;
    protected int xDest;
    protected int yDest;
    boolean visited;
    //Constructor
    public Guide(String id, int xDest, int yDest){
        this.id=id;
        this.xDest=xDest;
        this.yDest=yDest;
        visited=false;
    }
    //method:isSameId()
    //@return boolean
    //check if the id is are the same
    public boolean isSameId(Guide guide){
        return id.equals(guide.getId());
    }

    //method:setVisted()
    //@returns void
    //set the visited status of the Guide object
    public void setVisited(boolean visited){
        this.visited=visited;
    }

    //method:hasVisited()
    //@returns boolean
    //return the status of the visited guide object
    public boolean hasVisited(){
        return visited;
    }

    //a constructor for the clone
    public Guide(Guide guide){
        this.id = guide.id;
        this.xDest=guide.xDest;
        this.yDest= guide.yDest;
    }

    //an abstract clone method that overrides other subclasses
    @Override
    public abstract Guide clone();

    //method: idToString()
    // @return String id
    //return the id as a string
    public String idToString(){
        return id;
    }

    //method: getId
    //@return getId
    //get the id
    private String getId() {
        return id;
    }
}
