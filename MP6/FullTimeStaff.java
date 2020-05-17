/** FullTimeStaff.java
*
* This is an FullTimeStaff class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 6:Inheritance, Interfaces, & Abstract Classes
* @version 1.0
*/

public class FullTimeStaff extends Staff{

  /**Yearly salary*/
  private int yearlySalary;

  /**Default constructor*/
  public FullTimeStaff(){
    super();
    this.yearlySalary = -1;
  }

  /**Overloaded constructor
  * @param name Name of affiliate
  * @param age Age of affiliate
  * @param address Address of affiliate
  * @param phoneNumber Phone number of affiliate
  * @param yearToChapman Year affiliate came to Chapman
  * @param staffID ID of staff
  * @param title Title of staff
  * @param building Name of building
  * @param yearlySalary Yearly salary
  */
  public FullTimeStaff(String name, int age, String address, int phoneNumber, int yearToChapman, int staffID, String title, String building, int yearlySalary){
    super(name, age, address, phoneNumber, yearToChapman, staffID, title, building);
    this.yearlySalary = yearlySalary;
  }

  /**Returns yearly salary
  * @return An int representing yearly salary
  */
  public int getYearlySalary(){
    return yearlySalary;
  }

  /**Sets the yearly salary to number given
  * @param yearlySalary Yearly salary
  */
  public void setYearlySalary(int yearlySalary){
    this.yearlySalary = yearlySalary;
  }

  /**Returns class type
  * @return a string representing class type
  */
  public String getClassType(){
    return "Full time staff";
  }

  /**Returns a string printing all relevant data
  * @return A string representing all relevant data
  */
  public String print(){
    return super.print() + ", " + yearlySalary;
  }
}
