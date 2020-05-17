/** Student.java
*
* This is a Student class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 6:Inheritance, Interfaces, & Abstract Classes
* @version 1.0
*/

public abstract class Student extends Affiliate implements Printable{

  private int studentID;
  private String major;
  private String minor;
  private int classStanding;

  /**Default constructor*/
  public Student(){
    super();
    this.studentID = -1;
    this.major = "X";
    this.minor = "X";
    this.classStanding = -1;
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
  */
  public Student(String name, int age, String address, int phoneNumber, int yearToChapman, int studentID, String major, String minor, int classStanding){
    super(name, age, address, phoneNumber, yearToChapman);
    this.studentID = studentID;
    this.major = major;
    this.minor = minor;
    this.classStanding = classStanding;
  }

  /**Returns id of student
  * @return An int representing student id
  */
  public int getID(){
    return studentID;
  }

  /**Sets student ID to number given
  * @param studentID student ID number
  */
  public void setStudentID(int studentID){
    this.studentID = studentID;
  }

  /**Returns major of student
  * @return A string representing student major
  */
  public String getMajor(){
    return major;
  }

  /**Sets student major to string given
  * @param major student major
  */
  public void setMajor(String major){
    this.major = major;
  }

  /**Returns minor of student
  * @return A string representing student minor
  */
  public String getMinor(){
    return minor;
  }

  /**Sets student minor to string given
  * @param minor student minor
  */
  public void setMinor(String minor){
    this.minor = minor;
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
    return super.print() + ", " + studentID
    + ", " + major + ", " + minor + ", "
    + classStanding;
  }
}
