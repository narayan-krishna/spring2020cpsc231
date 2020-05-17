/** PartTimeStaff.java
*
* This is an PartTimeStaff class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 6:Inheritance, Interfaces, & Abstract Classes
* @version 1.0
*/

public class PartTimeStaff extends Staff implements Printable{

  private int hourlySalary;

  /**Default constructor*/
  public PartTimeStaff(){
    super();
    this.hourlySalary = -1;
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
  * @param hourlySalary hourlySalary
  */
  public PartTimeStaff(String name, int age, String address, int phoneNumber, int yearToChapman, int staffID, String title, String building, int hourlySalary){
    super(name, age, address, phoneNumber, yearToChapman, staffID, title, building);
    this.hourlySalary = hourlySalary;
  }

  /**Returns hourly salary
  * @return An int representing hourly salary
  */
  public int getHourlySalary(){
    return hourlySalary;
  }

  /**Sets the hourly salary to number given
  * @param hourlySalary Hourly salary
  */
  public void setHourlySalaray(int hourlySalary){
    this.hourlySalary = hourlySalary;
  }

  /**Returns class type
  * @return a string representing class type
  */
  public String getClassType(){
    return "Part time staff";
  }

  /**Returns a string printing all relevant data
  * @return A string representing all relevant data
  */
  public String print(){
    return super.print() + ", " + hourlySalary;
  }
}
