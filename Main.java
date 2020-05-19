public class Main {

    public static void main(String[] args) {
        Converter myConvert = new Converter(20.0, 5.0);
        System.out.println(myConvert.getInches());
        System.out.println(myConvert.getFeet());

        myConvert.convertToFeet(myConvert.getInches()); //no static 
        Converter.convertToInches(myConvert.getFeet()); // static



    }
    
}