/** UndergraduateStudent.java
*
* This is an UndergraduateStudent class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 6:Inheritance, Interfaces, & Abstract Classes
* @version 1.0
*/

public class UndergraduateStudent extends Student implements Printable{

  /**Number of courses taken*/
  private int coursesTaken;
  /**Scholarship amount*/
  private int scholarshipAmount;

  /**Default constructor*/
  public UndergraduateStudent(){
    super();
    this.coursesTaken = -1;
    this.scholarshipAmount = -1;
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
  * @param coursesTaken Courses taken
  * @param scholarshipAmount Scholarship amount
  */
  public UndergraduateStudent(String name, int age, String address, int phoneNumber, int yearToChapman, int studentID, String major, String minor, int classStanding, int coursesTaken, int scholarshipAmount){
    super(name, age, address, phoneNumber, yearToChapman, studentID, major, minor, classStanding);
    this.coursesTaken = coursesTaken;
    this.scholarshipAmount = scholarshipAmount;
  }

  /**Returns number of courses taken
  * @return An int representing courses taken
  */
  public int getCoursesTaken(){
    return coursesTaken;
  }

  /**Sets the courses taken to number given
  * @param coursesTaken Num courses taken
  */
  public void setCoursesTaken(int coursesTaken){
    this.coursesTaken = coursesTaken;
  }

  /**Returns scholarship amount
  * @return An int representing scholarship amount
  */
  public int getScholarshipAmmount(){
    return scholarshipAmount;
  }

  /**Sets the scholarship amount to number given
  * @param scholarshipAmount Scholarship amount
  */
  public void setScholarshipAmount(int scholarshipAmount){
    this.scholarshipAmount = scholarshipAmount;
  }

  /**Returns class type
  * @return a string representing class type
  */
  public String getClassType(){
    return "Undergrad student";
  }

  /**Returns a string printing all relevant data
  * @return A string representing all relevant data
  */
  public String print(){
    return super.print() + ", " + coursesTaken
    + ", " + scholarshipAmount;
  }
}
