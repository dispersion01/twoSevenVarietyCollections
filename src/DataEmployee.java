import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class DataEmployee {
    public static void main(String[] args) {
        Map<Integer, Employee> dataOfWEmployee = new HashMap();
        dataOfWEmployee.put(0, new Employee("Nikolaeva", 01, 100_000));
        dataOfWEmployee.put(1, new Employee("Ivanova", 05, 200_000));
        dataOfWEmployee.put(2, new Employee("Popov", 03, 150_000));
        dataOfWEmployee.put(3, new Employee("Petrova", 04, 123_000));
        dataOfWEmployee.put(4, new Employee("Vasilev", 03, 110_000));
        dataOfWEmployee.put(5, new Employee("Morozova", 05, 150_000));
        dataOfWEmployee.put(6, new Employee("Pavlov", 02, 200_000));
        dataOfWEmployee.put(7, new Employee("Sidorov", 04, 160_000));
        dataOfWEmployee.put(8, new Employee("Orlov", 02, 210_000));
        dataOfWEmployee.put(9, new Employee("Romanova", 01, 300_000));

        System.out.println("Метод 1. Вывод всех сотрудников:");
        allEmployee(dataOfWEmployee);

        System.out.println("Метод 2. Сумма затрат на зарплаты:");
        sumOfSalary(dataOfWEmployee);

        System.out.println("Метод 3. Сотрудник с минимальной зарплатой:");
        minSalary(dataOfWEmployee);

        System.out.println("Метод 4. Среднее значение зарплат:");
        midSalary(dataOfWEmployee);

        System.out.println("Метод 5. Сотрудник с максимальной зарплатой:");
        maxSalary(dataOfWEmployee);

        System.out.println("Метод 6. ФИО всех сотрудников");
        onlyNamesEmployee(dataOfWEmployee);
    }

    public static void allEmployee(Map<Integer, Employee> dataOfWEmployee) { //вывести всех сотрудников
        for (int i = 0; i < dataOfWEmployee.size(); i++) {
            System.out.println(dataOfWEmployee.get(i));
        }
    }

    public static int sumOfSalary(Map<Integer, Employee> dataOfWEmployee) { //сумма зарплат
        int totalSalary = 0;
        for (int i = 0; i < dataOfWEmployee.size(); i++) {
            totalSalary = totalSalary + dataOfWEmployee.get(i).getSalary();
        }


        return totalSalary;
    }


    public static void minSalary(Map<Integer, Employee> dataOfWEmployee) { //минимальная зарплата

        int min = dataOfWEmployee.get(0).getSalary();
        for (int i = 0; i < dataOfWEmployee.size(); i++) {
            if (dataOfWEmployee.get(i).getSalary() < min) {
                min = dataOfWEmployee.get(i).getSalary();
            }
        }
        System.out.println(min);
    }

    public static void maxSalary(Map<Integer, Employee> dataOfWEmployee) { //максимальная зарплата
        int min = dataOfWEmployee.get(0).getSalary();
        int max = dataOfWEmployee.size();
        for (int i = 0; i < dataOfWEmployee.size(); i++) {
            if (dataOfWEmployee.get(i).getSalary() > min) {
                max = dataOfWEmployee.get(i).getSalary();
            }
        }
        System.out.println(max);
    }

    public static void midSalary(Map<Integer, Employee> dataOfWEmployee) { //средняя зарплата
        int everyoneSalary = sumOfSalary(dataOfWEmployee);
        double midSalarySum = everyoneSalary / dataOfWEmployee.size();
        System.out.println(midSalarySum);
    }

    public static void onlyNamesEmployee(Map<Integer, Employee> dataOfWEmployee) { //ФИО сотрудников
        for (int i = 0; i < dataOfWEmployee.size(); i++) {
            System.out.println(dataOfWEmployee.get(i).getFullFamily());
        }
    }
}
