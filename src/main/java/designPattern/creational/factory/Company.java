package designPattern.creational.factory;

public class Company {

    public static void main(String[] args) {
        IEmployee employee = new HR(); // we have fixed here coupled why not make it dynamic
        IEmployee employee2 = new SDE();

        IEmployee employee1 =  EmployeeFactory.getEmployee("HR");
        employee1.getSalary();
        IEmployee employee3 = EmployeeFactory.getEmployee("SDE");
        employee3.getSalary();
    }

}
