package designPattern.creational.factory;

public class SDE implements IEmployee{

    @Override
    public int getSalary() {
        System.out.println("SDE: 20000");
        return 20000;
    }
}
