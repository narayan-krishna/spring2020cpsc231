/** Undead.java
*
* This is an Undead class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Inheritance and Polymorphism Programming Practice
* @version 1.0
*/

public class Undead extends Monster{
  private int yearHeartStopped;

  public Undead(){
    super();
  }

  public undead(String name, String origin, int year){
    super(name, origin);
    yearHeartStopped = year;
  }

  //@override
  public void speak(){
    System.out.println("agghh");
  }

  //@override
  public void diet(){
    System.out.println("hggh teeth");
  }

  public void setYearHeartStopped(int year){
    yearHeartStopped = year;
  }

  public int getYearHeartStopped(){
    return yearHeartStopped;
  }
}
