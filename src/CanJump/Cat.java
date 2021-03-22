package CanJump;

public class Cat implements CanJump, CanRun, CanShoot, CanShakes {
    private int jumpHeight;
    private int runLength;
    private int shootSpeed;
    private int shakesLength;

    public Cat(int jumpHeight, int runLength, int shootSpeed, int shakesLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
        this.shootSpeed = shootSpeed;
        this.shakesLength = shakesLength;
    }

    @Override
    public void jump(int height) {
        if (jumpHeight > height) {
            System.out.println("Я кот, я перепрыгнул!");
        } else {
            System.out.println("Я кот, я не перепрыгнул!");
        }
    }

    @Override
    public void run(int length) {
        if (runLength > length) {
            System.out.println("Я кот, я пробежал!");
        } else {
            System.out.println("Я кот, я не пробежал!");
        }
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }

    public void setShootSpeed(int shootSpeed) {
        this.shootSpeed = shootSpeed;
    }

    public void setShakesLength(int shakesLength) {
        this.shakesLength = shakesLength;
    }

    @Override
    public double shakes(int length) {
        return shakesLength * length;
    }

    @Override
    public double shoot(int speed) {

        return shootSpeed * speed;
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

    public int getShakesLength() {
        return shakesLength;
    }
}


