/**
 * @author Janmajaya
 * @project rewards-converter
 */
public class RewardValue {

    private double cashValue;
    public static final double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);
    }

    private double convertMilesToCash(int milesValue) {
        return milesValue * conversionRate;
    }

    private int convertCashToMiles(double cashValue) {
        return (int) (cashValue / conversionRate);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertCashToMiles(cashValue);
    }


}
