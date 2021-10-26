package regexPractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {
    public static boolean isValidUser(String userName){
        String regex = "^[A-Z]{1}[a-z A-Z]{3,}+$";
        Pattern pattern = Pattern.compile(regex);
        if (userName == null) {
            return false;
        }
        Matcher match = pattern.matcher(userName);
        return match.matches();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter UserName: ");
        String userName = scan.nextLine();
        System.out.println(userName + ":" + isValidUser(userName));
    }
}
