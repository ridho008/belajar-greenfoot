import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class No1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class No1 extends No
{
    /**
     * Act - do whatever the No1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru() {
        No1 no1 = new No1();
        getWorld().addObject(no1,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju() {
        setLocation(getX(), getY()+2);
    }
    
    public void act() 
    {
        super.act();
    }   
}
