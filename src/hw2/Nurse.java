package hw2;

import hw1.Animal;

public class Nurse extends Human implements Healable {

    public Nurse(String name, Activity activity) {
        super(name, activity);
    }


    @Override
    public void heal(Animal animal) {
        System.out.println("Медсестра " + this.getName() + " делает укол " + animal.getTYPE() + " " + animal.getName());
    }

}
