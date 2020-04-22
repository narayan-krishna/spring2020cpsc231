import java.util.LinkedList;
import java.util.Random;


public class Deck{

  private LinkedList<Card> deck;

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

  public Card deal(){
    Random rand = new Random();
    int randIndex = rand.nextInt(deck.size());
    Card temp = deck.get(randIndex);
    deck.remove(randIndex);
    return temp;
  }

  public Card getCard(int index){
    return deck.get(index);
  }

  public int getSize(){
      return deck.size();
  }

  public void printDeck(){
    for(Card card : deck){
      System.out.print(card + " ");
    }
    System.out.println();
  }
}
