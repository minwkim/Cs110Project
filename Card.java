public class Card{
   int value = 0;
   int face = 0;
   
   public Card(){}
   
   public Card(int face, int value){
      this.face = face;
      this.value = value;
   }
   public void setCard(int face, int value){
      this.face = face;
      this.value = value;
   }
   public int getVal(){
      return this.value;
      
   }
   public int getFace(){
      return this.face;

   }
   
   
   
}