package OOP_projects;

public class LabWork__2_2_3 {
    public static void main(String[] args) {

        Employee employee = Accountant.toCreateEmployee();

        employee.toCalculateSalary("Alexander", 400d);
        employee.toCalculateSalary("Isabella", 300.5d);
        employee.toCalculateSalary("Roman", 350.5d);
    }
}

class Employee {

    public void toCalculateSalary(String name, double... salary) {

        double totalSalary = 0;

        for (double cash : salary) {
            totalSalary += cash;
        }

        System.out.println(name + " — " + totalSalary + " $");
    }
}

class Accountant {

    public static Employee toCreateEmployee() {

        return new Employee();
    }

}
