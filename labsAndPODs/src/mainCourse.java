import java.util.Scanner;
public class mainCourse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String courName=in.nextLine();
        String instructor=in.nextLine();
        int crn=in.nextInt();
        int creditHours=in.nextInt();
        Course newCourse= new Course(crn, creditHours, courName, instructor);
        System.out.println(newCourse);
    }
}
