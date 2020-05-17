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
  */
  public AssistantProfessor(String name, int age, String address, int phoneNumber, int yearToChapman, int facultyID, String department, int yearlySalary, int numPapers, int yearsUntilTenure){
    super(name, age, address, phoneNumber, yearToChapman, facultyID, department, yearlySalary, numPapers);
    this.yearsUntilTenure = yearsUntilTenure;
  }

  public int getYearsUntilTenure(){
    return yearsUntilTenure;
  }

  public void setYearsUntilTenure(int yearsUntilTenure){
    this.yearsUntilTenure = yearsUntilTenure;
  }

  public String getClassType(){
    return "Assistant professor";
  }

  public String print(){
    return super.print() + ", " + yearsUntilTenure;
  }
}
