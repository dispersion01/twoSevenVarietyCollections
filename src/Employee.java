import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String fullFamily;
    private int department;
    private int salary;
    Map<Integer, Employee> dataOfWEmployee;
    private int id;


    public Employee( String fullFamily, int department, int salary) {
        this.fullFamily = fullFamily;
        this.department = department;
        this.salary = salary;
        dataOfWEmployee = new HashMap<>();;
        this.id = id++;
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

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return fullFamily + " " + department + " " + salary;
    }
}
