package Practice1;


public class Main {
    public static void main(String[] args) {
        try{
            Employee employee = new Employee("Jack", "Lancaster", 10023 );
            employee.printEmployee();
        } catch (FieldLengthLimitException | IncorrectSalaryException e){
            System.out.println(e.getMessage());
        }
        try{
            Employee employee = new Employee("Jack", "VeryVeryLongSurname", 10023);
            employee.printEmployee();
        } catch (FieldLengthLimitException | IncorrectSalaryException e){
            System.out.println(e.getMessage());
        }
        try{
            Employee employee = new Employee("LongNameYouWon'tWantToHave", "Lancaster", 10023);
            employee.printEmployee();
        } catch (FieldLengthLimitException | IncorrectSalaryException e){
            System.out.println(e.getMessage());
        }
        try{
            Employee employee = new Employee("Alex", "Ano");
            employee.printEmployee();
            employee.setSalary(-10.5);
        } catch (FieldLengthLimitException | IncorrectSalaryException e){
            System.out.println(e.getMessage());
        }
    }
}
