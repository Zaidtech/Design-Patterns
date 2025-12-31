package designPattern.creational.abstractFactory;

public class SDE implements IEmployee {
    @Override
    public int getSalary() {
        System.out.println("1000");
        return 1000;
    }

    @Override
    public String getName() {
        System.out.println("SDE");
        return "SDE";
    }
}
