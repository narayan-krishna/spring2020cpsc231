/** AssistantProfessor.java
*
* This is an AssistantProfessor class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 6:Inheritance, Interfaces, & Abstract Classes
* @version 1.0
*/

public class AssistantProfessor extends Faculty implements Printable{

  /**Years until tenure*/
  private int yearsUntilTenure;

  /**Default constructor*/
  public AssistantProfessor(){
    super();
    this.yearsUntilTenure = -1;
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
  * @param yearsUntilTenure Years until tenure
  */
  public AssistantProfessor(String name, int age, String address, int phoneNumber, int yearToChapman, int facultyID, String department, int yearlySalary, int numPapers, int yearsUntilTenure){
    super(name, age, address, phoneNumber, yearToChapman, facultyID, department, yearlySalary, numPapers);
    this.yearsUntilTenure = yearsUntilTenure;
  }

  /**Returns years until tenure
  * @return An int representing years until tenure
  */
  public int getYearsUntilTenure(){
    return yearsUntilTenure;
  }

  /**Sets the years until tenure to number given
  * @param yearsUntilTenure Years until tenure
  */
  public void setYearsUntilTenure(int yearsUntilTenure){
    this.yearsUntilTenure = yearsUntilTenure;
  }

  /**Returns class type
  * @return a string representing class type
  */
  public String getClassType(){
    return "Assistant professor";
  }

  /**Returns a string printing all relevant data
  * @return A string representing all relevant data
  */
  public String print(){
    return super.print() + ", " + yearsUntilTenure;
  }
}
