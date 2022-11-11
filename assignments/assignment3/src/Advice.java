public class Advice extends  Guide{
    //constructor
    public Advice(Guide guide) {
        super(guide);
    }

    //return the  copy of advice
    @Override
    public Guide clone() {
        Advice advice=new Advice(this);
        return advice;
    }

    //return the id in lower case
    @Override
    public String idToString(){
        return id.toLowerCase();
    }



}
