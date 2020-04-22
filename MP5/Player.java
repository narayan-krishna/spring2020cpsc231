import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Random;


public class Player{

  private LinkedList<Card> ownedCards;
  private String tag;

  public Player(String tag, Deck d){
    this.tag = tag;
    ownedCards = new LinkedList<Card>();
    for(int i = 0; i < 26; ++i){
      ownedCards.add(d.deal());
    }
  }

  public int getSize(){
      return ownedCards.size();
  }

  public String getTag(){
    return tag;
  }

  public Card getCard(int index){
    return ownedCards.get(index);
  }

  public Card[] getHandArray(){
    Card [] hand = new Card[ownedCards.size()];
    for(int i = 0; i < ownedCards.size(); ++i){
      hand[i] = ownedCards.get(i);
    }
    return hand;
  }

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

  public void collect(Card[] collection){
    for(Card card : collection){
      ownedCards.add(card);
    }
  }

  public void collect(ArrayList<Card> collection){
    for(Card card : collection){
      ownedCards.add(card);
    }
  }

  public boolean hasWon(){
    if(ownedCards.size() == 52){
      return true;
    }else{
      return false;
    }
  }

  public Card war(){
    return ownedCards.remove(0);
  }

  public String toString(){
    return ownedCards.size() + "";
  }

  public void printCards(){
    for(Card card : ownedCards){
      System.out.print(card + " ");
    }
    System.out.println();
  }
}
