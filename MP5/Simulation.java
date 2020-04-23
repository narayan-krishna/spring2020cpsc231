/** Simulation.java
*
* This is a Simulation class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 5: Modern War(fare)
* @version 1.0
*/

public class Simulation{

  /**Number of games to simulate*/
  private int numGames;

  /**Total number of battles*/
  private Double totalBattles;
  /**Total number of wars*/
  private Double totalWars;
  /**Total number of double wars*/
  private Double totalDoubleWars;

  /**Average amonut of battles per game*/
  private Double avgBattles;
  /**Average amount of wars per game*/
  private Double avgWars;
  /**Average amount of double wars per game*/
  private Double avgDoubleWars;

  /**Max number of battles*/
  private int maxNumBattles;
  /**Min  numver of battles*/
  private int minNumBattles;
  /**Max number of wars*/
  private int maxNumWars;
  /**Min number of wars*/
  private int minNumWars;

  /**The default constructor - sets amount of games to simulate to 1,
  * sets total battles/wars/double wars to 0, max wars/battles to 0 and
  * min wars/battles to -1.
	*/
  public Simulation(){
    numGames = 1;
    totalBattles = 0.0;
    totalWars = 0.0;
    totalDoubleWars = 0.0;
    maxNumBattles = 0;
    minNumBattles = -1;
    maxNumWars = 0;
    minNumWars = -1;
  }

  /**The overloaded constructor - sets amount of games to simulate to parameter
  * input, sets total battles/wars/double wars to 0, max wars/battles to 0 and
  * min wars/battles to -1.
  * @param numGames Number of games to simulate
	*/
  public Simulation(int numGames){
    this.numGames = numGames;
    totalBattles = 0.0;
    totalWars = 0.0;
    totalDoubleWars = 0.0;
    maxNumBattles = 0;
    minNumBattles = -1;
    maxNumWars = 0;
    minNumWars = -1;
  }

  /**Calculates the average battles, wars, and double wars by dividing
  * total number of battles/wars/double wars over number of games
  */
  public void calculate(){
    avgBattles = totalBattles/numGames;
    avgWars = totalWars/numGames;
    avgDoubleWars = totalDoubleWars/numGames;
  }

  /**Nicely formats statistics and prints to system*/
  public void report(){
    System.out.println();
    System.out.println(numGames + " games" + "\n");
    System.out.println("Average battles: " + avgBattles);
    System.out.println("Average wars: " + avgWars);
    System.out.println("Average double wars: " + avgDoubleWars + "\n");
    System.out.println("Max number of battles: " + maxNumBattles);
    System.out.println("Min number of battles: " + minNumBattles + "\n");
    System.out.println("Max number of wars: " + maxNumWars);
    System.out.println("Min number of wars: " + minNumWars + "\n");
  }

  /**Simulates desired amount of games, updating statistics and current
  *max/min amount of wars and double wars
  */
  public void simulate(){
    for(int i = 0; i < numGames; ++i){
      Game g = new Game(i + 1);
      g.play();
      totalBattles += g.getBattleCount();
      totalWars += g.getWarCount();
      totalDoubleWars += g.getDoubleWarCount();
      if(g.getBattleCount() > maxNumBattles){
        maxNumBattles = g.getBattleCount();
      }
      if(g.getBattleCount() < minNumBattles || minNumBattles == -1){
        minNumBattles = g.getBattleCount();
      }
      if(g.getWarCount() > maxNumWars){
        maxNumWars = g.getWarCount();
      }
      if(g.getWarCount() < minNumWars || minNumWars == -1){
        minNumWars = g.getWarCount();
      }
    }
  }

  /**The main method. Exercises the functionality of the Pizza and
  * the Simulation class. Games are simulated, statistics are calculated and
  * reported. War logger is released
  * @param args Number of games to be played
  */
  public static void main(String[]args){
    try{
      Simulation s = new Simulation(Integer.parseInt(args[0]));
      s.simulate();
      s.calculate();
      s.report();
      WarLogger.getInstance().release();
    }catch(Exception e){
      System.out.print("Please input a valid number of games into the command line!");
      System.out.println(" i.e. java Simulation 2");
    }
  }
}
