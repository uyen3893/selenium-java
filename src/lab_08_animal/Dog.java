package lab_08_animal;

import java.security.SecureRandom;

public class Dog extends Animals {

    private int speed = 60;
    private String name = "Dog";

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(speed);
    }

    @Override
    public String getName() {
        return name;
    }


}
