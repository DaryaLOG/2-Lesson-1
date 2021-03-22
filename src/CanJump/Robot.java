package CanJump;

public class Robot implements CanJump, CanRun, CanShoot, CanShakes {
    private int jumpHeight;
    private int runLength;
    private int shootSpeed;
    private int shakesLength;

    @Override
    public void jump(int height) {
        if (jumpHeight >= height) {
            System.out.println("Я робот, я перепрыгнул!");
        } else {
            System.out.println("Я робот, я не перепрыгнул!");
        }
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRunLength() {
        return runLength;
    }

    public int getShootSpeed() {
        return shootSpeed;
    }

    public Robot(int jumpHeight, int runLength, int shootSpeed, int shakesLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
        this.shootSpeed = shootSpeed;
        this.shakesLength = shakesLength;
    }

    public int getShakesLength() {
        return shakesLength;
    }

    @Override
    public void run(int length) {
        if (runLength >= length) {
            System.out.println("Я робот, я пробежал!");
        } else {
            System.out.println("Я робот, я не пробежал!");
        }
    }

    @Override
    public double shakes(int length) {
        return shakesLength * length;
    }

    @Override
    public double shoot(int speed) {

        return shootSpeed * speed;
    }


}
