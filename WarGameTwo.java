import javax.swing.*;
import java.util.*;

public class WarGameTwo{
    public Queue<Card> playerOne = new LinkedList<Card>();
    public Queue<Card> playerTwo = new LinkedList<Card>();
    public Card tempCard = new Card();
    public WarGameTwo(){} 
    
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
    
    public Object getPlayerOne(){
       return playerOne.poll();
    }
    
    public Object getPlayerTwo(){
       return playerTwo.poll();       
    }
    
    public void setPlayerOne(Card playerOne){
    this.playerOne.add(playerOne);
    }
    public void setPlayerTwo(Card playerTwo){
    this.playerOne.add(playerTwo);
    }
    
    
}