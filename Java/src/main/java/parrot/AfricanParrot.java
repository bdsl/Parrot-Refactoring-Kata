package parrot;

public class AfricanParrot implements Parrot {
    protected int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public double getSpeed() {
        double loadFactor = 9.0;

        return Math.max(0, baseSpeed - loadFactor * numberOfCoconuts);
    }
}
