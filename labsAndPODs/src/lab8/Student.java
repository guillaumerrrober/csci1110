package lab8;

public class Student extends Person{
    private int StudentID;

    public Student(String n, int id){
        super(n);
        StudentID=id;
    }

    public void setStudent(){
        this.StudentID=StudentID;
    }

    public int getStudentID(){
        return StudentID;
    }

    @Override
    public  boolean isSame(Student other){
        return getStudentID()>StudentID;
    }

    public String toString(){
        super.toString();
        return String.valueOf(StudentID);
    }


}
