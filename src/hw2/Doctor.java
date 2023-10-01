package hw2;

import hw1.Animal;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Human implements Healable {

    private Nurse nurse;
    private List<Animal> patients;

    public Doctor(String name, Activity activity) {
        super(name, activity);
        patients = new ArrayList<>();
    }

    public Doctor(String name, Activity activity, Nurse nurse) {
        super(name, activity);
        this.nurse = nurse;
    }

    public void addPatients(Animal animal) {
        patients.add(animal);
    }


    @Override
    public void heal(Animal animal) {
        System.out.println(" Доктор " + this.getName() + " лечит " + animal.getTYPE() + " " + animal.getName());
    }


    public List<Animal> getPatients() {
        return patients;
    }

    public Doctor assistantNurse(Animal animal) {
        System.out.println("Медсемтра " + nurse.getName() + " подготавливает пациента " + animal.getTYPE() + " "
                + animal.getName() + " для осмотра доктором " + this.getName());
        return this;
    }
}
