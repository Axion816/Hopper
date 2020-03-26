import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Board{
    //Initialise PNGs
    private ImageIcon water = new ImageIcon("Water.png");
    private ImageIcon greenFrog = new ImageIcon("GreenFrog.png");
    private ImageIcon greenFrog2 = new ImageIcon("GreenFrog2.png");
    private ImageIcon lilyPad = new ImageIcon("LilyPad.png");
    private ImageIcon redFrog = new ImageIcon("RedFrog.png");
    private ImageIcon redFrog2 = new ImageIcon("RedFrog2.png");
    private ImageIcon temptIcon;
    //Initialise GUI variables
    private GridLayout grid = new GridLayout(5,5);
    private JPanel panel = new JPanel();
    private JFrame board = new JFrame("Hoppers!");
    private Square[] square;
    private JButton tempButton;
    private int level=0;
    private boolean redFrogClicked = false;
    private int refFrogLocation=0;
    //Board Constructor
    public Board(){
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setSize(600,600);
        board.setContentPane(panel);
        panel.setLayout(grid);
        //Level Layouts
        for(int i=0;i<25;i++){
            if(level==0){
                square[i] = new Square(i,water);
            }
        else if(level==1){
                if(i==1 || i==3 || i==5 || i==11 || i==15 || i==17 || i==19){
                    square[i] = new Square(i,lilyPad);
                }
                else if(i==7 || i==9 ||i==13 ||i==21 ||i==25){
                    square[i] = new Square(i,greenFrog);
                }
                else if(i==23){
                    square[i] = new Square(i,redFrog);
                }
                else{
                    square[i] = new Square(i,water);
                }
            }
            panel.add(square[i].button);
        }
        board.setVisible(true);
    }
    public boolean redFrogCheck(){
        for(int i=0; i<25;i++){
            if(square[i].getCurrentIcon==redFrog){
                return true;
            }
        }
        return false;
    }
    public void toggleRedFrog(){
        if(redFrogClicked==true){
            redFrogClicked=false;
        }
        else{
            redFrogClicked=true;
        }
    }
    public int getRedFrogLocation(){
        //for loop through squares.
        private int j = 0;
        for(int i=0;i<25;i++))
            if(square[i].getCurrentIcon()==redFrog2){
                redFrogLocation=i;
                return redFrogLocation;
            }
        }
    }
    public boolean getRedFrogToggle(){
        return redFrogClicked;
    }
    public static void main(String[] args){
    }
}