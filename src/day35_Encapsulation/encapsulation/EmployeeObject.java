package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatiana", 'F', 28, 110000);

        employee1.setAge(30);


        Employee employee2 = new Employee("Aygun", 'F', 31, 100000);
        employee2.setName("Elvira");
        employee2.setSalary(employee2.getSalary() + 10000);


        System.out.println(employee1);
        System.out.println(employee2);

    }
}
