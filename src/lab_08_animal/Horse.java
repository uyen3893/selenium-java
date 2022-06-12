package lab_08_animal;

import java.security.SecureRandom;

public class Horse extends Animal{

    private int speed = 75;
    private String name = "Horse";

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(speed);
    }

    @Override
    public String getName() {
        return name;
    }

}
