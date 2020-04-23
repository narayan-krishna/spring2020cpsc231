/** Game.java
*
* This is a Game class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 5: Modern War(fare)
* @version 1.0
*/

import java.util.ArrayList;

public class Game{

  /**Player 1*/
  private Player p1;
  /**Player 2*/
  private Player p2;

  /**Number of battles*/
  private int battleCount;
  /**Number of wars*/
  private int warCount;
  /**Number of double wars*/
  private int doubleWarCount;
  /**Number of games*/
  private int gameNum;

  /**Default constructor - sets number of games to 1, creates a new deck,
  * creates two players who take cards from deck. Sets battle/war/doublewar
  * count to 0
	*/
  public Game(){
    gameNum = 1;
    Deck deck = new Deck();
    p1 = new Player("1", deck);
    p2 = new Player("2", deck);
    battleCount = 0;
    warCount = 0;
    doubleWarCount = 0;
  }

  /**Overloaded constructor - sets number of games to given, creates a new deck,
  * creates two players who take cards from deck. Sets battle/war/doublewar
  * count to 0
  * @param gameNum Number of games
	*/
  public Game(int gameNum){
    this.gameNum = gameNum;
    Deck deck = new Deck();
    p1 = new Player("1", deck);
    p2 = new Player("2", deck);
    battleCount = 0;
    warCount = 0;
    doubleWarCount = 0;
  }

  /**Returns battle count
  * @return An int representing battle count
  */
  public int getBattleCount(){
    return battleCount;
  }

  /**Returns war count
  * @return An int representing war count
  */
  public int getWarCount(){
    return warCount;
  }

  /**Returns double count
  * @return An int representing double war count
  */
  public int getDoubleWarCount(){
    return doubleWarCount;
  }

  /**Returns game number
  * @return An int representing number of games to play
  */
  public int getGameNum(){
    return gameNum;
  }

  /**Returns the approriate card from a draw depending on the amount of cards
  * @param draw An array of cards drawn
  * @return Card object representing card from the draw
  */
  public Card getCompareCard(Card[] draw){
    if(draw.length == 3){
      return draw[1];
    }else if(draw.length == 2){
      if(draw[0].getWorth() > draw[1].getWorth()){
        return draw[0];
      }else{
        return draw[1];
      }
    }else{
      return draw[0];
    }
  }

  /**Determines the winner of war when war does occur. Winner collects all
  * cards on the table. If a player goes to war but has no card to draw
  * for said war, that player loses
  * @param p1Draw an array of cards drawn by first player
  * @param p2Draw an array of cards drawn by second player
  */
  public void war(Card[]p1Draw, Card[]p2Draw){
    warCount += 1;
    if(p1.getSize() > 0 && p2.getSize() > 0){
      Card p1WarCard = new Card();
      Card p2WarCard = new Card();
      p1WarCard = p1.war();
      p2WarCard = p2.war();
      ArrayList<Card> warCards = new ArrayList<Card>();
      warCards.add(p1WarCard);
      warCards.add(p2WarCard);
      while(p1WarCard.getWorth() == p2WarCard.getWorth() && p1.getSize() > 0 && p2.getSize() > 0){
        warCount += 1;
        doubleWarCount += 1;
        p1WarCard = p1.war();
        p2WarCard = p2.war();
        warCards.add(p1WarCard);
        warCards.add(p2WarCard);
      }
      if(p1WarCard.getWorth() > p2WarCard.getWorth()){
        WarLogger.getInstance().logWarOutcome(warCount, "p1");
        p1.collect(warCards);
        p1.collect(p1Draw);
        p1.collect(p2Draw);
      }else{
        WarLogger.getInstance().logWarOutcome(warCount, "p2");
        p2.collect(warCards);
        p2.collect(p1Draw);
        p2.collect(p2Draw);
      }
    }else if (p1.getSize() == 0){
      p1.collect(p1Draw);
      p1.collect(p2Draw);
    }else if (p2.getSize() == 0){
      p2.collect(p1Draw);
      p2.collect(p2Draw);
    }
  }


  /**Plays the game of war with two players. Each player draws, and from
  * the draw the card to "battle" is selected. Whoever has a card worth more
  * collects all cards on the table. If their is a tie, they players go to
  * war
  */
  public void play(){
    while(p1.hasWon() != true && p2.hasWon() != true){
      battleCount += 1;
      WarLogger.getInstance().logBattle(battleCount, "p1", p1.getHandArray());
      WarLogger.getInstance().logBattle(battleCount, "p2", p2.getHandArray());
      Card []p1Draw = p1.flip();
      Card []p2Draw = p2.flip();
      int p1CompareCardWorth = getCompareCard(p1Draw).getWorth();
      int p2CompareCardWorth = getCompareCard(p2Draw).getWorth();
      if(p1CompareCardWorth > p2CompareCardWorth){
        WarLogger.getInstance().logBattleOutcome(battleCount, "p1");
        p1.collect(p1Draw);
        p1.collect(p2Draw);
      }else if(p1CompareCardWorth < p2CompareCardWorth){
        WarLogger.getInstance().logBattleOutcome(battleCount, "p2");
        p2.collect(p1Draw);
        p2.collect(p2Draw);
      }else{
        war(p1Draw, p2Draw);
      }
    }
    if(p1.hasWon()){
      WarLogger.getInstance().logGameOutcome(gameNum, "p1");
    }else{
      WarLogger.getInstance().logGameOutcome(gameNum, "p2");
    }
  }
}
