package regexPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern {
    public static boolean isValidPinCode(String pinCode) {
        String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
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
    }
}
