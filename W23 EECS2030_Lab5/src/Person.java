import java.util.Date;

public class Person {
    private final String name;
    private final Date dob;

    public Person(String name, Date dob) {
        this.name = name;
        this.dob = (Date) dob.clone();
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\nDOB: " + this.dob.toString() + "\n";
    }

    public String getDob() {
        return "\n" + this.dob.toString();
    }
}
