public class Employee {
    private String fullFamily;
    private int department;
    private int salary;
    private int id;
    private static int counter;



    public Employee(int id, String fullFamily, int department, int salary) {
        this.id = counter++;
        this.fullFamily = fullFamily;
        this.department = department;
        this.salary = salary;

    }



    public String getFullFamily() {
        return fullFamily;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return id + " " + fullFamily + " " + department + " " + salary;
    }
}
