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

  private int papersPublished;
  private String thesisAdvisor;

  public GraduateStudent(){
    super();
    this.papersPublished = -1;
    this.thesisAdvisor = "X";
  }

  public GraduateStudent(String name, int age, String address, int phoneNumber, int yearToChapman, int studentID, String major, String minor, int classStanding, int papersPublished, String thesisAdvisor){
    super(name, age, address, phoneNumber, yearToChapman, studentID, major, minor, classStanding);
    this.papersPublished = papersPublished;
    this.thesisAdvisor = thesisAdvisor;
  }

  public int getPapersPublished(){
    return papersPublished;
  }

  public void setPapersPublished(){
    this.papersPublished = papersPublished;
  }

  public String getThesisAdvisor(){
    return thesisAdvisor;
  }

  public void setThesisAdvisor(){
    this.thesisAdvisor = thesisAdvisor;
  }

  public String getClassType(){
    return "Grad student";
  }

  public String print(){
    return super.print() + ", " + papersPublished
    + ", " + thesisAdvisor;
  }
}
