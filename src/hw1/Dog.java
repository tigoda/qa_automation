package hw1;

import hw2.Runnable;
import hw2.Swimable;

import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal implements Swimable, Runnable {
    public Dog(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

    @Override
    public void fly() {
        System.out.println(this.TYPE + " не умеет летать");
    }


    @Override
    public void Swim() {
        System.out.println(this.getTYPE() + " плавает");

    }

    @Override
    public double getSwimSpeed() {
        return 13;
    }

    @Override
    public void Run() {
        System.out.println(this.getTYPE() + " бегает");
    }

    @Override
    public double getRunSpeed() {
        return 17;
    }
}
