import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * title screen.
 * 
 * @author (mark ku) 
 * @version (may 9)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("Hungry Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject (titleLabel, getWidth()/2, 200);
        prepare();
    }
    
    
    /** 
     * The main world act loop
     */
    public void act()
    {
        //start game if use presses space
        if (Greenfoot.isKeyDown("space"));
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /** 
     * Prepare world for start of program
     * That is: create the initial objects and add them to the world
     */

    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject (elephant, 479, 87);
        elephant.setLocation(538,70);
        Label label = new Label("Use <-- and --> to Move", 40);
        addObject(label,299,270);
        label.setLocation(317,238);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,275,333);
        label2.setLocation(333,305);
        label.setLocation(314,251);
        label2.setLocation(291,342);
        label.setLocation(248,294);
        label.setLocation(345,277);
        label.setLocation(317,277);
        label2.setLocation(297,334);
        elephant.setLocation(270,85);
        elephant.setLocation(303,114);
        label2.setLocation(323,337);
        label.setLocation(320,285);
        label.setLocation(300,291);
        label2.setLocation(314,349);
        label2.setLocation(303,349);
    }
}
