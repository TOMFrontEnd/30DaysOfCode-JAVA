import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Get today's date
        LocalDate today = LocalDate.now();
        
        // Get the birthday from the user
        System.out.println("Enter your birthday (yyyy-MM-dd):");
        String birthdayString = sc.nextLine();
        
        // Parse the user input into a LocalDate object
        LocalDate birthday = LocalDate.parse(birthdayString, DateTimeFormatter.ISO_DATE);
        
        // Calculate the period from today to the birthday
        Period period = Period.between(today, birthday);
        
        // Print the period
        System.out.println("The period from today to your birthday is: " +
                period.getYears() + " years, " +
                period.getMonths() + " months, and " +
                period.getDays() + " days.");
        
        sc.close();
    }
}