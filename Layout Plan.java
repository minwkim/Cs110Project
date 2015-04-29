/*Game of War*/

/*Object of 52 cards
   an array of [0~11][0~3]
   first value indicates between Ace to King
   second value 0 = spades
   1 = clover
   2 = heart
   3 = diamond
*/

/*Want to play a game?
yes = play game
no = exit
*/

/*Stacks and Queues
shuffle
Split the deck into two queues
Create two queues for the player decks
create another queue for cards in battle battleQueue
*/

/*Game
while (!queue1.empty || !queue2.empty)
method of comparing
   queue1.pop (>,<, ==) queue2.pop

pop top of the queue
put them in battleQueue

if the values are ==
   pop the next three into battleQueue
   then pop the 4th
   if equal 
      repeat
   else
      all cards in battleQueue
      goes into the winning queue
if !queue1.empty
   queue1 wins
if !queue2.empty
   queue2 wins
*/