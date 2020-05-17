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

  /**Years since tenure*/
  private int yearsSinceTenure;

  /**Default constructor*/
  public AssociateProfessor(){
    super();
    this.yearsSinceTenure = -1;
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
  * @param yearsSinceTenure Years since tenure
  */
  public AssociateProfessor(String name, int age, String address, int phoneNumber, int yearToChapman, int facultyID, String department, int yearlySalary, int numPapers, int yearsSinceTenure){
    super(name, age, address, phoneNumber, yearToChapman, facultyID, department, yearlySalary, numPapers);
    this.yearsSinceTenure = yearsSinceTenure;
  }

  /**Returns years since tenure
  * @return An int representing years since tenure
  */
  public int getYearsSinceTenure(){
    return yearsSinceTenure;
  }

  /**Sets the years since tenure to number given
  * @param yearsSinceTenure Years since tenure
  */
  public void setYearsSinceTenure(int yearsSinceTenure){
    this.yearsSinceTenure = yearsSinceTenure;
  }

  /**Returns class type
  * @return a string representing class type
  */
  public String getClassType(){
    return "Associate professor";
  }

  /**Returns a string printing all relevant data
  * @return A string representing all relevant data
  */
  public String print(){
    return super.print() + ", " + yearsSinceTenure;
  }
}
