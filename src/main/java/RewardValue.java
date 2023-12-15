import javax.swing.text.ComponentView;

public class RewardValue {

    private double cashValue;
    private int milesValue;
    private final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return milesToCash(milesValue);
    }

    public double getMilesValue() {
        return cashToMiles(cashValue);
    }

    public int cashToMiles(double cash) {
        return (int) (cash / CONVERSION_RATE);
    }

    public double milesToCash(int miles) {
        return miles * CONVERSION_RATE;
    }
}
