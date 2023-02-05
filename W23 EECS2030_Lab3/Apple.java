public class Apple {
    public String type;
    public double sizeGrams;

    public Apple(String type, double sizeGrams){
        this.type = type;
        this.sizeGrams = sizeGrams;
    }

    public Apple(){
        Apple unknownApple = new Apple("unknown cultivar", 150);
        unknownApple.printAppleDetails();
    }

    public static void main(String[] args) {
        Apple unknownApple = new Apple("unknown cultivar", 150);
        unknownApple.printAppleDetails();
        
    }

    public String getType(){
        return this.type;
    }
    public double getSizeGrams(){
        return this.sizeGrams;
    }
    /* public Date getDatePicked(){
        return null;
    } */
    
    
    public void printAppleDetails(){
        System.out.println("Apple Type: " + getType() + " \nWeight(g): " + getSizeGrams());
    }
} 
