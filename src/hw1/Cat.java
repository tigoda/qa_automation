package hw1;

import hw2.Runnable;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Runnable {
    private String breed;

    public Cat(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color,
               String breed) {
        super(name, weight, owner, birthDay, vaccinations, color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void fly() {

        System.out.println(this.TYPE + " не умеет летать");
    }


    @Override
    public void Run() {
        System.out.println(this.getTYPE() + " бегает");

    }

    @Override
    public double getRunSpeed() {
        return 10;
    }
}
