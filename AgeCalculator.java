import java.time.LocalDate;
import java.time.LocalDateTime;
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
       LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E,MMM dd yyyy");
// pattern: dd/MM/yyyy, ss-MMM-yyyy( 29-Sep-1988), E,MMM dd yyyy  Thu, Sept 29 1988
    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);         
        // learn how to format the current time
        sc.close();
    }
}