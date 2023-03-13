import java.util.Date;

public class Person {
    private final String name;
    private final Date dob;

    public Person(String name, Date date) {
        this.name = name;
        this.dob = date;
    }

    @Override
    public String toString(){
        return this.name + " " + this.dob.toString();
    }

    public String getDob() {
        return this.dob.toString();
    }
}
