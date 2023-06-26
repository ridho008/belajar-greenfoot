import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends World
{
    // Counter
    static Counter score = new Counter("Score");
    static Counter health = new Counter("Health");
    private int imageCount = 0;
 
    private GreenfootImage bgImage = new GreenfootImage(getBackground());
    private int scrollPosition = 0;
    private final int pictureWidth;
    /*private int count;
    private GreenfootImage B1;
    private GreenfootImage B2;
    */
    /**
     * Constructor for objects of class Play.
     * 
     */
    public Play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1);
        
        pictureWidth = (int) ((double)bgImage.getWidth() / bgImage.getHeight()*500);
        
        bgImage.scale(pictureWidth, 500);
        getBackground().drawImage(bgImage,0,0);
        //B1 = new GreenfootImage("sky-bg.png");
        //B2 = new GreenfootImage("bg-new.jpg");
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        AirPlanes airPlanes = new AirPlanes();
        addObject(airPlanes,146,471);
        airPlanes.setLocation(140,474);
        AirPlanes airPlanes2 = new AirPlanes();
        addObject(airPlanes2,146,399);
        airPlanes.setLocation(150,474);
        removeObject(airPlanes2);
        addObject(airPlanes2,154,390);
        removeObject(airPlanes);
        airPlanes2.setLocation(142,468);
        airPlanes2.setLocation(141,465);
        airPlanes2.setLocation(151,468);
        airPlanes2.setLocation(150,462);
        
        addObject(score, 40, 30);
        score.setValue(0);
        
        addObject(health, 260, 30);
        health.setValue(5);
    }
    
    public void act()
    {
        /*imageCount += 1; //(or any other value; small -> slow moving, big -> fast movement)
        drawBackgroundImage();*/
        scrollBackground(-2);
        //BackgroundSwitch();
        if(Greenfoot.getRandomNumber(500)<1) {
            addObject(new SkyBox(),Greenfoot.getRandomNumber(10),1);
        }
        
        if(Greenfoot.getRandomNumber(500)<1) {
            addObject(new BomOne(),Greenfoot.getRandomNumber(1000),1);
        }
        
        if(Greenfoot.getRandomNumber(500)<1) {
            addObject(new BomTwo(),Greenfoot.getRandomNumber(1000),1);
        }
        
        if(Greenfoot.getRandomNumber(500)<1) {
            addObject(new BomThree(),Greenfoot.getRandomNumber(1000),1);
        }
        
        if(Play.health.getValue() == 0) {
            Greenfoot.setWorld(new GameOver());
        }
    }
    
    private void scrollBackground(int dx) {
        dx = dx % 300;
        if(dx < 0)
            dx = dx + 300;
        scrollPosition = (scrollPosition - dx) % pictureWidth;
        
        GreenfootImage bg = getBackground();
        bg.drawImage(bgImage, 0,scrollPosition);
        bg.drawImage(bgImage, 0, pictureWidth + scrollPosition);
    }
    
    /*private void BackgroundSwitch()
    {
        if (count % 20 == 0)
        {
            if (count % 40 == 0)
                setBackground(B1);
            else
                setBackground(B2);
        }
        count++;
    }*/
    
    public void drawBackgroundImage() {
        if (imageCount > bgImage.getWidth()) {
            imageCount -= bgImage.getWidth();
        }
        int temp = imageCount;
        getBackground().drawImage(bgImage, 0, temp);
        //getBackground().drawImage(bgImage, 0, temp + 500);
    }
}
