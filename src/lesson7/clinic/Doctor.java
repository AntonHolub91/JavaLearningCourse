package lesson7.clinic;

public class Doctor {
    String name;
    String specialization;
    Patient currentPatient;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void treat() {
        System.out.println("General treatment was carried out.");
    }

}
