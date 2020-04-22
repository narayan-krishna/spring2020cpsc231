
public class Simulation{

  private int numGames;

  private Double totalBattles;
  private Double totalWars;
  private Double totalDoubleWars;

  private Double avgBattles;
  private Double avgWars;
  private Double avgDoubleWars;

  private int maxNumBattles;
  private int minNumBattles;
  private int maxNumWars;
  private int minNumWars;

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

  public void calculate(){
    avgBattles = totalBattles/numGames;
    avgWars = totalWars/numGames;
    avgDoubleWars = totalDoubleWars/numGames;
  }

  public void report(){
    System.out.println(numGames + " games");
    System.out.println("Average battles: " + avgBattles);
    System.out.println("Average wars: " + avgWars);
    System.out.println("Average double wars: " + avgDoubleWars);
    System.out.println("Max number of battles: " + maxNumBattles);
    System.out.println("Min number of battles: " + minNumBattles);
    System.out.println("Max number of wars: " + maxNumWars);
    System.out.println("Min number of wars: " + minNumWars);
  }

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

  public static void main(String[]args){
    Simulation s = new Simulation(Integer.parseInt(args[0]));
    s.simulate();
    s.calculate();
    s.report();
    WarLogger.getInstance().release();
  }
}
