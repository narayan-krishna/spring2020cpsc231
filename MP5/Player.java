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
    // Random rand = new Random();
    // int randIndex = rand.nextInt(collection.length + 1);
    for(Card card : collection){
      // randIndex = rand.nextInt(collection.length - 1);
      ownedCards.add(card);
    }
  }

  public void collect(ArrayList<Card> collection){
    // Random rand = new Random();
    // int randIndex = rand.nextInt(collection.size());
    // for(int i = 0; i < collection.size(); ++i){
    //   ownedCards.add(ownedCards.size(), collection.get(randIndex));
    // }
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

  // public static void main(String[]args){
  //   // Deck d1 = new Deck();
  //   // Player p1 = new Player(1, d1);
  //   // for(int i = 0; i < p1.getSize(); ++i){
  //   //   System.out.println((p1.getCard(i)).getSuit() + " " + (p1.getCard(i)).getValue());
  //   // }
  //   //
  //   // System.out.println();
  //   // System.out.println(p1.getSize());
  //   // System.out.println();
  //   //
  //   // Card[] flipped = p1.flip();
  //   // for (Card card : flipped){
  //   //   System.out.println(card.getSuit() + " " + card.getValue());
  //   // }
  //   // System.out.println();
  //   // for(int i = 0; i < p1.getSize(); ++i){
  //   //   System.out.println((p1.getCard(i)).getSuit() + " " + (p1.getCard(i)).getValue());
  //   // }
  //   //
  //   // System.out.println();
  //   // System.out.println(p1.getSize());
  //   // System.out.println();
  //   //
  //   // Card [] collection = {d1.deal(), d1.deal(), d1.deal()};
  //   // p1.collect(collection);
  //   //
  //   // for(int i = 0; i < p1.getSize(); ++i){
  //   //   System.out.println((p1.getCard(i)).getSuit() + " " + (p1.getCard(i)).getValue());
  //   // }
  //   //
  //   // System.out.println();
  //   // System.out.println(p1.getSize());
  //   // System.out.println(p1.hasWon());
  //   // System.out.println();
  //
  //   Deck d1 = new Deck();
  //   Player p1 = new Player("1", d1);
  //   p1.printCards();
  //   Card [] flipped = p1.flip();
  //   p1.printCards();
  //   p1.collect(flipped);
  //   for(Card card : p1.getHandArray()){
  //     System.out.print(card);
  //   }
  // }

}
