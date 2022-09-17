package Practice2;

public class Main {
    public static void main(String[] args) {
        Registry workers = Registry.getRegistry();

        try{
            Employee emp = new Employee("John", "HR Department", 100);
            Employee emp2 = new Employee("Jack", "HR Department", 120);
            Manager manager = new Manager("Greg", "HR Department", 500, 100);
            Employee emp3 = new Employee("William", "HR Department", 90);
            Manager manager2 = new Manager("Jeremy", "HR Department", 550, 110);

            emp.setManagerId(manager.getId());
            emp2.setManagerId(manager.getId());
            emp3.setManagerId(manager2.getId());

            workers.addEmployee(emp);
            workers.addEmployee(emp2);
            workers.addEmployee(emp3);
            workers.addEmployee(manager);
            workers.addEmployee(manager2);

            workers.addEmployee(emp2); //Error
        }catch (IncorrectSalaryException | FieldLengthLimitException | EmployeeInRegistryException e) {
            System.out.println(e.getMessage());
        }
        workers.printList();
    }
}
