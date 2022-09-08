
public class Employee {
    private int id;
    private static int nextid = 0;
    private String name;

    public Employee(String name) {
        this.id = nextid++;
        this.name = name;
    }

    void printEmployee(){
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
