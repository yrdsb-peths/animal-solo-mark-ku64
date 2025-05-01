import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The elephant is the hero.
 * 
 * @author (mark ku) 
 * @version (April 29 2025)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound ("elephantscream.mp3");
    
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
            elephantSound.play();
        }
    }
}
