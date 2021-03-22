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
        return 0;
    }

    @Override
    public double shoot(int speed) {

        return 0;
    }


}
