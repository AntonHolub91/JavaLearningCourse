import lesson7_oop.clinic.Patient;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMain {
    public static void main(String[] args) throws ArithmeticException{
        String x = "hello";
        Pattern p = Pattern.compile("[abcde]");
        Matcher m = p.matcher(x);
        if (m.matches()) {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }
}