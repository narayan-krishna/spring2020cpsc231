/** AssociateProfessor.java
*
* This is an AssociateProfessor class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 6:Inheritance, Interfaces, & Abstract Classes
* @version 1.0
*/

public class AssociateProfessor extends Faculty implements Printable{
  private int yearsSinceTenure;

  public AssociateProfessor(){
    super();
    this.yearsSinceTenure = -1;
  }

  public AssociateProfessor(String name, int age, String address, int phoneNumber, int yearToChapman, int facultyID, String department, int yearlySalary, int numPapers, int yearsSinceTenure){
    super(name, age, address, phoneNumber, yearToChapman, facultyID, department, yearlySalary, numPapers);
    this.yearsSinceTenure = yearsSinceTenure;
  }

  public int getYearsSinceTenure(){
    return yearsSinceTenure;
  }

  public void setYearsSinceTenure(int yearsSinceTenure){
    this.yearsSinceTenure = yearsSinceTenure;
  }


  public String getClassType(){
    return "Associate professor";
  }

  public String print(){
    return super.print() + ", " + yearsSinceTenure;
  }
}
