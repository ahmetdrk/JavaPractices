package day37_Inheritance.scrumTask;

public class Employee extends Person {

    public String jobTitle;  // person class a ekleyecegimiz seyleri yaziyoruz
    public int id;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender); // person classta yazanlar otomatik super le getiriliyor
        this.jobTitle = jobTitle;  // person classta yazanlardan farkli ekledigimiz seyleri this olarak constructor yapiyoruz
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work() {
        System.out.println(jobTitle + " " + name + " is working");
    }

    public String toString() {
        return "Employee{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
