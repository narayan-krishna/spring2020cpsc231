/** GraduateStudent.java
*
* This is an GraduateStudent class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 6:Inheritance, Interfaces, & Abstract Classes
* @version 1.0
*/

public class GraduateStudent extends Student implements Printable{

  /**Number of papers published*/
  private int papersPublished;
  /**Thesis advisor*/
  private String thesisAdvisor;

  /**Default constructor*/
  public GraduateStudent(){
    super();
    this.papersPublished = -1;
    this.thesisAdvisor = "X";
  }

  /**Overloaded constructor
  * @param name Name of affiliate
  * @param age Age of affiliate
  * @param address Address of affiliate
  * @param phoneNumber Phone number of affiliate
  * @param yearToChapman Year affiliate came to Chapman
  * @param studentID ID of student
  * @param major Student major
  * @param minor Student minor
  * @param classStanding Students class standing
  * @param papersPublished Papers published
  * @param thesisAdvisor Thesis advisor
  */
  public GraduateStudent(String name, int age, String address, int phoneNumber, int yearToChapman, int studentID, String major, String minor, int classStanding, int papersPublished, String thesisAdvisor){
    super(name, age, address, phoneNumber, yearToChapman, studentID, major, minor, classStanding);
    this.papersPublished = papersPublished;
    this.thesisAdvisor = thesisAdvisor;
  }

  /**Returns number of papers published
  * @return An int representing papers published
  */
  public int getPapersPublished(){
    return papersPublished;
  }

  /**Sets the papers published to number given
  * @param papersPublished Num papers published
  */
  public void setPapersPublished(int papersPublished){
    this.papersPublished = papersPublished;
  }

  /**Returns thesis advisor
  * @return A string representing thesis advisor
  */
  public String getThesisAdvisor(){
    return thesisAdvisor;
  }

  /**Sets the thesis advisor to string given
  * @param thesisAdvisor Thesis advisor
  */
  public void setThesisAdvisor(String thesisAdvisor){
    this.thesisAdvisor = thesisAdvisor;
  }

  /**Returns class type
  * @return a string representing class type
  */
  public String getClassType(){
    return "Grad student";
  }

  /**Returns a string printing all relevant data
  * @return A string representing all relevant data
  */
  public String print(){
    return super.print() + ", " + papersPublished
    + ", " + thesisAdvisor;
  }
}
