package mb;
class StaffMember {
 void work() {
     System.out.println("Staff member is working");
 }
 double getSalary() {
     return 50000; 
 }
}
class HRExecutive extends StaffMember {
 void work() {
     System.out.println("HR Executive is managing human resources");
 }
 void addEmployee() {
     System.out.println("HR Executive is adding a new employee");
 }
}
public class HR {
 public static void main(String[] args) {
     StaffMember staff = new StaffMember();
     System.out.println("Salary: " + staff.getSalary());
     HRExecutive hrExec = new HRExecutive();
     hrExec.work();
     hrExec.addEmployee(); 
     System.out.println("Salary: " + hrExec.getSalary());
 }
}

