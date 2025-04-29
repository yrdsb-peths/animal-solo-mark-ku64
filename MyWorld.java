import greenfoot.*;

/**
 * The world is where the elephant lives in
 * 
 * @author mark ku
 * @ version April 29 2025
 */

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
    }
}
