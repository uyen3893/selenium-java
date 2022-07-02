package lab_12;

public class Horse extends Animal{

    public Horse() {
        nameBehavior = new HorseName();
        speedBehavior = new HorseSpeed();
        flyBehavior = new HorseFlyable();
    }
}
