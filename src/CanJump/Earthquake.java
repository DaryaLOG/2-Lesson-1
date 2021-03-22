package CanJump;

public class Earthquake {
    private int earthLength;

    public Earthquake(int earthLength) {
        this.earthLength = earthLength;
    }

    public double getTimeToOvercomeArchery(CanShakes shakess) {
        return shakess.shakes(earthLength);

    }
}

