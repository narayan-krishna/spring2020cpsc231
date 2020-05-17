/** FullProfessor.java
*
* This is an FullProfessor class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 6:Inheritance, Interfaces, & Abstract Classes
* @version 1.0
*/

public class FullProfessor extends Faculty implements Printable{
  private int yearsUntilRetirement;

  public FullProfessor(){
    super();
    this.yearsUntilRetirement = -1;
  }

  public FullProfessor(String name, int age, String address, int phoneNumber, int yearToChapman, int facultyID, String department, int yearlySalary, int numPapers, int yearsUntilRetirement){
    super(name, age, address, phoneNumber, yearToChapman, facultyID, department, yearlySalary, numPapers);
    this.yearsUntilRetirement = yearsUntilRetirement;
  }

  public int getYearsUntilRetirement(){
    return yearsUntilRetirement;
  }

  public void setYearsUntilRetirment(int yearsUntilRetirement){
    this.yearsUntilRetirement = yearsUntilRetirement;
  }

  public String getClassType(){
    return "Full professor";
  }

  public String print(){
    return super.print() + ", " + yearsUntilRetirement;
  }
}
