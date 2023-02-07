import java.util.Date;

public class Apple {
    public static void main(String[] args) {
        Apple newApple = new Apple("Golden Delicious", 57.8, new Date());
        String newApple1 = newApple.toString();



        System.out.println(newApple1); 
    }
    private final String type;
    private final double sizeGrams;

    private final Date datePicked;

    public Apple(String type, double sizeGrams, Date datePicked){
        this.type = type;
        this.sizeGrams = sizeGrams;
        this.datePicked = datePicked;
    }

    public Apple(){
        this("Unknown Cultivar", 150.0, new Date());
    }

    public String getType(){
        return this.type;
    }
    public double getSizeGrams(){
        return this.sizeGrams;
    }
    
    /** 
     * @return Date
     * Makes a copy of datePicked object to prevent modification of the original object.
     */ 
    public Date getDatePicked(){
        return new Date(this.datePicked.getTime());
    }
   
    @Override
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        
        // Change to round to nearest 5g.
        Apple defaultApple = (Apple) obj;

        if (this.type != defaultApple.type) return false;
        if (this.sizeGrams != defaultApple.sizeGrams) return false;
        if (this.datePicked != defaultApple.datePicked) return false;
        
        return true;
    }

    // change to round to nearest 5g.
    @Override
    public int hashCode(){
        int result = 17;
        int prime = 31;
        result = prime * result + this.type.hashCode();
        result = prime * result + (int) this.sizeGrams;
        result = prime * result + this.datePicked.hashCode();
        return result;
    }

    @Override
    public String toString(){
        return "Apple Type: " + this.type + " \nWeight(g): " + this.sizeGrams + " \nDate Picked: " + this.datePicked + "\n\bHash Value: " + hashCode();
    }

    public void printAppleDetails(){
        System.out.println("Apple Type: " + getType() + " \nWeight(g): " + getSizeGrams());
        System.out.println("Hash Value: " + hashCode());
    }
} 
