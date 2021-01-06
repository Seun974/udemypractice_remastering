package se.lexicon.samuel;


public class App 
{
    public static void main( String[] args ) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        calculator.getAdditionResult();
        System.out.println("addition =  " + calculator.getAdditionResult());
        System.out.println("subtraction =  " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);

        System.out.println("multiplication =  " + calculator.getMultiplicationResult());
        System.out.println("division =  " + calculator.getDivisionResult());
    }
}























































//    double valueOfCentimeters = calcFeetAndInchesToCentimeters(1, 1);
//        System.out.println(valueOfCentimeters);
//    calcFeetAndInchesToCentimeters(157);
//
//
//
//}
//    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
//        double centimeters;
//        if(feet < 0 || inches < 0 || inches > 12){
//            System.out.println("invalid inch or feet parameters");
//            return -1;
//        } else {
//            centimeters = ((inches * 2.54) + (feet * 12 * 2.54));
//            //System.out.println("you can have a statement here to explain what you computed");
//            System.out.println(feet + " feet, " + inches + " in " + " = " + centimeters);
//            return centimeters;
//        }
//    }
//    public static double calcFeetAndInchesToCentimeters(double inches){
//        if(inches < 0){
//            return -1;
//        }
//        double feet = (int) inches / 12;
//        //the line below helps us get the remainder
//        double remainingInches = (int) inches % 12;
//        System.out.println("value of inches in feet is:" + feet + "ft" + " and " + remainingInches + "in");
//        return calcFeetAndInchesToCentimeters(feet, remainingInches);
//    }