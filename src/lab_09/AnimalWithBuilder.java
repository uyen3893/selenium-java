package lab_09;

import java.security.SecureRandom;

public class AnimalWithBuilder {

    private int speed;
    private String name;
    private boolean isFlyable;

    protected AnimalWithBuilder(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.isFlyable = builder.isFlyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return new SecureRandom().nextInt(speed);
    }

    public boolean getIsFlyable() {
        return isFlyable;
    }

    @Override
    public String toString() {
        return "AnimalWithBuilder{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                ", isFlyable=" + isFlyable +
                '}';
    }

    public static class Builder {
        private int speed;
        private String name;
        private boolean isFlyable;

        public void setSpeed(int speed) {
            this.speed = new SecureRandom().nextInt(speed);;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setFlyable(boolean flyable) {
            isFlyable = flyable;
        }

        public AnimalWithBuilder build() {
            return new AnimalWithBuilder(this);
        }
    }
}
