import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends World
{
    static Counter score = new Counter("score");
    static Counter health = new Counter("health");
    /**
     * Constructor for objects of class Play.
     * 
     */
    public Play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PizzaMan pizzaMan = new PizzaMan();
        addObject(pizzaMan,142,469);
        pizzaMan.getY();
        
        addObject(score, 40, 30);
        score.setValue(0);
        addObject(health, 260, 30);
        health.setValue(5);
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(500) < 3) {
            addObject(new Pizza(),Greenfoot.getRandomNumber(1000), 1);
        }
        
        if(Greenfoot.getRandomNumber(500) < 3) {
            addObject(new Tire(),Greenfoot.getRandomNumber(1000), 1);
        }
        
        // ketika game over
        if(Play.health.getValue() == 0) {
            Greenfoot.setWorld(new GameOver());
        }
    }
}
