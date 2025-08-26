package lesson7_oop.clinic;

import java.util.Random;

public class Patient {
    static String[] healthProblems = {"stomach", "heart","teeth", "gums", "cough", "runny nose"};
    static String[] names = {"Peter", "John", "Ann", "Mary", "Tom", "Bob", "Garry", "James", "Michel"};
    String name;
    String healthProblem;
    HealthcarePlan healthcarePlan;
    Doctor currentDoctor;

    public Patient() {
        this.name = names[new Random().nextInt(0, healthProblems.length)];
        this.healthProblem = healthProblems[new Random().nextInt(0, healthProblems.length)];
        System.out.println("Patient name is " + this.name + ". Patient has problems with " + this.healthProblem + ".");

    }
}
