package CanJump;


public class Human implements CanJump, CanRun, CanShoot,CanShakes {
    public int jumpHeight;
    public int runLength;
    public int shootSpeed;
    public int shakesLength;

    public Human(int jumpHeight, int runLength, int shootSpeed, int shakesLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
        this.shootSpeed = shootSpeed;
        this.shakesLength = shakesLength;
    }

    @Override
    public void jump(int height) {
        if (jumpHeight > height) {
            System.out.println("Я человек, я перепрыгнул!");
        } else {
            System.out.println("Я человек, я не перепрыгнул!");
        }
    }

    @Override
    public void run(int length) {
        if (runLength > length) {
            System.out.println("Я человек, я пробежал!");
        } else {
            System.out.println("Я человек, я не пробежал!");
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



