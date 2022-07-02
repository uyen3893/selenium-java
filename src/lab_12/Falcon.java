package lab_12;

public class Falcon extends Animal{

    public Falcon() {
        speedBehavior = new FalconSpeed();
        nameBehavior = new FalconName();
        flyBehavior = new FalconFlyable();
    }
}
