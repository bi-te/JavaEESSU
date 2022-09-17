package Practice2;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    private static final Registry workersRegistry = new Registry();
    private final List<Employee> workers;

    private Registry() {
        workers = new ArrayList<Employee>();
    }

    public static  Registry getRegistry(){
        return workersRegistry;
    }

    public void addEmployee(Employee employee) throws EmployeeInRegistryException{
        if(workers.contains(employee)) throw new EmployeeInRegistryException("Error: Employee already in registry");
        workers.add(employee);
    }

    public void printList(){
        System.out.println("Employees of the company: ");
        for(Employee employee: workers)
            employee.printEmployee();
    }
}
