import java.util.ArrayList;


public class Game{
  private Player p1;
  private Player p2;

  private int battleCount;
  private int warCount;
  private int doubleWarCount;
  private int gameNum;

  public Game(int gameNum){
    this.gameNum = gameNum;
    Deck deck = new Deck();
    p1 = new Player("1", deck);
    p2 = new Player("2", deck);
    battleCount = 0;
    warCount = 0;
    doubleWarCount = 0;
    // p1.printCards();
    // p2.printCards();
  }

  public int getBattleCount(){
    return battleCount;
  }

  public int getWarCount(){
    return warCount;
  }

  public int getDoubleWarCount(){
    return doubleWarCount;
  }

  public int getGameNum(){
    return gameNum;
  }

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

  public void war(Card[]p1Draw, Card[]p2Draw){
    // System.out.println("p1: " + p1.getSize() + ", p2: " + p2.getSize());
    warCount += 1;
    if(p1.getSize() > 0 && p2.getSize() > 0){
      Card p1WarCard = new Card();
      Card p2WarCard = new Card();
      // p1.printCards();
      // p2.printCards();
      p1WarCard = p1.war();
      p2WarCard = p2.war();
      // System.out.println("war");
      // System.out.println(p1WarCard + " vs " + p2WarCard + " war function");
      // System.out.println(p1 + " vs " + p2);
      ArrayList<Card> warCards = new ArrayList<Card>();
      warCards.add(p1WarCard);
      warCards.add(p2WarCard);
      while(p1WarCard.getWorth() == p2WarCard.getWorth() && p1.getSize() > 0 && p2.getSize() > 0){
        // System.out.println("DOUBLE WARRRRR-------------------");
        // System.out.println(p1 + " vs " + p2);
        warCount += 1;
        doubleWarCount += 1;
        p1WarCard = p1.war();
        p2WarCard = p2.war();
        // System.out.println(p1WarCard + " vs " + p2WarCard);
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
      // System.out.println("can't war, p1 win");
      p1.collect(p1Draw);
      p1.collect(p2Draw);
    }else if (p2.getSize() == 0){
      // System.out.println("can't war, p1 win");
      p2.collect(p1Draw);
      p2.collect(p2Draw);
    }
  }

  public void play(){
    while(p1.hasWon() != true && p2.hasWon() != true){
      // System.out.println(p1 + " vs " + p2);
      battleCount += 1;
      // System.out.print(".");
      WarLogger.getInstance().logBattle(battleCount, "p1", p1.getHandArray());
      WarLogger.getInstance().logBattle(battleCount, "p2", p2.getHandArray());
      Card []p1Draw = p1.flip();
      Card []p2Draw = p2.flip();
      int p1CompareCardWorth = getCompareCard(p1Draw).getWorth();
      int p2CompareCardWorth = getCompareCard(p2Draw).getWorth();
      // System.out.println(getCompareCard(p1Draw) + " vs " + getCompareCard(p2Draw) + " play function");
      if(p1CompareCardWorth > p2CompareCardWorth){
        // System.out.println("collection, p1");
        WarLogger.getInstance().logBattleOutcome(battleCount, "p1");
        p1.collect(p1Draw);
        p1.collect(p2Draw);
      }else if(p1CompareCardWorth < p2CompareCardWorth){
        // System.out.println("collection, p2");
        WarLogger.getInstance().logBattleOutcome(battleCount, "p2");
        p2.collect(p1Draw);
        p2.collect(p2Draw);
      }else{
        // System.out.println(getCompareCard(p1Draw) + " vs " + getCompareCard(p2Draw) + " play function");
        war(p1Draw, p2Draw);
      }
    }
    if(p1.hasWon()){
      WarLogger.getInstance().logGameOutcome(gameNum, "p1");
    }else{
      WarLogger.getInstance().logGameOutcome(gameNum, "p2");
    }
    // System.out.println(p1 + " vs " + p2);
    // System.out.println(p1.hasWon());
    // System.out.println(p2.hasWon());
  }

  // public static void main(String[]args){
  //   for(int i = 0; i < 11; ++i){
  //     Game g = new Game(i);
  //     System.out.println();
  //     g.play();
  //     System.out.println(g.getBattleCount());
  //     System.out.println(g.getWarCount());
  //     System.out.println(g.getDoubleWarCount());
  //     System.out.println();
  //   }
  //
  //   // Game g = new Game();
  //   // g.play();
  //   // System.out.println(g.getBattleCount());
  //   // System.out.println(g.getWarCount());
  //   // System.out.println(g.getDoubleWarCount());
  //   // System.out.println();
  //   // Card []p1Original = g.getPlayer1().flip();
  //   // for(Card card : p1Original){
  //   //   System.out.println(card.getSuit() + " " + card.getValue());
  //   // }
  //   // System.out.println();
  //   // Card []p1Draw = {p1Original[1]};
  //   // for(Card card : p1Draw){
  //   //   System.out.println(card.getSuit() + " " + card.getValue());
  //   // }
  //   // System.out.println();
  //   // System.out.println((getCompareCard(p1Draw).getSuit()) + " " + (getCompareCard(p1Draw).getValue()));
  //
  // }

}
