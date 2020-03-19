import javax.swing.*;
import java.awt.*;
public class Board{
    ImageIcon water = new ImageIcon("Water.png");
    public Board(){
        JFrame board = new JFrame("Hoppers!");
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setSize(600,600);
 
        JPanel panel = new JPanel();
        GridLayout grid = new GridLayout(5,5);
        panel.setLayout(grid);
        board.setContentPane(panel);
        Square[] square = new Square[25];
        JButton[] button = new JButton[25];
        for(int i=0;i<25;i++){
            button[i].setIcon(water);
            panel.add(button[i]);
        }
        board.setVisible(true);
    }
}