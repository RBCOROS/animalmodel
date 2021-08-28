package sample.animal.base;

import sample.animal.kind.*;
import sample.vo.AnimalChars;


public class AnimalImplMain {

    private static AnimalChars animalChars = new AnimalChars();

    public static void main (String[] args) {
        //1. This method will show all bird characteristics including sing()
        birdCharacteristics();

        //2. This method will show Chicken and Duck characteristics as well as their special sound
        duckCharacteristics();
        chickenCharacteristics();

        //3. This method will rooster's characteristics and its relation to chicken
        roosterCharacteristics();
    }

    /**
     * This is for item #1
     * implement sing()
     * unit test
     */
    private static void birdCharacteristics () {
        System.out.println("***** Model a bird *****");
        animalChars.setKind("Bird");

        Bird bird = new Bird(animalChars.getKind());
        bird.printKind();
        bird.walk();
        bird.makeSound();
        bird.eat();
        bird.fly();
        bird.sing();
    }

    /**
     * this is for item #2
     * Model duck that make a sound 'Quack Quack'
     * and can swim
     */
    private static void duckCharacteristics () {
        System.out.println("***** Model a duck *****");
        animalChars.setKind("Duck");

        Duck duck = new Duck(animalChars.getKind());
        duck.printKind();
        duck.walk();
        duck.makeSound();
        duck.fly();
        duck.swim();
    }

    /**
     * this is for item #2
     * Model a chicken that make a sound 'Cluck , cluck'
     * but cannot swim!
     *
     */
    private static void chickenCharacteristics () {
        System.out.println("***** Model a chicken *****");
        animalChars.setKind("Chicken");

        Chicken chicken = new Chicken(animalChars.getKind());
        chicken.printKind();
        chicken.walk();
        chicken.makeSound();
    }

    /**
     * this is for item #3
     * Model a rooster that make a sound 'Cock a doodle doo'
     * How is the rooster related to the chicken
     * Other ways without using inheritance
     */
    private static void roosterCharacteristics () {
        System.out.println("***** Model a rooster *****");
        animalChars.setKind("Rooster");
        String roosterStr = animalChars.getKind();
        Rooster rooster = new Rooster(roosterStr);
        rooster.printKind();
        rooster.walk();
        rooster.makeSound();

        // chicken and rooster are both birds, they eat worms!
        checkRelation();


    }

    private static void eat(BaseBird bird) {
        bird.eat();
    }

    private static void checkRelation() {
        Chicken chicken = new Chicken("Chicken");
        Rooster rooster = new Rooster("Rooster");

        eat(chicken);
        eat(rooster);
    }

}
