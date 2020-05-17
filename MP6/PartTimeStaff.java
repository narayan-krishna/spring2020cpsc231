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

  public PartTimeStaff(){
    super();
    this.hourlySalary = -1;
  }

  public PartTimeStaff(String name, int age, String address, int phoneNumber, int yearToChapman, int staffID, String title, String building, int hourlySalary){
    super(name, age, address, phoneNumber, yearToChapman, staffID, title, building);
    this.hourlySalary = hourlySalary;
  }

  public int getHourlySalary(){
    return hourlySalary;
  }

  public void setHourlySalaray(int hourlySalary){
    this.hourlySalary = hourlySalary;
  }

  public String getClassType(){
    return "Part time staff";
  }

  public String print(){
    return super.print() + ", " + hourlySalary;
  }
}
