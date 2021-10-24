import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    public Button(String text, int fontSize){
        GreenfootImage playButton = new GreenfootImage(fontSize*2, fontSize*2);
        Font adjustedFont = new Font(true, false, fontSize);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.BLACK);
        playButton.drawString(text, 0, fontSize);
        //setImage(playButton);
        setImage(new GreenfootImage(""+text, fontSize, Color.BLACK, new Color(0, 0, 0, 0)));
    }
}
