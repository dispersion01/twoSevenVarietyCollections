import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String familyName;
    private int department;
    private int salary;
    private int id;
    private static int counter;



    public Employee(int id, String familyName, int department, int salary) {
        this.id = counter++;
        this.familyName = familyName;
        this.department = department;
        this.salary = salary;

    }



    public String getFamilyName() {
        return familyName;
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
        return id + " " + familyName + " " + department + " " + salary;
    }
}
