package lesson7_oop.clinic;

public class Dentist extends Doctor {
    public Dentist(String name){
        super(name);
        this.specialization = "dentist";
    }

    @Override
    public void treat(){
        System.out.println("Dental operation on " + currentPatient.healthProblem +
                " for patient " + currentPatient.name + " was carried out.");
    }
}