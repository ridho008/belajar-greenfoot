import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PizzaMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PizzaMan extends Actor
{
    /**
     * Act - do whatever the PizzaMan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 5, getY());
        }
        
        if(Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 5, getY());
        }
        
        // menghilangkan pizza
        Pizza p = (Pizza)getOneIntersectingObject(Pizza.class);
        if(p != null) {
            getWorld().removeObject(p);
            Play.score.add(10);
            Greenfoot.playSound("pacman_eatfruit.wav");
        }
        
        // menghilangkan tire
        Tire t = (Tire)getOneIntersectingObject(Tire.class);
        if(t != null) {
            getWorld().removeObject(t);
            Play.health.add(-1);
            Greenfoot.playSound("pacman_intermission.wav");
        }
    }
}
