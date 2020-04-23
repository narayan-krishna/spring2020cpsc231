/** Deck.java
*
* This is a Deck class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 5: Modern War(fare)
* @version 1.0
*/

import java.util.LinkedList;
import java.util.Random;

public class Deck{

  /**A list of cards in the deck*/
  private LinkedList<Card> deck;

  /**Default constructor - sets deck to a new linked list, fills list with
  * every combination of suit and value
	*/
  public Deck(){
    deck = new LinkedList<Card>();
    String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    String[] suits = {"H", "S", "C", "D"};
    for(String value : values){
      for(String suit : suits){
        deck.add(new Card(value, suit));
      }
    }
  }

  /**Returns a card dealt from the deck
  * @return A card object representing a card dealt from the deck
  */
  public Card deal(){
    Random rand = new Random();
    int randIndex = rand.nextInt(deck.size());
    Card temp = deck.get(randIndex);
    deck.remove(randIndex);
    return temp;
  }

  /**Returns a card from the deck given a certain index
  * @param index Index at which the card should be pulled from deck
  * @return A card object representing the card pulled from the deck at
  * specified index
  */
  public Card getCard(int index){
    return deck.get(index);
  }

  /**Returns the size of the deck
  * @return An int representing the size of the deck
  */
  public int getSize(){
      return deck.size();
  }

  /**Prints the cards in the deck*/
  public void printDeck(){
    for(Card card : deck){
      System.out.print(card + " ");
    }
    System.out.println();
  }
}
