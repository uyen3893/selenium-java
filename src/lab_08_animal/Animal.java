package lab_08_animal;

import java.security.SecureRandom;

public class Animal {

    private int speed;
    private String name;

    public int getSpeed() {
        return randomSpeed();
    }

    public String getName() {
        return name;
    }

    public int randomSpeed() {
        return new SecureRandom().nextInt(speed);
    }

}
