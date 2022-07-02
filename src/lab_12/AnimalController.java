package lab_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalController {

    public List<Animal> createWithoutWingsAnimalList (List<Animal> animals) {
        List<Animal> animalList = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.performFly() == false) {
                animalList.add(animal);
            }
        }
        return animalList;
    }

    public void caculateMaxSpeed (List<Animal> animals) {
        List<Integer> speeds = new ArrayList<>();
        for (Animal animal: animals) {
            speeds.add(animal.performSpeed());
        }

        List<String> names = new ArrayList<>();
        for(Animal animal: animals) {
            names.add(animal.performName());
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

    public static void main(String[] args) {
        AnimalController animalController = new AnimalController();

        List<Animal> animals = Arrays.asList(new Horse(), new Falcon(), new Tiger());

        List<Animal> withoutWingsAnimalList = animalController.createWithoutWingsAnimalList(animals);
        animalController.caculateMaxSpeed(withoutWingsAnimalList);
    }
}
