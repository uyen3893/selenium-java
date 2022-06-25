package lab_10;

import java.util.ArrayList;
import java.util.Arrays;

public class TestAnimal {

    public static void main(String[] args) {
        AnimalController controller = new AnimalController();
        controller.caculateMaxSpeed(Arrays.asList(new Dog(), new Tiger(), new Horse()));
    }
}
