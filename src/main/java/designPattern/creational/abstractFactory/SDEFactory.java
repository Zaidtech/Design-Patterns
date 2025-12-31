package designPattern.creational.abstractFactory;

public class SDEFactory extends AbstractEmployeeFactory {

    @Override
    public IEmployee getEmployee() {
        return new SDE();
    }

}
