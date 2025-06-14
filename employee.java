// Superclass
class Employee {
    // Method to represent general work
    public void work() {
        System.out.println("Employee is working.");
    }

    // Method to get salary
    public double getSalary() {
        return 30000.0; // Base salary
    }
}

// Subclass
class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is managing employee relations and recruitment.");
    }
}

public class employee {
    public static void main(String[] args) 
        Employee emp = new Employee();
        emp.work();
        System.out.println("Employee Salary: $" + emp.getSalary());

        // Create HRManager object
        HRManager hr = new HRManager();
        hr.work(); 
        System.out.println("HR Manager Salary: $" + hr.getSalary());
    }
