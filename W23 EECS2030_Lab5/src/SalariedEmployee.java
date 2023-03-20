import java.util.Date;

public class SalariedEmployee extends Employee {
    private double salary;

    
    public SalariedEmployee(String name, Date dob, String employeeId) {
        super(name, dob, employeeId);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){

        return super.toString() + ;
    }
    
}
