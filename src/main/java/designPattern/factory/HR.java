package designPattern.factory;

public class HR implements IEmployee{
    @Override
    public int getSalary() {
        System.out.println("HR: 10000");
        return 10000;
    }
}
