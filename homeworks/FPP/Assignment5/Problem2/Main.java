package homeworks.FPP.Assignment5.Problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Obinna", LocalDate.of(2010, 1, 1), 200000, 20);
        Professor prof2 = new Professor("Burmaa", LocalDate.of(2015, 3, 15), 200000, 15);
        Professor prof3 = new Professor("Renuka", LocalDate.of(2018, 7, 10), 200000, 10);

        Secretary sec1 = new Secretary("Natalie", LocalDate.of(2012, 5, 20), 120000, 5);
        Secretary sec2 = new Secretary("Daniel", LocalDate.of(2019, 8, 3), 115000, 8);

        DeptEmployee[] department = { prof1, prof2, prof3, sec1, sec2 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to see the sum of all salaries? (Y/N): ");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("Y")) {
            double totalSalary = 0.0;

            for (DeptEmployee employee : department) {
                totalSalary += employee.computeSalary();
            }

            System.out.println("The total salary of all employees in the department is: $" + totalSalary);
        }
    }
}