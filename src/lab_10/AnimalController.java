package lab_10;

import lab_08_animal.Animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {

    public void caculateMaxSpeed (List<Animal> animals) {
        List<Integer> speeds = new ArrayList<>();
        for (Animal animal: animals) {
            speeds.add(animal.getSpeed());
        }

        List<String> names = new ArrayList<>();
        for(Animal animal: animals) {
            names.add(animal.getName());
        }

        int maximum = 0;
        for(int speed: speeds) {
            System.out.println(speed);
            if (speed > maximum) {
                maximum = speed;
            }
        }

        int index = 0;
        for(int speed: speeds) {
            if (maximum == speed) {
                index = speeds.indexOf(speed);
            }
        }

        System.out.println("The winner is " + names.get(index) + ", with speed: " + maximum);
    }
}
