package homeworks.FPP.Assignment5.Problem2;

import java.time.LocalDate;

class Secretary extends DeptEmployee {
    private double overtimeHours;

    public Secretary(String name, LocalDate hireDate, double salary, double overtimeHours) {
        super(name, hireDate, salary);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary() {
        return this.salary + (12 * overtimeHours);
    }
}