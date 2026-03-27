import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        while (true) {
            System.out.print("Enter month (name, 3-letter abbr, or number 1-12): ");
            String monthInput = scanner.nextLine().trim();

            month = getMonthNumber(monthInput);

            if (month != -1) {
                break; 
            } else {
                System.out.println("Invalid month! Please try again.\n");
            }
        }

        System.out.print("Enter year (e.g. 2024): ");
        int year = scanner.nextInt();

        // Calculate and display result
        int days = getDaysInMonth(month, year);
        String monthName = getMonthName(month);
        System.out.printf("%s %d has %d days.\n", monthName, year, days);
        scanner.close();
    }

    public static int getMonthNumber(String input) {
        input = input.trim().toLowerCase();

        switch (input) {
            case "1": case "january": case "jan": case "jan.":
                return 1;
            case "2": case "february": case "feb": case "feb.":
                return 2;
            case "3": case "march": case "mar": case "mar.":
                return 3;
            case "4": case "april": case "apr": case "apr.":
                return 4;
            case "5": case "may":
                return 5;
            case "6": case "june": case "jun": case "jun.":
                return 6;
            case "7": case "july": case "jul": case "jul.":
                return 7;
            case "8": case "august": case "aug": case "aug.":
                return 8;
            case "9": case "september": case "sep": case "sept": case "sep.":
                return 9;
            case "10": case "october": case "oct": case "oct.":
                return 10;
            case "11": case "november": case "nov": case "nov.":
                return 11;
            case "12": case "december": case "dec": case "dec.":
                return 12;
            default:
                return -1;
        }
    }

    public static String getMonthName(int month) {
        String[] months = {"", "January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December"};
        return months[month];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }
}