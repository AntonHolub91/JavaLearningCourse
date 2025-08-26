package lesson7_oop.clinic;

public class Doctor {
    String name;
    String specialization;
    Patient currentPatient;

    public Doctor(String name) {
        this.name = name;
        this.specialization = "unknown";
    }

    public void treat() {
        System.out.println("General treatment was carried out.");
    }

}