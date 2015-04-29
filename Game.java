import java.util.*;
public class Game{
   public static void main(String [] args){
   /*int[][] deckValues = new int [3][11];
   for (int i = 0; i < 3; i++){
      for (int k = 0; k<11 ; k++){
         deckValues[i][k] = k + 1;
         
      }
   }*/
   int placeHolder = 0;
   Card newCard = new Card();
   Card [] deck = new Card [52];
   for (int i = 0; i < 4; i++){
      for (int j = 0; j < 13; j++){
         deck[placeHolder] = new Card(i, j);
         //System.out.println(i);
         //System.out.println(j);
         
         placeHolder++;
      }
   }
   
   
   Queue<Card> playerOne = new LinkedList<Card>();
   Queue<Card> playerTwo = new LinkedList<Card>();
   
   System.out.println(deck[51]);
   System.out.println(deck[51].getVal());
   }
}