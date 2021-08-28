package sample.animal.base;

import sample.animal.constants.FishValidationConstant;
import sample.animal.constants.RoosterLangConstants;
import sample.animal.kind.*;
import sample.vo.AnimalChars;

import java.util.ArrayList;


public class AnimalImplMain {

    private static AnimalChars animalChars = new AnimalChars();

    public static void main (String[] args) {
        //1. This method will show all bird characteristics including sing()
        birdCharacteristics();
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

}
