package lab_10;

import java.security.SecureRandom;

public class Tiger extends Animal{

    private int speed = 100;
    private String name = "Tiger";

    @Override
    public int getSpeed () {
        return new SecureRandom().nextInt(speed);
    }

    @Override
    public String getName() {
        return name;
    }
}
