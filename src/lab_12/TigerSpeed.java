package lab_12;

import java.security.SecureRandom;

public class TigerSpeed implements SpeedBehavior{

    @Override
    public int getSpeed() {
        return new SecureRandom().nextInt(100);
    }
}
