import java.util.*;

public class TestMe{
   public static void main(String [] args){
   
   Queue<String> myQueue = new LinkedList<String>();
   myQueue.add("Hiya");
   myQueue.add("Cya");
   System.out.println(myQueue.poll());
   
   }
}