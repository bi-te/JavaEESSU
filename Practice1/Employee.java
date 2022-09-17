package Practice1;

public class Employee {
    private int id;
    private static int nextid = 0;
    private String name;
    private String surname;
    private double salary;

    private static final int  MAX_STRING_LENGTH = 15;

    public Employee(String name, String surname) throws FieldLengthLimitException{
        if(name.length() > MAX_STRING_LENGTH) {throw new FieldLengthLimitException("Too many symbols in name");}
        if(surname.length() > MAX_STRING_LENGTH) {throw new FieldLengthLimitException("Too many symbols in surname");}

        this.id = nextid++;
        this.name = name;
        this.surname = surname;
    }
    public Employee(String name, String surname, double salary) throws FieldLengthLimitException, IncorrectSalaryException{
        if(name.length() > MAX_STRING_LENGTH) {throw new FieldLengthLimitException("Too many symbols in name");}
        if(surname.length() > MAX_STRING_LENGTH) {throw new FieldLengthLimitException("Too many symbols in surname");}
        if(salary < 0) {throw new IncorrectSalaryException("Salary must be greater than zero");}

        this.id = nextid++;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void printEmployee(){
        System.out.println("ID: " + id + ", Name: " + name + ", Surname: "  + surname + ", Salary: " + salary);
    }

    public void setName(String name) throws FieldLengthLimitException{
        if(name.length() > MAX_STRING_LENGTH) {throw new FieldLengthLimitException("Too many symbols in name");}
        this.name = name;
    }

    public void setSurname(String surname)throws FieldLengthLimitException {
        if(surname.length() > MAX_STRING_LENGTH) {throw new FieldLengthLimitException("Too many symbols in surname");}
        this.surname = surname;
    }

    public void setSalary(double salary) throws IncorrectSalaryException {
        if(salary < 0) {throw new IncorrectSalaryException("Salary must be greater than zero");}
        this.salary = salary;
    }
}
