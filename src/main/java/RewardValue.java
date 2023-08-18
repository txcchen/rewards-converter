public class RewardValue {

    // RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
    // RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
    // RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
    // RewardValue must convert from miles to cash at a rate of 0.0035.

    private double cashValue;
    private static final double miles_to_cash = 0.0035;
    
    //constructors
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    public RewardValue(int mileValue){
        this.cashValue = mileValue * miles_to_cash;
    }

    //getters
    public double getCashValue(){
        return cashValue;
    }
    
    public int getMilesValue(){
        return (int) (cashValue / miles_to_cash);
    }

}
