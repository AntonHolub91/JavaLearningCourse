package lesson11_str_regex.homework;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IPAddress {

    public void checkIPAddress() {
        System.out.print("Enter an IP address: ");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        Pattern p = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        System.out.println(p.matcher(address).matches());
    }
}

class TestIPAddress{
    public static void main(String[] args) {
        IPAddress hw = new IPAddress();
        hw.checkIPAddress();
    }
}