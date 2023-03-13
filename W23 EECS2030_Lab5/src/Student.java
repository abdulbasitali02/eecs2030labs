import java.util.Date;

public class Student extends Person {
    // any student has a student number; it can never be changed and may include digits and hyphens.
    private String studentNumber;

    public Student(String name, Date date, String studentNumber) {
        super(name, date);
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.studentNumber;
    }


}
