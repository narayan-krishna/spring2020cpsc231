
public class Simulation{
  public static void main(String[]args){
    for(int i = 0; i < 11; ++i){
      Game g = new Game();
      System.out.println();
      g.play();
      System.out.println(g.getBattleCount());
      System.out.println(g.getWarCount());
      System.out.println(g.getDoubleWarCount());
      System.out.println();
    }
  }
}
