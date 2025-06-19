
import java.util.Scanner;

public class Question_18{
    public static boolean  LeapYear(int year){
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0; 
            } else {
                return true; 
            }
        } else {
            return false; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number: ");
        int year = sc.nextInt();
        if (year < 0) {
            System.out.println("Please enter a valid year.");
        } else {
            if (LeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

    }
}