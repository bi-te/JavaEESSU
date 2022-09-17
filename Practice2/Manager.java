package Practice2;

public class Manager extends Employee{

    private double bonus;
    public Manager(String name, String department, double salary, double bonus) throws FieldLengthLimitException, IncorrectSalaryException {
        super(name, department, salary);
        this.bonus = bonus;
    }

    @Override
    public void printEmployee() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Department: " + departmentName + ", Bonus: " + bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
