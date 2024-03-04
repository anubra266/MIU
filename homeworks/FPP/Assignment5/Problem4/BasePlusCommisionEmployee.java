package homeworks.FPP.Assignment5.Problem4;

public class BasePlusCommisionEmployee extends CommissionEmployee {
    private static double baseSalary;

    public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double _baseSalary,
            double _grossSales, double _commissionRate) {
        super(firstName, lastName, socialSecurityNumber, _grossSales, _commissionRate);
        baseSalary = _baseSalary;
    }

    public double getPayment() {
        return baseSalary + super.getPayment();
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double _baseSalary) {
        baseSalary = _baseSalary;
    }

    public String toString() {
        return getFirstName() + " " + getLastName() + "\n" + "base salary: " + getBaseSalary();
    }
}
