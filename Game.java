import java.util.*;

public class Game{
   public static void main(String [] args){

   Scanner keyboard = new Scanner(System.in);
   String input;
   //Creating the Deck
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
   //shuffle the deck
   Collections.shuffle(Arrays.asList(deck));
   
   //distribute cards
   Queue<Card> playerOne = new LinkedList<Card>();
   Queue<Card> playerTwo = new LinkedList<Card>();
   
   for (int i = 0; i < 52; i++){
      if (i % 2 == 0){
         playerOne.add(deck[i]);
      }
      else{
         playerTwo.add(deck[i]);
      }
   }
   
   
   System.out.println("Want to play a Game?");
   input = keyboard.nextLine();
   
   Queue<Card> pile = new LinkedList<Card>();
   Card tempOne = new Card();
   Card tempTwo = new Card();
   if ( input.equals("yes")){
      System.out.println("Well then, lets play");
      input = "fight";
      while (playerOne.peek() != null && playerTwo.peek() != null && input.equals("fight")){
         
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
         
         if (tempOne.getVal() > tempTwo.getVal()){
            System.out.println("You win this round");
            while (pile.peek() != null){
               playerOne.add(pile.poll());
            }
         }
         if (tempTwo.getVal() > tempOne.getVal()){
            System.out.println("I win this round");
            while (pile.peek() != null){
               playerTwo.add(pile.poll());
            }
         }
         if (tempOne.getVal() == tempTwo.getVal()){
            System.out.println("WAR!");
            while(tempOne.getVal() == tempTwo.getVal()){
               pile.add(tempOne);
               pile.add(tempTwo);
               if (playerOne.peek() != null){
                  tempOne = playerOne.poll();
               }
               else{
                  System.out.println("Player One Lost.");
                  System.exit(0);
               }
               if (playerTwo.peek() != null){
                  tempTwo = playerTwo.poll();
               }
               else{
                  System.out.println("You have won");
                  System.exit(0);
               }
            
            }
            if (tempOne.getVal() > tempTwo.getVal()){
               System.out.println("You won this battle");
               while (pile.peek() != null){
                  playerOne.add(pile.poll());
               }
            }
            if (tempTwo.getVal() > tempOne.getVal()){
               System.out.println("I win this battle");
               while (pile.peek() != null){
                  playerTwo.add(pile.poll());
               }
            
            }
         }
         input = keyboard.nextLine();
      }
      
      if (playerOne.peek() == null){
         System.out.println("you have lost");
      }
      if (playerTwo.peek() == null){
         System.out.println("You won");
      }

   }
   else{
      System.out.println("Goodbye then.");
   }
   
   
   }
}