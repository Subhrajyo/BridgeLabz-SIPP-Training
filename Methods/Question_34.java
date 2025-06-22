import java.util.Scanner;

public class Question_34 {

    static String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getNumberOfDays(int month, int year) {
        if (month == 1 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month + 1;
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y / 100;
        int h = (1 + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        // 0 = Saturday, 1 = Sunday, ..., 6 = Friday
        // Adjust so that 0 = Sunday, ..., 6 = Saturday
        int dayOfWeek = (h + 6) % 7;
        return dayOfWeek;
    }

    public static void displayCalendar(int month, int year) {
        int days = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("     " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt() - 1;
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        displayCalendar(month, year);

        
    }
}