package Practice4.Composite;

public class CompositePatternDemo {
    public static void main(String[] args) throws IncorrectSalaryException, FieldLengthLimitException {
        Employee director = new Employee("Jack", "Director", 10_000);
        director.setManagerId(director.getId());

        Employee boss = new Employee("Johnathan", "Development", 5_000, director.getId());
        Employee boss2 = new Employee("William", "HR", 5_000, director.getId());
        director.add(boss);
        director.add(boss2);

        Employee employee1 = new Employee("Jessica", "Development", 1_000, boss.getId());
        Employee employee2 = new Employee("Taras", "Development", 1_000, boss.getId());
        Employee employee3 = new Employee("Yato", "Development", 1_000, boss.getId());
        Employee employee4 = new Employee("Alexandr", "HR", 1_000, boss.getId());
        Employee employee5 = new Employee("Volodymyr", "HR", 1_000, boss.getId());

        boss.add(employee1);
        boss.add(employee2);
        boss.add(employee3);
        boss2.add(employee4);
        boss2.add(employee5);

        director.printHierarchy();
    }
}
