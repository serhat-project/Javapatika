public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0;
        if (salary > 1000) {
            tax = salary * 0.03;
        }
        return tax;
    }

    public double bonus() {
        double bonus = 0;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    public double raiseSalary() {
        double raise = 0;
        int currentYear = 2022;
        int yearsOfService = currentYear - hireYear;
        if (yearsOfService < 10) {
            raise = salary * 0.05;
        } else if (yearsOfService >= 10 && yearsOfService < 20) {
            raise = salary * 0.1;
        } else if (yearsOfService >= 20) {
            raise = salary * 0.15;
        }
        return raise;
    }

    public String toString() {
        return "Name : " + name + "\nSalary : " + salary + "\nWork Hours : " + workHours + "\nHire Year : " + hireYear +
                "\nTax : " + tax() + "\nBonus : " + bonus() + "\nRaise Salary : " + raiseSalary() + "\nTotal Salary : " +
                (salary - tax() + bonus() + raiseSalary());
    }
}  class MainApp{
    public static void main(String[] args) {
        Employee emp1 = new Employee("kemal", 2000.0, 45, 1985);
        System.out.println(emp1);
    }
}