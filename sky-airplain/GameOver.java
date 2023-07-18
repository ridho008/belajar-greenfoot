import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    GreenfootSound music = new GreenfootSound("game-over.mp3");
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayAgainButton playAgainButton = new PlayAgainButton();
        addObject(playAgainButton,100,250);
        
        NoButton noButton = new NoButton();
        addObject(noButton,200,250);

        showText("Your Score: "+ Play.score.getValue(), 150, 300);
        
    }
    
    public void act()
    {
       if(Greenfoot.mouseClicked(this))
        {
            //stop the music
            music.stop();
        }
        //check if the music isn't being played
        else if(!music.isPlaying())
        {
            //play the music
            music.play();
        }
        
    }
}
