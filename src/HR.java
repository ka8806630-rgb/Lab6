public final class HR {
    private Employee[] records;
    private int count;

    public HR(int capacity) {
        records = new Employee[capacity];
        count = 0;
        records[count++] = new Student();
        records[count++] = new Student(100, "Default Intern", 21);
    }

    public boolean addPerson(Employee person) {
        if (count >= records.length) {
            return false;
        }
        records[count++] = person;
        return true;
    }

    public void updateSalary(int id, double newSalary) {
        for (int i = 0; i < count; i++) {
            if (records[i].getId() == id) {
                if (records[i] instanceof Student) {
                    System.out.println("Cannot update salary for Student (ID: " + id + ").");
                    return;
                } else {
                    records[i].setSalary(newSalary);
                    System.out.println("Salary updated successfully for ID " + id);
                    return;
                }
            }
        }
    }

    public void displayAll() {
        System.out.println("\n----------------- HR Records -----------------");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + records[i].toString());
        }
        System.out.println("----------------------------------------------");
    }
}