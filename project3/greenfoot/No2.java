import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class No2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class No2 extends No
{
    /**
     * Act - do whatever the No2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    void cetakbaru() {
        No2 no2 = new No2();
        getWorld().addObject(no2,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju() {
        setLocation(getX(), getY()+2);
    }
    
    public void act() 
    {
        super.act();
    }    
}
