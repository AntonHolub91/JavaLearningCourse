package lesson7_oop.clinic;

public class Surgeon extends Doctor {
    public Surgeon(String name) {
        super(name, "surgeon");
    }

    @Override
    public void treat() {
        System.out.println("The operation on " + currentPatient.healthProblem +
                " for patient " + currentPatient.name + " was carried out.");
    }
}
