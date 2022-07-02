package lab_12;

import java.security.SecureRandom;

public class HorseSpeed implements SpeedBehavior{

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(75);
    }
}
