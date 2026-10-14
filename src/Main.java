import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HR hrSystem = new HR(10);

        System.out.print("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Salary (Leave blank or enter 0 if Intern/Student): ");
        String salaryInput = scanner.nextLine().trim();

        Employee person;
        if (salaryInput.isEmpty() || Double.parseDouble(salaryInput) == 0) {
            person = new Student(id, name, age);
        } else {
            double salary = Double.parseDouble(salaryInput);
            person = new Employee(id, name, age, salary);
        }

        hrSystem.addPerson(person);
        hrSystem.displayAll();

        hrSystem.updateSalary(100, 2000.0);
        hrSystem.updateSalary(id, 4500.0);

        hrSystem.displayAll();

        scanner.close();
    }
}