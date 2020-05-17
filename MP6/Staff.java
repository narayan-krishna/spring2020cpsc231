/** Staff.java
*
* This is an Staff class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 6:Inheritance, Interfaces, & Abstract Classes
* @version 1.0
*/


public abstract class Staff extends Affiliate implements Printable{

  /**Staff ID*/
  private int staffID;
  /**Title of staff*/
  private String title;
  /**Name of building*/
  private String building;

  /**Default constructor*/
  public Staff(){
    super();
    this.staffID = -1;
    this.title = "X";
    this.building = "X";
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
  */
  public Staff(String name, int age, String address, int phoneNumber, int yearToChapman, int staffID, String title, String building){
    super(name, age, address, phoneNumber, yearToChapman);
    this.staffID = staffID;
    this.title = title;
    this.building = building;
  }

  /**Returns id of staff
  * @return An int representing staff id
  */
  public int getID(){
    return staffID;
  }

  /**Sets staff ID to number given
  * @param staffID staff ID number
  */
  public void setStaffID(int staffID){
    this.staffID = staffID;
  }

  /**Returns title
  * @return A string representing staff title
  */
  public String getTitle(){
    return title;
  }

  /**Sets title to string given
  * @param title Staff title
  */
  public void setTitle(String title){
    this.title = title;
  }

  /**Returns building
  * @return A string representing building name
  */
  public String getBuilding(){
    return building;
  }

  /**Sets building to string given
  * @param building Staff building
  */
  public void setBuilding(String building){
    this.building = building;
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
    return super.print() + ", " + staffID + ", " + title
    + ", " + building;
  }
}
