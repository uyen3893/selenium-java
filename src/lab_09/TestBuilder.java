package lab_09;

import lab_08_animal.Animals;

import java.util.ArrayList;
import java.util.List;

public class TestBuilder {

    public static void main(String[] args) {
        AnimalWithBuilder.Builder builder1 = new AnimalWithBuilder.Builder();
        builder1.setName("Dog");
        builder1.setSpeed(60);
        builder1.setFlyable(false);
        AnimalWithBuilder dog = builder1.build();

        AnimalWithBuilder.Builder builder2 = new AnimalWithBuilder.Builder();
        builder2.setName("Tiger");
        builder2.setSpeed(100);
        builder2.setFlyable(false);
        AnimalWithBuilder tiger = builder2.build();

        AnimalWithBuilder.Builder builder3 = new AnimalWithBuilder.Builder();
        builder3.setName("Horse");
        builder3.setSpeed(75);
        builder3.setFlyable(false);
        AnimalWithBuilder horse = builder3.build();

        AnimalWithBuilder.Builder builder4 = new AnimalWithBuilder.Builder();
        builder4.setName("Snake");
        builder4.setSpeed(50);
        builder4.setFlyable(true);
        AnimalWithBuilder snake = builder4.build();

        List <AnimalWithBuilder>  AnimalWithBuilderList = new ArrayList<>();
        AnimalWithBuilderList.add(dog);
        AnimalWithBuilderList.add(tiger);
        AnimalWithBuilderList.add(horse);
        AnimalWithBuilderList.add(snake);

        List <AnimalWithBuilder> AnimalWithoutWingList = new ArrayList<>();
        for (AnimalWithBuilder animal: AnimalWithBuilderList) {
            if (animal.getIsFlyable() == false) {
                AnimalWithoutWingList.add(animal);
            }
        }

        for (AnimalWithBuilder animal: AnimalWithoutWingList) {
            System.out.println(animal.toString());
        }

        TestBuilder testBuilder = new TestBuilder();
        testBuilder.caculateWinner(AnimalWithoutWingList);

    }
    public void caculateWinner(List<AnimalWithBuilder> animals) {
        List<Integer> speeds = new ArrayList<>();
        for (AnimalWithBuilder animal: animals) {
            speeds.add(animal.getSpeed());
        }

        List<String> names = new ArrayList<>();
        for(AnimalWithBuilder animal: animals) {
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
