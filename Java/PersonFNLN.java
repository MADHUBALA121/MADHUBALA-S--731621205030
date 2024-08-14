package mb;
class Individual {
 private String firstName;
 private String lastName;
 public Individual(String firstName, String lastName) {
     this.firstName = firstName;
     this.lastName = lastName;
 }
 public String getFirstName() {
     return firstName;
 }
 public String getLastName() {
     return lastName;
 }
}
class Worker extends Individual {

 private int workerId;
 private String jobTitle;
 public Worker(String firstName, String lastName, int workerId, String jobTitle) {
     super(firstName, lastName);
     this.workerId = workerId;
     this.jobTitle = jobTitle;
 }
 public int getWorkerId() {
     return workerId;
 }
 public String getLastName() {
     return super.getLastName() + " (" + jobTitle + ")";
 }
}
public class PersonFNLN {
 public static void main(String[] args) {
     Individual person = new Individual("Madhu", "Bala");
     System.out.println("First Name: " + person.getFirstName()); 
     System.out.println("Last Name: " + person.getLastName()); 
     Worker worker = new Worker("Arun", "Mounika", 12345, "Manager");
     System.out.println("First Name: " + worker.getFirstName());
     System.out.println("Last Name: " + worker.getLastName()); 
     System.out.println("Worker ID: " + worker.getWorkerId());
 }
}



