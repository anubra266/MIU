package homeworks.FPP.Assignment5.Problem4;

public class CommissionEmployee extends Employee {
    private static double grossSales;
    private static double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double _grossSales,
            double _commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        grossSales = _grossSales;
        commissionRate = _commissionRate;
    }

    public double getPayment() {
        return grossSales * commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSales(double _grossSales) {
        grossSales = _grossSales;
    }

    public void setCommissionRate(double _commissionRate) {
        commissionRate = _commissionRate;
    }

    public String toString() {
        return getFirstName() + " " + getLastName() + "\n" + "gross sales: " + getGrossSales() + "\n"
                + "commission rate: "
                + getCommissionRate();
    }
}
