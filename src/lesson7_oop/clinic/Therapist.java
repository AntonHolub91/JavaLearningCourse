package lesson7_oop.clinic;

public class Therapist extends Doctor {
    public Therapist(String name) {
        super(name);
        this.specialization = "therapist";
    }

    @Override
    public void treat() {
        System.out.println("The diagnostic of " + currentPatient.healthProblem +
                " for patient " + currentPatient.name + " was carried out.");
    }
}