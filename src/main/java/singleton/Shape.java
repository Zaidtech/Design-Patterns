package singleton;

/**
 * Singleton: Only one object can be created for this class
 * That means, I cannot expose the constructor (make it private!!)
 *
 * @author Zaid
 * @version 1.0.0
 *
 * */
public class Shape {
    /**Will be null by default*/
    static Shape shape;

    /**
     * Private constructor
     * */
    private Shape(){
    }

    /**A method when called returns the object and only the same object always
     * But wait, I cannot have object of this class, so I need to make this static then!!
     * */
    public static Shape getShape(){
        /**
         * Need to have some way to check if I already created an object or not!
         * Why not create a placeholder of type shape !
         * But wait this method is static so let's make that static as well then
         * Now i can check if the shape (line 13 is null ) means no object otherwise I will create once
         * */
        if(shape==null){
            shape = new Shape();
        }
        return shape;
    }
}
