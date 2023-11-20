// This is a class
public class Main{
// Function that which contains an arguments
    public static void main(String[] args) {
// First Employee
        Employee employee1 = new Employee();
        employee1.BaseSalary = 16000;
        employee1.bonusHrs = 20;
        employee1.Sales = 120;
        employee1.name = "Reda Berrada";
        System.out.println("Base salary "+employee1.BaseSalary +" ,bonus hours "+employee1.bonusHrs+" ,sales "+ employee1.Sales +" this information for Mr "+employee1.name);
        employee1.CalculateNetSalary();

// Second Employee
        Employee employee2 = new Employee();
        employee2.BaseSalary = 20000;
        employee2.bonusHrs = 30;
        employee2.Sales = 200;
        employee2.name = "Simohamed Nadir";
        System.out.println("Base salary "+employee2.BaseSalary +" ,bonus hours "+employee2.bonusHrs+" ,sales "+ employee2.Sales +" this information for Mr "+employee2.name);
        employee2.CalculateNetSalary();
    }
}