package lab_12;

public class Tiger extends Animal{

    public Tiger() {
        nameBehavior = new TigerName();
        speedBehavior = new TigerSpeed();
        flyBehavior = new TigerFlyable();
    }
}
