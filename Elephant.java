import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The elephant is the hero.
 * 
 * @author (mark ku) 
 * @version (April 29 2025)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    
    if (Greenfoot.isKeyDown("left"))
    {
        move(-1);
    }
    else if (Greenfoot.isKeyDown("right"))
    {
        move(1);
    }
    
    // Remove apple if elephant eats it
    eat();
    }
    
    /**
     * Eat apple and spawn new apple if apple is ate
     */
    public void eat()
    {
        if (isTouching(Apple.class))
        {
            removeTouching (Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
        }
    }
}
