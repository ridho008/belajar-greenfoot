import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Candy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Candy2 extends Candy
{
    /**
     * Act - do whatever the Candy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru() {
        Candy2 candy2 = new Candy2();
        getWorld().addObject(candy2,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju() {
        setLocation(getX(), getY()+3);
    }
    
    public void act() 
    {
        super.act();
    }      
}
