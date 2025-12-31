package designPattern.abstractFactory;

public class HrFactory extends AbstractEmployeeFactory {
    @Override
    public IEmployee getEmployee() {
        return new HR();
    }
}
