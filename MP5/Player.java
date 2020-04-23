/** Player.java
*
* This is a Player class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 5: Modern War(fare)
* @version 1.0
*/

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Random;

public class Player{

  /**The hand of cards owned by the player*/
  private LinkedList<Card> ownedCards;
  /**The player's tag*/
  private String tag;

  /**The default constructor - sets tag to given tag, pulls 26 cards from given
  * deck object in the players owned cards
  * @param tag Player tag
  * @param d Deck from which the player will draw
  * cards
	*/
  public Player(String tag, Deck d){
    this.tag = tag;
    ownedCards = new LinkedList<Card>();
    for(int i = 0; i < 26; ++i){
      ownedCards.add(d.deal());
    }
  }

  /**Returns the size of the player's hand
  * @return An int representing the size of player's hand
  */
  public int getSize(){
      return ownedCards.size();
  }

  /**Returns the player's tag
  * @return An String representing the player's tag
  */
  public String getTag(){
    return tag;
  }

  /**Returns a card from the players hand given an index
  * @param index Index within hand where card should be pulled
  * @return A card object represenitng a card from the players hand
  */
  public Card getCard(int index){
    return ownedCards.get(index);
  }

  /**Returns the players hand as an array rather than a linked list
  * @return A card array representing the players hand
  */
  public Card[] getHandArray(){
    Card [] hand = new Card[ownedCards.size()];
    for(int i = 0; i < ownedCards.size(); ++i){
      hand[i] = ownedCards.get(i);
    }
    return hand;
  }

  /**Returns the cards flipped by a player
  * @return A card array representing the cards flipped by the player
  */
  public Card[] flip(){
    Card[] flipped = {};
    if(ownedCards.size() == 0){
      System.out.println("no cards to flip!");
    }else{
      int flipSize = 0;
      if(ownedCards.size() > 2){
        flipSize = 3;
      }else if(ownedCards.size() == 2){
        flipSize = 2;
      }else{
        flipSize = 1;
      }
      flipped = new Card[flipSize];
      for(int i = 0; i < flipSize; ++i){
        flipped[i] = ownedCards.remove(0);
      }
    }
    return flipped;
  }

  /**Adds a collection of cards as an array list to the players hand
  * @param collection A collection of cards
  */
  public void collect(Card[] collection){
    for(Card card : collection){
      ownedCards.add(card);
    }
  }

  /**Adds a collection of cards as an array list to the players hand
  * @param collection A collection of cards
  */
  public void collect(ArrayList<Card> collection){
    for(Card card : collection){
      ownedCards.add(card);
    }
  }

  /**Returns true or false depending on if the player has won
  * @return A boolean representing whether the player has won the game
  */
  public boolean hasWon(){
    if(ownedCards.size() == 52){
      return true;
    }else{
      return false;
    }
  }

  /**Returns a card pulled by the player in the case of war
  * @return A card object representing the card removed by the player to
  * participate in a tie
  */
  public Card war(){
    return ownedCards.remove(0);
  }

  /**Prints all of the players cards to system*/
  public void printCards(){
    for(Card card : ownedCards){
      System.out.print(card + " ");
    }
    System.out.println();
  }
}
