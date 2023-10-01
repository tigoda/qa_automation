package hw2;

import hw1.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic(new ArrayList<>());
        clinic.addAnimal(new Cat("AAA", 12.0, new Owner("Alex"), LocalDate.now(),
                List.of(new Vaccination("chumka", LocalDate.now())), Color.BLACK, ""));
        clinic.addAnimal(new Dog("SSS", 12.0, new Owner("Alex"), LocalDate.now(),
                List.of(new Vaccination("chumka", LocalDate.now())), Color.BLACK));
        clinic.addAnimal(new Duck("DDD", 1.9, new Owner("Egor"), LocalDate.now()
                , Color.BLACK, 22.2));
        for (Animal animal : clinic.getPatients()) {
            if (animal instanceof Flyable) {
                System.out.println(((Flyable) animal).getFlySpeed());
            }
        }
        Cat cat = new Cat("Котик", 12.0, new Owner("Alex"), LocalDate.now(),
                List.of(new Vaccination("chumka", LocalDate.now())), Color.BLACK, "");
        Doctor doctor = new Doctor("Никита", Activity.DOCTOR);
        doctor.addPatients(cat);
        doctor.heal(cat);
        Nurse nurse = new Nurse("Елена", Activity.NURSE);
        Doctor doctor2 = new Doctor("Петр", Activity.DOCTOR, nurse);
        doctor.addPatients(cat);
        doctor2.assistantNurse(cat).heal(cat);
        nurse.heal(cat);


        for (Animal animal : doctor.getPatients()) {
            System.out.println(animal.getName());
        }


    }
}
