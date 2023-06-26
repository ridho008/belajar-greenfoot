import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AirPlanes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AirPlanes extends Actor
{
    /**
     * Act - do whatever the AirPlanes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       if(Greenfoot.isKeyDown("left")) {
           setLocation(getX()-5, getY());
       }
       
       if(Greenfoot.isKeyDown("right")) {
           setLocation(getX()+5, getY());
       }
       
       BomOne bo = (BomOne)getOneIntersectingObject(BomOne.class);
       if(bo!=null) {
           getWorld().removeObject(bo);
           Play.health.add(-1);
       }
       
       BomTwo bt = (BomTwo)getOneIntersectingObject(BomTwo.class);
       if(bt!=null) {
           getWorld().removeObject(bt);
           Play.health.add(-1);
       }
       
       BomThree bte = (BomThree)getOneIntersectingObject(BomThree.class);
       if(bte!=null) {
           getWorld().removeObject(bte);
           Play.health.add(-1);
       }
       
       SkyBox sb = (SkyBox)getOneIntersectingObject(SkyBox.class);
       if(sb!=null) {
           getWorld().removeObject(sb);
           Play.score.add(10);
       }
    }
}
