import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class No3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class No3 extends No
{
    /**
     * Act - do whatever the No3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru() {
        No3 no3 = new No3();
        getWorld().addObject(no3,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju() {
        setLocation(getX(), getY()+2);
    }
    
    public void act() 
    {
        super.act();
    }    
}
