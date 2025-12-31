package designPattern.creational.factory;
/**This will have the emlpoyee methods which will return employee based on inputs*/
public class EmployeeFactory {

    public static IEmployee getEmployee(String employeeType) {
        if(employeeType.equals("HR")){
            IEmployee hr = new HR();
            return hr;
        }else {
            IEmployee sde = new SDE();
            return sde;
        }
    }
}
