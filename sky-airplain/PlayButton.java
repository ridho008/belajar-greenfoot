import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Actor
{
    GreenfootSound music = new GreenfootSound("opening.mp3");
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this)) {
            music.stop();
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
            (int)Math.round(getImage().getHeight()*0.9));
        }
        
        // ketika menekan tombol play
        if(Greenfoot.mousePressed(this)) {
            music.stop();
            Greenfoot.delay(5);
            Greenfoot.setWorld(new Play());
        }
        
    
    }
}
