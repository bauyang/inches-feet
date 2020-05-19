
public class Converter {
    private double inches;
    private double feet;

    //default constructor
    public Converter(){
        inches = 0;
        feet = 0;
    }


    // Constructor always has to be named the same as the class
    public Converter(double inputInches, double inputFeet){
        inches = inputInches;
        feet = inputFeet;
    }
    
    //getter
    public double getInches(){
        return inches;
    }

    public double getFeet(){
        return feet;
    }

    //setter
    public void setInches(double inputInches){
        inches = inputInches;
    }

    public void setFeet(double inputFeet){
        feet = inputFeet;
    }


    public void convertToFeet(double inputInches){
        double temp = inputInches / 12;
        System.out.println(inputInches + " inches equals " + temp + " feet");
    } 

    public static void convertToInches(double inputFeet){
        double temp = inputFeet * 12;
        System.out.println( inputFeet + " feet equals " + temp + " inches");
    }
    
}