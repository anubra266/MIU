package homeworks.FPP.Assignment5.Problem4;

public class Driver {
    public static void main(String[] args) {
        Employee[] drivers = new Employee[5];
        drivers[0] = new CommissionEmployee("Paul", "Agein", "123-45-6789", 5000, .04);
        drivers[1] = new SalariedEmployee("Jane", "Sampson", "987-65-4321", 1200);
        drivers[2] = new BasePlusCommisionEmployee("Tom", "Bruck", "123-45-6789", 5000, 0.04, 300);
        drivers[3] = new SalariedEmployee("Bob", "Silgee", "987-65-4321", 1200);
        drivers[4] = new CommissionEmployee("Wayne", "John", "123-45-6789", 5000, .04);

        for (Employee employee : drivers) {
            System.out.println(employee);
            System.out.println("Payment: " + employee.getPayment());
            System.out.println();
        }

        double totalSalaries = 0;
        for (Employee employee : drivers) {
            totalSalaries += employee.getPayment();
        }
        System.out.println("Total Salaries: $" + totalSalaries);
    }
}
