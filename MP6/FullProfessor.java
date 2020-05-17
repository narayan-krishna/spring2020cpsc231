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

  /**Years until retirement*/
  private int yearsUntilRetirement;

  /**Default constructor*/
  public FullProfessor(){
    super();
    this.yearsUntilRetirement = -1;
  }

  /**Overloaded constructor
  * @param name Name of affiliate
  * @param age Age of affiliate
  * @param address Address of affiliate
  * @param phoneNumber Phone number of affiliate
  * @param yearToChapman Year affiliate came to Chapman
  * @param facultyID ID of faculty
  * @param department Department of faculty
  * @param yearlySalary Salary per year
  * @param numPapers Number of papers
  * @param yearsUntilRetirement Years until tenure
  */
  public FullProfessor(String name, int age, String address, int phoneNumber, int yearToChapman, int facultyID, String department, int yearlySalary, int numPapers, int yearsUntilRetirement){
    super(name, age, address, phoneNumber, yearToChapman, facultyID, department, yearlySalary, numPapers);
    this.yearsUntilRetirement = yearsUntilRetirement;
  }

  /**Returns years until retirement
  * @return An int representing years until retirement
  */
  public int getYearsUntilRetirement(){
    return yearsUntilRetirement;
  }

  /**Sets the years until retirement to number given
  * @param yearsUntilRetirement Years until retirement
  */
  public void setYearsUntilRetirment(int yearsUntilRetirement){
    this.yearsUntilRetirement = yearsUntilRetirement;
  }

  /**Returns class type
  * @return a string representing class type
  */
  public String getClassType(){
    return "Full professor";
  }

  /**Returns a string printing all relevant data
  * @return A string representing all relevant data
  */
  public String print(){
    return super.print() + ", " + yearsUntilRetirement;
  }
}
