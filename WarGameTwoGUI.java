import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class WarGameTwoGUI extends JFrame{
   private WarGameTwo game;
   private JPanel topPanel, gamePanel;
   private JButton buttons;
   private JLabel status;
   private JLabel title;
   private JLabel message;
   private String input = "yes";
   private Queue<Card> playerOne = new LinkedList<Card>();
   private Queue<Card> playerTwo = new LinkedList<Card>();
   private Queue<Card> pile = new LinkedList<Card>();
   private Card tempOne;
   private Card tempTwo;
   
   
   public WarGameTwoGUI(){
      setLayout(new GridLayout(2,2));
      game = new WarGameTwo();
      topPanel = new JPanel();
      topPanel.setBackground(Color.green);
      gamePanel = new JPanel();
      buttons = new JButton("Play");
      title = new JLabel("THE GAME OF WAR");
      title.setFont(new Font("HELVETICA",Font.ITALIC,36));
      topPanel.add(title);
      
      status = new JLabel("The war wages");
      status.setFont(new Font("ARIAL", Font.BOLD,34));
      topPanel.add(status);
      topPanel.add(buttons);
      buttons.addActionListener(new ButtonListener());
      add(topPanel);
      gamePanel.setBackground(Color.red);
      message = new JLabel("WAR!!!");
      message.setFont(new Font("ARIAL", Font.BOLD, 34));
      gamePanel.add(message);
      add(gamePanel);
   }
   public void setDecks(Card[] deck){
      for (int i = 0; i < 52; i++){
         if (i % 2 == 0){
            playerOne.add(deck[i]);
         }
         else{
            playerTwo.add(deck[i]);
         }
      } 
   }
   private class ButtonListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         

         while (playerOne.peek() != null && playerTwo.peek() != null){
            //Setting Card Values(flipping)
            if (playerOne.peek() != null){
               tempOne = playerOne.poll();
               System.out.println(tempOne.getVal());
               pile.add(tempOne);
            }
            if (playerTwo.peek() != null){
               tempTwo = playerTwo.poll();
               System.out.println(tempTwo.getVal());
               pile.add(tempTwo);
            }
            //Round Conditions
            if (tempOne.getVal() > tempTwo.getVal()){
               
               while (pile.peek() != null){
                  playerOne.add(pile.poll());
               }
            }
            if (tempTwo.getVal() > tempOne.getVal()){
               
               while (pile.peek() != null){
                  playerTwo.add(pile.poll());
               }
            }
            
            //*********************WAAAAAAAAAAAAARRRRRRRRRRRRRRRRRRRR****************************
            if (tempOne.getVal() == tempTwo.getVal()){
               
               while(tempOne.getVal() == tempTwo.getVal()){
                  pile.add(tempOne);
                  pile.add(tempTwo);
                  if (playerOne.peek() != null){
                     tempOne = playerOne.poll();
                  }
                  else{
                     
                     System.exit(0);
                  }
                  if (playerTwo.peek() != null){
                     tempTwo = playerTwo.poll();
                  }
                  else{
                     
                     System.exit(0);
                  }
               
               }
               if (tempOne.getVal() > tempTwo.getVal()){
                  
                  while (pile.peek() != null){
                     playerOne.add(pile.poll());
                  }
               }
               if (tempTwo.getVal() > tempOne.getVal()){
                  
                  while (pile.peek() != null){
                     playerTwo.add(pile.poll());
                  }
               
               }
            }
            
            //**************ENNNDDDDDDDD OFFFFF WAAAAAAAAARRRRRRRRRRRRR****************
            
         }
         
         if (playerOne.peek() == null){
            message.setText("You have lost");
         }
         if (playerTwo.peek() == null){
            message.setText("You won");
         }
   
      
      }
   }
   
}