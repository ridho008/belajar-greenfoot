import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        turtle turtle = new turtle();
        addObject(turtle,103,419);
        Apple apple = new Apple();
        addObject(apple,122,98);
        Apple apple2 = new Apple();
        addObject(apple2,290,265);
        Apple apple3 = new Apple();
        addObject(apple3,532,545);
        Apple apple4 = new Apple();
        addObject(apple4,484,91);
        Apple apple5 = new Apple();
        addObject(apple5,103,526);
        Apple apple6 = new Apple();
        addObject(apple6,385,395);
        Apple apple7 = new Apple();
        addObject(apple7,391,173);
        Apple apple8 = new Apple();
        addObject(apple8,190,191);
        Apple apple9 = new Apple();
        addObject(apple9,190,397);
    }
}
