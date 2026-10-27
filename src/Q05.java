package Q05;

// a)
abstract class Employee {
    protected String empId;
    protected String name;

    public Employee(String empId, String name) {
        this.empId = empId;
        this.name = name;
    }


    public abstract double calculateSalary();
}

// b)
interface Payable {
    void generatePayslip();
}

// c)
class PermanentEmployee extends Employee implements Payable {
    private double monthlySalary;

    public PermanentEmployee(String empId, String name,
                             double monthlySalary) {
        super(empId, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void generatePayslip() {
        System.out.println("---- Permanent Employee Payslip ----");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.printf("Monthly Salary: Rs. %.2f%n", monthlySalary);
        System.out.printf("Total Salary: Rs. %.2f%n", calculateSalary());
    }
}

// c)
class ContractEmployee extends Employee implements Payable {
    private double hourlyRate;
    private double hoursWorked;

    public ContractEmployee(String empId, String name,
                            double hourlyRate, double hoursWorked) {
        super(empId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void generatePayslip() {
        System.out.println("---- Contract Employee Payslip ----");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.printf("Hourly Rate: Rs. %.2f%n", hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Total Salary: Rs. %.2f%n", calculateSalary());
    }
}

public class Q05 {
    public static void main(String[] args) {
        // d)
        PermanentEmployee employee1 =
                new PermanentEmployee("E001", "Nimal", 85000);

        ContractEmployee employee2 =
                new ContractEmployee("E002", "Kamal", 1000, 120);


        System.out.printf("Permanent Employee Salary: Rs. %.2f%n",
                employee1.calculateSalary());

        System.out.printf("Contract Employee Salary: Rs. %.2f%n",
                employee2.calculateSalary());


        System.out.println();
        employee1.generatePayslip();

        System.out.println();
        employee2.generatePayslip();
    }
}