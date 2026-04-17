import greenfoot.*;

public class MyWorld extends World {

    boolean gameLost = false;
    private int time = 0;

    public MyWorld() {
        super(600, 400, 1);
        addObject(new Hero(), 300, 200);
        addObject(new Banana(), 600, Greenfoot.getRandomNumber(400));
    }

    public void act() {
        time++;
        if (time % 50 == 0) {
             addObject(new Banana(), 600, Greenfoot.getRandomNumber(400));
        }
    }
}
