package regexPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern {
    public static boolean isValidPinCode(String pinCode) {
        String regex = "^[a-z A-Z]{0}[1-9]{1}[0-9]{2}[0-9]{3}[a-z A-Z]{0}$";
        Pattern pattern = Pattern.compile(regex);
        if (pinCode == null) {
            return false;
        }

        Matcher match = pattern.matcher(pinCode);
        return match.matches();
    }

    public static void main(String[] args) {
        String pin = "400088";
        System.out.println(pin + ":" + isValidPinCode(pin));

        String pin2 = "A400088";
        System.out.println(pin2 + ":" + isValidPinCode(pin2));

        String pin3 = "400088B";
        System.out.println(pin3 + ":" + isValidPinCode(pin3));
    }
}
