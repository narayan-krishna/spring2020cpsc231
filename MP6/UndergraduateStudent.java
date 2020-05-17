public class UndergraduateStudent extends Student implements Printable{

  private int coursesTaken;
  private int scholarshipAmount;

  public UndergraduateStudent(){
    super();
    this.coursesTaken = -1;
    this.scholarshipAmount = -1;
  }

  public UndergraduateStudent(String name, int age, String address, int phoneNumber, int yearToChapman, int studentID, String major, String minor, int classStanding, int coursesTaken, int scholarshipAmount){
    super(name, age, address, phoneNumber, yearToChapman, studentID, major, minor, classStanding);
    this.coursesTaken = coursesTaken;
    this.scholarshipAmount = scholarshipAmount;
  }

  public int getCoursesTaken(){
    return coursesTaken;
  }

  public void setCoursesTaken(){
    this.coursesTaken = coursesTaken;
  }

  public int getScholarshipAmmount(){
    return scholarshipAmount;
  }

  public void setScholarshipAmount(){
    this.scholarshipAmount = scholarshipAmount;
  }

  public String getClassType(){
    return "Undergrad student";
  }

  public String print(){
    return super.print() + ", " + coursesTaken
    + ", " + scholarshipAmount;
  }
}
