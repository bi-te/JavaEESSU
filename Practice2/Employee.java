package Practice2;

import java.util.Objects;

public class Employee {
    private static int nextId = 0;
    protected final int id;
    protected int managerId;
    protected String name;
    protected String departmentName;
    protected double salary;
    private static final int  MAX_STRING_LENGTH = 30;

    public Employee(String name, String departmentName, double salary) throws FieldLengthLimitException, IncorrectSalaryException{
        if(name.length() > MAX_STRING_LENGTH) {throw new FieldLengthLimitException("Too many symbols in name");}
        if(salary < 0) {throw new IncorrectSalaryException("Salary must be greater than zero");}

        this.id = nextId++;
        this.name = name;
        this.departmentName = departmentName;
        this.salary = salary;
    }

    public void printEmployee(){
        System.out.println("Name: " + name + ", Salary: " + salary + ", Department: " + departmentName);
    }

    public void setManagerId(int managerId){
        this.managerId = managerId;
    }

    public void setName(String name) throws FieldLengthLimitException{
        if(name.length() > MAX_STRING_LENGTH) {throw new FieldLengthLimitException("Too many symbols in name");}
        this.name = name;
    }

    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    public void setSalary(double salary) throws IncorrectSalaryException {
        if(salary < 0) {throw new IncorrectSalaryException("Salary must be greater than zero");}
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getManagerId() {
        return managerId;
    }

    public String getName() {
        return name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
