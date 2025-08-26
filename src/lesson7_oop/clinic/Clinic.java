package lesson7_oop.clinic;

// 2 Создать программу для имитации работы клиники.
// Пусть в клинике будет три врача: хирург, терапевт и дантист.
// Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
// Так же предусмотреть класс «Пациент» и класс «План лечения».
// Создать объект класса «Пациент» и добавить пациенту план лечения.
// Так же создать метод, который будет назначать врача пациенту согласно плану лечения.
// Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
// Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
// Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить.

public class Clinic {
    int patientsCount = 1;
    int maxPatientsPerDay = 10;
    Doctor[] doctors = {
            new Therapist("John"),
            new Surgeon("Bob"),
            new Dentist("Tom")
    };

    public void createAppointment(Patient patient) {
        Doctor requiredDoctor = null;
        if (patient.healthcarePlan.code == 1) {
            for (Doctor doctor : doctors) {
                if (doctor.specialization.equals("surgeon")) {
                    requiredDoctor = doctor;
                }
            }
        } else if (patient.healthcarePlan.code == 2) {
            for (Doctor doctor : doctors) {
                if (doctor.specialization.equals("dentist")) {
                    requiredDoctor = doctor;
                }
            }
        } else {
            for (Doctor doctor : doctors) {
                if (doctor.specialization.equals("therapist")) {
                    requiredDoctor = doctor;
                }
            }
        }

        patient.currentDoctor = requiredDoctor; // linked patient with his doctor
        requiredDoctor.currentPatient = patient; // linked doctor with his patient

        System.out.println("Patient " + patient.name + " with "
                + patient.healthProblem + " problems got an appointment to doctor " + patient.currentDoctor.name +
                " with " + patient.currentDoctor.specialization + " specialization.");
    }
}

class TestClinic {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        System.out.println("Clinic's working day has started.");
        System.out.println("-".repeat(100));

        while (clinic.patientsCount <= clinic.maxPatientsPerDay) { // clinic can process only 10 patients per day
            System.out.println("Patient " + clinic.patientsCount + " came to the clinic."); //patient has come
            Patient patient = new Patient();
            patient.healthcarePlan = new HealthcarePlan(patient.healthProblem); // patient got his treatment plan according to his problem
            clinic.createAppointment(patient); // linked patient with doctor
            patient.currentDoctor.treat(); //treatment was executed
            clinic.patientsCount++;
            System.out.println("-".repeat(100));
        }
        System.out.println("Clinic's working day has ended.");
    }
}