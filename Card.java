public class Card{
   int value = 0;
   int face = 0;
   
   public Card(){}
   
   public Card(int value, int face){
      this.value = value;
      this.face = face;
   }
   public void setCard(int value, int face){
      this.value = value;
      this.face = face;
   }
   public int getVal(){
      return this.value;
      
   }
   public int getFace(){
      return this.face;

   }
}