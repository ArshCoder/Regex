package regexPractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {
    public static boolean isValidUser(String userName){
        String regex = "^[A-Z]{1}[a-z A-Z]{2,}+$";
        Pattern pattern = Pattern.compile(regex);
        if (userName == null) {
            return false;
        }
        Matcher match = pattern.matcher(userName);
        return match.matches();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Name Start with capital letter and at least 3 character: ");
        String userName = scan.nextLine();
        System.out.println(userName + ":" + isValidUser(userName));

        System.out.println("Enter a LastName Start with capital letter and at least 3 character: ");
        String lastName = scan.nextLine();
        System.out.println(lastName + ":" + isValidUser(lastName));
    }
}
