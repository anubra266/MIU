package homeworks.FPP.Assignment5.Problem4;

public class HourEmployee extends Employee {
    private static double wage;
    private static double hours;

    public HourEmployee(String firstName, String lastName, String socialSecurityNumber, double _wage, double _hours) {
        super(firstName, lastName, socialSecurityNumber);
        wage = _wage;
        hours = _hours;
    }

    public double getPayment() {
        return wage * hours;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    public void setWage(double _wage) {
        wage = _wage;
    }

    public void setHours(double _hours) {
        hours = _hours;
    }

    public String toString() {
        return getFirstName() + " " + getLastName() + "\n" + "hourly wage: " + getWage() + "\n" + "hours worked: "
                + getHours();
    }
}
