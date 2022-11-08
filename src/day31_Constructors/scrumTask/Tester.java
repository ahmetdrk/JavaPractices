package day31_Constructors.scrumTask;

public class Tester {

    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                '}';
    }

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void smoke() {
        System.out.println(name + " is someke testing");
    }

    public void creatingTicket() {
        System.out.println(name + " is creating ticket");
    }

}
