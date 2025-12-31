package designPattern.creational.abstractFactory;

public class EmployeeFactory {
    public static IEmployee getEmployee(AbstractEmployeeFactory factory) {
        return factory.getEmployee();
    }
}
