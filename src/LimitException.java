
public class LimitException extends Exception{
    private double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message + remainingAmount);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
