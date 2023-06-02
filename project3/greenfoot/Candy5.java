import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Candy5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Candy5 extends Candy
{
    /**
     * Act - do whatever the Candy5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru() {
        Candy5 candy5 = new Candy5();
        getWorld().addObject(candy5,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju() {
        setLocation(getX(), getY()+3);
    }
    
    public void act() 
    {
        super.act();
    }     
}
