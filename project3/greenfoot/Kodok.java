import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kodok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kodok extends Actor
{
    /**
     * Act - do whatever the Kodok wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int count = 0;
    
    void dimakan() {
        Counter.add(1);
        getWorld().removeObject(this);
    }
    
    public void act() 
    {
       if(Greenfoot.isKeyDown("right")) {
           setLocation(getX()+1, getY());
       } else if(Greenfoot.isKeyDown("left")) {
           setLocation(getX()-1, getY());
       }
       
       if(isTouching(No.class)) {
           Counter2.add(-1);
           dimakan();
       }
       
       if(Counter2.value == 0) {
           Greenfoot.delay(1);
           Greenfoot.setWorld(new Endpage());
           getWorld().removeObject(this);
       }
    }    
}
