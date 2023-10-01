package hw1;

import hw2.Flyable;
import hw2.Swimable;

import java.time.LocalDate;


public class Duck extends Animal implements Flyable, Swimable {
    private double speed;
    public Duck(String name, double weight, Owner owner, LocalDate birthDay, Color color, double speed) {
        super(name, weight, owner, birthDay, color);
        this.speed = speed;
    }


    @Override
    public void Fly() {
        System.out.println(this.getTYPE() + " летает");

    }

    @Override
    public double getFlySpeed() {

        return 11.1;
    }


    @Override
    public void Swim() {
        System.out.println(this.getTYPE() + " плавает");

    }

    @Override
    public double getSwimSpeed() {
        return 3;
    }
}
