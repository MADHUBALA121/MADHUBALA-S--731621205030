package mb;

class Workers {
    String name;
    String jobTitle;
    double salary;
    Workers(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    void giveRaise(double percentage) {
        salary += salary * (percentage / 100);
    }
    void updateSalary(double newSalary) {
        salary = newSalary;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDetails3{
    public static void main(String[] args) {
    	Workers emp1 = new Workers("Mounika", "Frontend Develpoer", 60000);
    	Workers emp2 = new Workers("Arunkumar", "Project Manager", 80000);
        System.out.println("Before Change");
        emp1.display();
        emp2.display();
        emp1.giveRaise(10); 
        emp2.updateSalary(85000);
        System.out.println("After Change");
        emp1.display();
        emp2.display();
    }
}