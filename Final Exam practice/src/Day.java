import java.time.Month;
import java.util.Arrays;

public enum Day {
    
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31);

    private final int MonthDays;
    
    private Day(int MonthDays){
        this.MonthDays = MonthDays;
    }

    public int MonthDays(int MonthDays){
        if (this != FEBRUARY){
            return this.MonthDays;
        }

        return this.MonthDays;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Day.values()) );
    }
}

