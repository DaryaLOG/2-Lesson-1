package CanJump;

public class Cat implements CanJump, CanRun, CanShoot, CanShakes {
    public int jumpHeight;
    public int runLength;
    public int shootSpeed;
    public int shakesLength;

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

    @Override
    public double shakes(int length) {
        return shakesLength;
    }

    @Override
    public double shoot(int speed) {

        return shootSpeed;
    }


}


