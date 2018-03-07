package EPAM_LECTURE_13;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Matt", "London", 36, 15, Position.MANAGER));
        employees.add(new Employee("Ivan", "Lviv", 55, 27, Position.MANAGER));
        employees.add(new Employee("Mikel", "Marseille", 36, 13, Position.MANAGER));
        employees.add(new Employee("Merry", "London", 25, 6, Position.WORKER));
        employees.add(new Employee("Merry ", "London", 25, 6, Position.WORKER));
        employees.add(new Employee("John", "Liverpool", 22, 1, Position.WORKER));
        employees.add(new Employee("Robert", "Manchester", 45, 18, Position.MANAGER));
        employees.add(new Employee("Tom ", "London", 37, 19, Position.DIRECTOR));
        employees.add(new Employee("Eva", "Krakow", 29, 6, Position.WORKER));
        employees.add(new Employee("Jared", "Manchester", 38, 14, Position.WORKER));
        employees.add(new Employee("Jared", "Manchester", 38, 14, Position.WORKER));
        employees.add(new Employee("Andriy", "Ternopil", 23, 4, Position.WORKER));
        employees.add(new Employee("Marta", "Poltava", 33, 10, Position.DIRECTOR));
        employees.add(new Employee("Emma", "Chicago", 22, 3, Position.WORKER));
        employees.add(new Employee("Emilia", "London", 24, 7, Position.WORKER));
        employees.add(new Employee("Emilia", "London", 24, 7, Position.WORKER));

        Stream<Employee> employeeStream = employees.stream();
        Stream<Employee> employeeStream2 = employees.stream();
        System.out.println();
        System.out.println("Task 1");
        employeeStream2.skip(employees.size() - 4).forEach(System.out::println);
        System.out.println("Task 2");
        employeeStream.filter(employee -> employee.getName().startsWith("M") && (employee.getPosition().equals(Position.MANAGER) || employee.getPosition().equals(Position.DIRECTOR))).forEach(System.out::println);
        System.out.println("Task 3");
        employees.stream().filter(employee -> employee.getPosition().equals(Position.MANAGER)).map((employee) -> employee.getName()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Task 4");
        employees.stream().distinct().filter(employee -> employee.getWorkExperience()>5).forEach(System.out::println);
        System.out.println("Task 5");
        List list = employees.stream().filter(employee -> employee.getNativeCity().equals("London")).collect(Collectors.toList());
        System.out.println("Task 6");
        System.out.println(employees.stream().filter(employee -> employee.getAge()>30).count());
        System.out.println("Task 7");
        System.out.println(employees.stream().mapToInt(employee -> employee.getWorkExperience()).average());
        System.out.println("Task 8");
        employees.stream().peek((employee) -> employee.setWorkExperience(employee.getWorkExperience() +1)).forEach(System.out::println);
        System.out.println("Task 9");
        employees.stream().filter(employee -> !employee.getNativeCity().equals("Manchester") && employee.getAge() > 25 && employee.getAge() < 35).forEach(System.out::println);
        System.out.println("Task 10");
        employees.stream().sorted(Comparator.comparing(employee -> employee.getAge())).forEach(System.out::println);
    }
}