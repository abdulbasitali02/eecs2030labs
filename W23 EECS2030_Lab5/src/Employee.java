import java.util.Date;

public class Employee extends Person {
    private String employeeNumber;

    //any employee has an employee number; it can never be changed and may include digits and hyphens. Also, an employee must be either hourly or on a salary (but not both).

    public Employee(String name, Date date, String employeeNumber) {
        super(name, date);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        return "Employee\n" + super.toString() + "Employee Number: " + this.employeeNumber;
    }

    

}
