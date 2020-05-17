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

  private int yearlySalary;

  public FullTimeStaff(){
    super();
    this.yearlySalary = -1;
  }

  public FullTimeStaff(String name, int age, String address, int phoneNumber, int yearToChapman, int staffID, String title, String building, int yearlySalary){
    super(name, age, address, phoneNumber, yearToChapman, staffID, title, building);
    this.yearlySalary = yearlySalary;
  }

  public int getYearlySalary(){
    return yearlySalary;
  }

  public void setYearlySalary(int yearlySalary){
    this.yearlySalary = yearlySalary;
  }

  public String getClassType(){
    return "Full time staff";
  }

  public String print(){
    return super.print() + ", " + yearlySalary;
  }
}
