public class Student extends Employee {

    public Student() {
        super();
        super.setSalary(0.0);
    }

    public Student(int id, String name, int age) {
        super(id, name, age, 0.0);
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(0.0);
    }

    @Override
    public String toString() {
        return "[Internship Student] Name: " + getName() +
                ", Age: " + getAge() +
                ", ID: " + getId() +
                ", Payment: $0.0";
    }
}
