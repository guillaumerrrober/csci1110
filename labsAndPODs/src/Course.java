public class Course {
    //attribute
    private int crn;
    private int creditHours;
    private String courseName;
    private String instructor;

    //constructor
    public Course(int crn, int creditHours, String courseName, String instructor) {
        this.crn = crn;
        this.creditHours = creditHours;
        this.courseName = courseName;

    }

    @Override
    public java.lang.String toString() {
        if(creditHours==1){
            creditHours=2;
        }
        return "Course: "+courseName
                +"\nInstructor: "+instructor
                +"\ncrn: "+crn
                +"\ncredit hours: "+creditHours;
    }
}
