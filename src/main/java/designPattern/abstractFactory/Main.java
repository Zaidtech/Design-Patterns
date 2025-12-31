package designPattern.abstractFactory;

public class Main {
    public static void main(String[] args) {

    var emp1 =  EmployeeFactory.getEmployee(new HrFactory());
    var emp2 =  EmployeeFactory.getEmployee(new SDEFactory());

    }
}
