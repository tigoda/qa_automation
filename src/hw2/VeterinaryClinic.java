package hw2;

import hw1.Animal;

import java.util.List;

public final class VeterinaryClinic {

    private List<Animal> patients;

    public VeterinaryClinic(List<Animal> patients) {

        this.patients = patients;
    }

    public void addAnimal(Animal animal) {

        patients.add(animal);
    }

    public List<Animal> getPatients() {

        return patients;
    }
}
