package singleton;

/**This is the EAGER way of making the singleton class
 *
 * @author Zaid
 * @version 1.0.0
 *
 * */
public class Vehicle {
    /*Eager way , directly creating the object */
    private static final Vehicle vehicle = new Vehicle();

    /*Static method to return the vehicle object*/
    public static Vehicle getVehicle() {
        return vehicle;
    }
}
