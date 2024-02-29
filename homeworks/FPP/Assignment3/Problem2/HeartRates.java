package homeworks.FPP.Assignment3.Problem2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HeartRates {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

    public HeartRates(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int calculateAge() {

        LocalDate birthday = LocalDate.parse(dateOfBirth, formatter);

        LocalDate today = LocalDate.now();
        Period period = Period.between(birthday, today);
        return period.getYears();
    }

    public int calculateMaximumHeartRate() {
        return 220 - calculateAge();
    }

    public String calculateTargetHeartRateRange() {
        int restingHeartRate = 70;
        int maximumHeartRate = calculateMaximumHeartRate();
        int averageHeartRate = maximumHeartRate - restingHeartRate;
        double lowerBoundary = 0.5;
        double upperBoundary = 0.85;
        double lowerBoundaryTargetHeartRate = (averageHeartRate * lowerBoundary) +
                restingHeartRate;
        double upperBoundaryTargetHeartRate = (averageHeartRate * upperBoundary) +
                restingHeartRate;

        return "The Target Heart Rate Range is between " + lowerBoundaryTargetHeartRate + " and " +
                upperBoundaryTargetHeartRate;

    }

    public String toString() {
        String res = calculateTargetHeartRateRange();
        res += "\nFirst Name: " + getFirstName() + "\nLast Name: " + getLastName();
        res += "\nAge: " + calculateAge();
        res += "\nDate of Birth: " + getDateOfBirth();
        res += "\nMaximum Heart Rate: " + calculateMaximumHeartRate();

        return res;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Please enter your birth date in the format - (yyyy-mm-dd) format Example 1989-4-14: ");
        String birthDate = scanner.nextLine();

        HeartRates heartRates = new HeartRates(firstName, lastName, birthDate);

        System.out.println(heartRates.toString());
        scanner.close();

    }

}
