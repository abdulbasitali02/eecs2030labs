import java.util.Date;

public class GraduateStudent extends Student{
    private String Supervisor;

    public GraduateStudent(String name, Date date, String studentNumber) {
        super(name, date, studentNumber);
    }

    public String getThesisSupervisor() {
        return Supervisor;
    }

    public void setThesisSupervisor(String Supervisor) {
        this.Supervisor = Supervisor;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.Supervisor;
    }
}
