import lesson7_oop.clinic.Patient;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMain {
    public static void main(String[] args) throws ArithmeticException{
        ArrayList<String> x = new ArrayList<>(List.of("a", "b", "c"));
        System.out.println(x);
        String[] y = {"a", "b", "c"};

        System.out.println(x.stream().filter(s -> s.startsWith("a")).count());
        System.out.println(Arrays.toString(Arrays.stream(y).filter(s -> s.startsWith("a")).toArray()));
    }
}