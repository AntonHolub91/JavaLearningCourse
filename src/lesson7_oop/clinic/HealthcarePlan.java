package lesson7_oop.clinic;

public class HealthcarePlan {
    int code;

    public HealthcarePlan(String healthProblem) {
        this.code = ((healthProblem.equals("stomach") || healthProblem.equals("heart"))) ? 1 :
                ((healthProblem.equals("teeth") || healthProblem.equals("gums"))) ? 2 : 3;
    }
}