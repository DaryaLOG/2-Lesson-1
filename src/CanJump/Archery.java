package CanJump;

public class Archery {
    private int archerySpeed;

    public Archery(int archerySpeed){
        this.archerySpeed = archerySpeed;
    }
    public double getTimeToOvercomeArchery(CanShoot shooter){
        return shooter.shoot(archerySpeed);
    }

}
