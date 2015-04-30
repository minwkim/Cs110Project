import javax.swing.*;
import java.util.*;

public class WarDriver{
   public static void main(String [] args){
      
      WarGameTwoGUI game = new WarGameTwoGUI();
      WarGameTwo games = new WarGameTwo();
      int placeHolder = 0;
      Card newCard = new Card();
      Card [] deck = new Card [52];
      for (int i = 0; i < 4; i++){
         for (int j = 0; j < 13; j++){
            deck[placeHolder] = new Card(i, j);
            placeHolder++;
         }
      }
      Collections.shuffle(Arrays.asList(deck));
      game.setDecks(deck);
      
      JFrame frame = new WarGameTwoGUI();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500,500);
      frame.validate();
      frame.setVisible(true);
      
   }
}