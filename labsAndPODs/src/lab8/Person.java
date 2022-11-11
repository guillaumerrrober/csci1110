package lab8;

public abstract class Person {
    protected String name;
    //constructor
    public Person(String n) {
        this.name=n;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public boolean isSame(Person other){
        return other.equals(name);
    }

    public abstract boolean isSame(Student other);

    public String toString(){
        return name;
    }
}
