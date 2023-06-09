package test;



import java.util.Scanner;

public class Employee {
    private static int count = 0;
    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int empCount = 0;

        while (empCount < 5) {
            empCount++;
            System.out.println("Enter details for Employee " + empCount + ":");
            System.out.print("Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Employee Name: ");
            String empName = scanner.nextLine();

            Employee employee = new Employee(empId, empName);
            System.out.println();
        }

        System.out.println("Total number of employees: " + Employee.getCount());

        scanner.close();
    }
}
