package designPattern.abstractFactory;

public class HR implements IEmployee {
    @Override
    public int getSalary() {
        System.out.println("2000");
        return 1000;
    }

    @Override
    public String getName() {
        System.out.println("Hr");
        return "SDE";
    }
}
