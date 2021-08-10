package parrot;

public class NorwegianBlueParrot implements Parrot
{
    protected double voltage;
    protected boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.isNailed = isNailed;
        this.voltage = voltage;
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getNonNailedSpeed(voltage);
    }

    private double getNonNailedSpeed(double voltage) {
        return Math.min(24.0, voltage * Parrot.baseSpeed);
    }
}
