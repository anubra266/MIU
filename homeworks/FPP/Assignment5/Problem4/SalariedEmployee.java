package homeworks.FPP.Assignment5.Problem4;

public class SalariedEmployee extends Employee {
    private static double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double _weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        weeklySalary = _weeklySalary;
    }

    public double getPayment() {
        return weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double _weeklySalary) {
        weeklySalary = _weeklySalary;
    }

    public String toString() {
        return getFirstName() + " " + getLastName() + "\n" + "weekly salary: " + getWeeklySalary();
    }

}
