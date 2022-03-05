import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class DataEmployee {
    public static void main(String[] args) {
/*        Employee[] dataOfWEmployee = new Employee[10];
        dataOfWEmployee[0] = new Employee(1, "Nikolaeva", 01, 100_000);
        dataOfWEmployee[1] = new Employee(1, "Ivanova", 05, 200_000);
        dataOfWEmployee[2] = new Employee(1, "Popov", 03, 150_000);
        dataOfWEmployee[3] = new Employee(1, "Petrova", 04, 123_000);
        dataOfWEmployee[4] = new Employee(1, "Vasilev", 03, 110_000);
        dataOfWEmployee[5] = new Employee(1, "Morozova", 05, 150_000);
        dataOfWEmployee[6] = new Employee(1, "Pavlov", 02, 200_000);
        dataOfWEmployee[7] = new Employee(1, "Sidorov", 04, 160_000);
        dataOfWEmployee[8] = new Employee(1, "Orlov", 02, 210_000);
        dataOfWEmployee[9] = new Employee(1, "Romanova", 01, 300_000);*/
        Integer counterId = 0;
        Map<Integer, Employee> dataOfWEmployee = new HashMap<>();
        {
            dataOfWEmployee.put(0, new Employee(1, "Nikolaeva", 01, 100_000));
            dataOfWEmployee.put(1, new Employee(1, "Ivanova", 05, 200_000));
            dataOfWEmployee.put(2, new Employee(1, "Popov", 03, 150_000););
            dataOfWEmployee.put(3, new Employee(1, "Petrova", 04, 123_000));
            dataOfWEmployee.put(4, new Employee(1, "Vasilev", 03, 110_000));
            dataOfWEmployee.put(5, new Employee(1, "Morozova", 05, 150_000));
            dataOfWEmployee.put(6, new Employee(1, "Pavlov", 02, 200_000));
            dataOfWEmployee.put(7, new Employee(1, "Sidorov", 04, 160_000));
            dataOfWEmployee.put(8, new Employee(1, "Orlov", 02, 210_000));
            dataOfWEmployee.put(9, new Employee(1, "Romanova", 01, 300_000));
        }



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

    private Integer getId(int counterId) {
        Integer result = counterId;
        counterId = counterId + 1;
        return result;
    }

    public static void allEmployee(Map dataOfWEmployee) { //вывести всех сотрудников
        for (int i = 0; i < dataOfWEmployee.size(); i++) {
            System.out.println(dataOfWEmployee.get(i));
        }
    }

    public static int sumOfSalary(Map dataOfWEmployee, Employee getSalary) { //сумма зарплат
        int generalSalary = 0;
        for (int i = 0; i < dataOfWEmployee.size(); i++) {
            generalSalary = generalSalary + dataOfWEmployee.get(i);
        }
        System.out.println(generalSalary);


        return generalSalary;
    }


    public static void minSalary(Map dataOfWEmployee) { //минимальная зарплата

        int min = dataOfWEmployee.get(0).getSalary();
        int max = dataOfWEmployee.size();
        for (int i = 0; i < dataOfWEmployee.size(); i++) {
            if (dataOfWEmployee.get(i).getSalary() < min) {
                min = dataOfWEmployee.get(i).getSalary();
            }
        }
        System.out.println(min);
    }

    public static void maxSalary(Map dataOfWEmployee) { //максимальная зарплата
        int min = dataOfWEmployee.get(0).getSalary();
        int max = dataOfWEmployee.size();
        for (int i = 0; i < dataOfWEmployee.size(); i++) {
            if (dataOfWEmployee.get(i).getSalary() > min) {
                max = dataOfWEmployee.get(i).getSalary();
            }
        }
        System.out.println(max);
    }

    public static void midSalary(Map dataOfWEmployee) { //средняя зарплата
        int everyoneSalary = sumOfSalary(dataOfWEmployee);
        double midSalarySum = everyoneSalary / dataOfWEmployee.size();
        System.out.println(midSalarySum);
    }

    public static void onlyNamesEmployee(Map dataOfWEmployee) { //ФИО сотрудников
        for (int i = 0; i < dataOfWEmployee.size(); i++) {
            System.out.println(dataOfWEmployee.get(i).getFamilyName());
        }
    }
}
