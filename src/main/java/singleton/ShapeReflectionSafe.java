package singleton;

public class ShapeReflectionSafe {

    private static ShapeReflectionSafe shapeReflectionSafe;

    private ShapeReflectionSafe(){
        if(shapeReflectionSafe!=null){
            throw new RuntimeException("ShapeReflectionSafe has already been initialized");
        }
    }

    public static ShapeReflectionSafe getInstance() {
        synchronized(ShapeReflectionSafe.class) {
            if (shapeReflectionSafe == null)
                shapeReflectionSafe = new ShapeReflectionSafe();
        }
        return shapeReflectionSafe;
    }

}
