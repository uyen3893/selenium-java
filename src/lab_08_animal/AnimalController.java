package lab_08_animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnimalController {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        AnimalController animalController = new AnimalController();
        animalController.caculateWinner(Arrays.asList(dog, horse, tiger));
    }

    public void caculateWinner(List<Animal> animals) {
        List<Integer> speeds = new ArrayList<>();
        for (Animal animal: animals) {
            speeds.add(animal.getSpeed());
        }

        List<String> names = new ArrayList<>();
        for(Animal animal: animals) {
            names.add(animal.getName());
        }

        //caculate the maximum speed
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
