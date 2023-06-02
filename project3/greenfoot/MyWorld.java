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
        super(300, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Kodok kodok = new Kodok();
        addObject(kodok,143,434);
        Candy1 candy1 = new Candy1();
        addObject(candy1,32,51);
        Candy2 candy2 = new Candy2();
        addObject(candy2,79,166);
        Candy3 candy3 = new Candy3();
        addObject(candy3,276,356);
        Candy4 candy4 = new Candy4();
        addObject(candy4,15,259);
        Candy5 candy5 = new Candy5();
        addObject(candy5,187,19);
        No1 no1 = new No1();
        addObject(no1,201,141);
        No2 no2 = new No2();
        addObject(no2,77,230);
        No3 no3 = new No3();
        addObject(no3,216,220);
        Counter counter = new Counter();
        addObject(counter,49,479);
        Counter2 counter2 = new Counter2();
        addObject(counter2,251,475);
    }
}
