import java.util.Date;
import java.util.Set;

public class mainTest {
  public static void main(String[] args) {

    Apple newApple = new Apple("Golden Delicious", 57.8, new Date());
    
    String str =  newApple.toString();
    String str1 = newApple.getType();
    Date d8 = newApple.getDatePicked();

    System.out.println(d8);

  }
    
}
