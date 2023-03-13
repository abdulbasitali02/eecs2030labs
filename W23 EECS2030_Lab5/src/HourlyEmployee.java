import java.util.Date;

public class HourlyEmployee extends Employee {

    private double hourlyRate;

    public HourlyEmployee(String name, Date date, String employeeNumber, double hourlyRate) {
        super(name, date, employeeNumber);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.hourlyRate + " " ;
    }
}
