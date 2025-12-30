package designPattern;

import singleton.*;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        var shapeReflectionSafe =  ShapeReflectionSafe.getInstance();
        Constructor constructor = ShapeReflectionSafe.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        var newObject =  constructor.newInstance();
        System.out.println(shapeReflectionSafe.equals(newObject));
    }
}