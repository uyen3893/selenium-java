package lab_12;

public class Animal {

    protected NameBehavior nameBehavior;
    protected SpeedBehavior speedBehavior;
    protected FlyBehavior flyBehavior;

    protected String performName() {
        return nameBehavior.getName();
    }

    protected int performSpeed() {
        return speedBehavior.getSpeed();
    }

    protected boolean performFly() {
        return flyBehavior.isFlyable();
    }
}
