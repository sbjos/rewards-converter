public class RewardValue {
    private final double cashValue;
    private final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = milesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

     public double getMilesValue() {
        return cashToMiles(this.cashValue);
    }

    public int cashToMiles(double cash) {
        return (int) (cash / CONVERSION_RATE);
    }

    public double milesToCash(int miles) {
        return miles * CONVERSION_RATE;
    }
}
