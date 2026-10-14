public class Employee extends Person {
    private int id;
    private double salary;

    public Employee() {
        super();
        this.id = 0;
        this.salary = 0.0;
    }

    public Employee(int id, String name, int age, double salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + id + ", Salary: $" + salary;
    }
}