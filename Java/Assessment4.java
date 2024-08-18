package mb;

class TeamLead {
    double baseSalary;
    double bonus;

    TeamLead(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Developer {
    double baseSalary;
    double overtimePay;
    int overtimeHours;

    Developer(double baseSalary, double overtimePay, int overtimeHours) {
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
        this.overtimeHours = overtimeHours;
    }

    double calculateSalary() {
        return baseSalary + (overtimePay * overtimeHours);
    }
}

public class Assessment4 {
    public static void main(String[] args) {
        TeamLead myTeamLead = new TeamLead(50000, 10000);
        Developer myDeveloper = new Developer(40000, 50, 10);
        System.out.println("Team Lead Salary: " + myTeamLead.calculateSalary());
        System.out.println("Developer Salary: " + myDeveloper.calculateSalary());
    }
}