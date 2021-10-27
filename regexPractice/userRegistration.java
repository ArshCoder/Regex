package regexPractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {
    public static boolean isValidUser(String userName) {
        String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        if (userName == null) {
            return false;
        }
        Matcher match = pattern.matcher(userName);
        return match.matches();
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[a-z.]{2,}[a-z]{2,}+@(bl.co.)[a-z]{2,3}$";

        Pattern pattern = Pattern.compile(regex);
        if (email == null) {
            return false;
        }
        Matcher match = pattern.matcher(email);
        return match.matches();
    }
    public static boolean isValidNum(String num) {
        String regex = "(0/91)?[7-9][0-9]{9}";

        Pattern pattern = Pattern.compile(regex);
        if (num == null) {
            return false;
        }
        Matcher match = pattern.matcher(num);
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

        System.out.println("Enter a Valid email : ");
        String email = scan.nextLine();
        System.out.println(email + " : " + isValidEmail(email));

        System.out.println("Enter a Valid Mobile Number : ");
        String num = scan.nextLine();
        System.out.println(num + " : " + isValidNum(num));


    }
}
