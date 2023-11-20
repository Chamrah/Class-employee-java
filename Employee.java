// Class that define the objects (UML)
public class Employee {
    double BaseSalary;
    double bonusHrs;
    double Sales;
    String name;
    double net;
// Method that calculate net salary of the employees
    void CalculateNetSalary(){
        net = BaseSalary + Sales * 100;
        System.out.println("The net salary for "+name+" is "+net);

    }
}
