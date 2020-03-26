import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Square{
    private ImageIcon water = new ImageIcon("Water.png");
    private ImageIcon greenFrog = new ImageIcon("GreenFrog.png");
    private ImageIcon greenFrog2 = new ImageIcon("GreenFrog2.png");
    private ImageIcon lilyPad = new ImageIcon("LilyPad.png");
    private ImageIcon redFrog = new ImageIcon("RedFrog.png");
    private ImageIcon redFrog2 = new ImageIcon("RedFrog2.png");
    public JButton button;
    private int squareLocation;
    private ImageIcon currentIcon;
    public Square(int i,ImageIcon j){
        JButton button = new JButton(j);
        currentIcon=j;
        squareLocation= i;
        button.addActionListener(this);
    }
    public JButton getButton(){
        return button;
    }
    public int getSquareLocation(){
        return squareLocation;
    }
    public ImageIcon getCurrentIcon(){
        return currentIcon;
    }

    public void actionPerformed(ActionEvent e){
        if(currentIcon==redFrog){
            currentIcon = redFrog2;
            JButton button = new JButton(currentIcon);
            redFrogClicked = true;
        }
        if(currentIcon==redFrog2){
            currentIcon = redFrog;
            JButton button = new JButton(currentIcon);
        }
        if(currentIcon==lilyPad && Board.getRedFrogToggle()==true){
            if(validMove(squareLocation)==true){
                //deToggle redfrog
                //set other square to lilyPad.
                //set current icon red frog
            }
        }
    }
    public boolean validMove(int i){
        if(Board.getRedFrogLocation()+ == squareLocation)
    }
    
}