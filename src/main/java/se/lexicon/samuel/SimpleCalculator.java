package se.lexicon.samuel;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    private double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public double setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
        return firstNumber;
    }
    public double setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
        return secondNumber;
    }
    public double getAdditionResult(){
        double result;
        result = getFirstNumber() + getSecondNumber();
        return result;
    }
    public double getSubtractionResult(){
        double result;
        result = getFirstNumber() - getSecondNumber();
        return result;
    }
    public double getMultiplicationResult(){
        double result;
        result = getFirstNumber() * getSecondNumber();
        return result;
    }
    public double getDivisionResult(){
        double result;
        result = getFirstNumber() / getSecondNumber();
        if(getSecondNumber() == 0){
            return 0;
        }
        return result;
    }
}
