/** Faculty.java
*
* This is an Faculty class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 6:Inheritance, Interfaces, & Abstract Classes
* @version 1.0
*/

public abstract class Faculty extends Affiliate implements Printable{

  /**Faculty ID*/
  private int facultyID;
  /**Faculty department*/
  private String department;
  /**Yearly salary*/
  private int yearlySalary;
  /**Number of papers written*/
  private int numPapers;

  /**Default constructor*/
  public Faculty(){
    super();
    this.facultyID = -1;
    this.department = "X";
    this.yearlySalary = -1;
    this.numPapers = -1;
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
  */
  public Faculty(String name, int age, String address, int phoneNumber, int yearToChapman, int facultyID, String department, int yearlySalary, int numPapers){
    super(name, age, address, phoneNumber, yearToChapman);
    this.facultyID = facultyID;
    this.department = department;
    this.yearlySalary = yearlySalary;
    this.numPapers = numPapers;
  }

  /**Returns faculty ID
  * @return An int representing faculty ID
  */
  public int getID(){
    return facultyID;
  }

  /**Sets the faculty ID to int given
  * @param facultyID Faculty ID to set
  */
  public void setFacultyID(int facultyID){
    this.facultyID = facultyID;
  }

  /**Returns department
  * @return A string representing the department
  */
  public String getDepartment(){
    return department;
  }

  /**Sets the department name to string given
  * @param department Department to set
  */
  public void setDepartment(String department){
    this.department = department;
  }

  /**Returns yearly salary
  * @return An int representing yearly salary
  */
  public int getYearlySalary(){
    return yearlySalary;
  }

  /**Sets yearly salary to given
  * @param yearlySalary Yearly salary to set
  */
  public void setYearlySalary(int yearlySalary){
    this.yearlySalary = yearlySalary;
  }

  /**Returns number of papers published
  * @return An int representing number of papers
  */
  public int getNumPapers(){
    return numPapers;
  }

  /**Sets num papers to given int
  * @param numPapers number of papers
  */
  public void setNumPapers(int numPapers){
    this.numPapers = numPapers;
  }

  /**Returns class type
  * @return a string representing class type
  */
  public String getClassType(){
    return "-1";
  }

  /**Returns a string printing all relevant data
  * @return A string representing all relevant data
  */
  public String print(){
    return super.print() + ", " + facultyID + ", "
    + department + ", " + yearlySalary + ", " + numPapers;
  }
}
