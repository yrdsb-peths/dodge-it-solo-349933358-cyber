import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        boolean gameLost = ((MyWorld)getWorld()).gameLost;

        if (Greenfoot.isKeyDown("down"))
        {   
            if (gameLost == false) {
                setLocation(getX(), getY()+5);
            
                
            }
        }
        if (Greenfoot.isKeyDown("up"))
        {
            if (gameLost == false) {
                setLocation(getX(), getY()-5);
            
            }
        }
        
        if (isTouching(Banana.class))
        {
           ((MyWorld)getWorld()).gameLost = true;
           getWorld().removeObject(this);
        }
        
    }
}
