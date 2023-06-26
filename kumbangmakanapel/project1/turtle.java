import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends Actor
{
    public int j = 0;
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        // pindah 1 pixel, setiap di gerakkan mouse
        move(1);
        if(Greenfoot.isKeyDown("left")) {
            turn(-5);
        } 
        if(Greenfoot.isKeyDown("right")){
            turn(5);
        }
        makan();
        getWorld().showText("Score = " + j, 111, 51);
        cekScore();
    }
    
    public void makan()
    {
        // mendpatkan object apple, lalu x, y menjadi 0
        Actor apple = getOneObjectAtOffset(0,0,Apple.class);
        // menghilangkan object apple
        if(apple != null) {
            getWorld().removeObject(apple);
            j++;
        }
    }
    
    public void cekScore()
    {
        if(j>2) {
            Finish alert_finish = new Finish();
            getWorld().addObject(alert_finish,311,311);
        }
    }
}
