import java.util.Date;

public class Apple implements Comparable<Apple> {
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

    /** 
     * @return String
     * returns the type of the apple.
     */
    public String getType(){
        return this.type;
    }

    /** 
     * @return double
     * returns the size of the apple in grams.
     */
    public double getSizeGrams(){
        return this.sizeGrams;
    }
    
    /** 
     * @return Date
     * returns a copy of datePicked object to prevent modification of the original object.
     */ 
    public Date getDatePicked(){
        return new Date(this.datePicked.getTime());
    }
   
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Apple other = (Apple) obj;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (Double.doubleToLongBits(Math.round(this.sizeGrams / 5.0) * 5.0) != Double.doubleToLongBits(Math.round(other.sizeGrams / 5.0) * 5.0))
            return false;
        if (datePicked == null) {
            if (other.datePicked != null)
                return false;
        } else if (!datePicked.equals(other.datePicked))
            return false;
        return true;
    
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        long temp;
        temp = Double.doubleToLongBits(sizeGrams);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((datePicked == null) ? 0 : datePicked.hashCode());
        return result;
    }

    @Override
    public String toString(){
        return "Apple Type: " + this.type + " \nWeight(g): " + this.sizeGrams + " \nDate Picked: " + this.datePicked + "\nHash Value: " + hashCode();
    }

    @Override
    public int compareTo(Apple a) {
        if (Math.round(this.sizeGrams / 5.0) * 5.0 > Math.round(a.sizeGrams / 5.0) * 5.0) {
            return 1;
        } else if (Math.round(this.sizeGrams / 5.0) * 5.0 < Math.round(a.sizeGrams / 5.0) * 5.0) {
            return -1;
        } else {
            return 0;
        }
} 

}
