package singleton;

/** The LAZY way but with synchronized block
 * Singleton: Only one object can be created for this class
 * To make thread safe make it synchronized.
 *
 * @author Zaid
 * @version 1.0.0
 *
 * */
public class ShapeThreadSafe {
    static ShapeThreadSafe shapeThreadSafe;

    /**
     * Private constructor
     * */
    private ShapeThreadSafe(){
    }

    /**A method when called returns the object and only the same object always
     * But wait, I cannot have object of this class, so I need to make this static then!!
     * */
    public static ShapeThreadSafe getShapeThreadSafe(){
        /**
         * Need to have some way to make it thread safe
         * Adding block level synchronization instead of method level
         * */
        synchronized (ShapeThreadSafe.class){
            if(shapeThreadSafe==null){
                shapeThreadSafe = new ShapeThreadSafe();
            }
        }
        return shapeThreadSafe;
    }
}
