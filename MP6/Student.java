public abstract class Student extends Affiliate implements Printable{

  private int studentID;
  private String major;
  private String minor;
  private int classStanding;

  public Student(){
    super();
    this.studentID = -1;
    this.major = "X";
    this.minor = "X";
    this.classStanding = -1;
  }

  public Student(String name, int age, String address, int phoneNumber, int yearToChapman, int studentID, String major, String minor, int classStanding){
    super(name, age, address, phoneNumber, yearToChapman);
    this.studentID = studentID;
    this.major = major;
    this.minor = minor;
    this.classStanding = classStanding;
  }

  public int getID(){
    return studentID;
  }

  public void setStudentID(int studentID){
    this.studentID = studentID;
  }

  public String getMajor(){
    return major;
  }

  public void setMajor(String major){
    this.major = major;
  }

  public String getMinor(){
    return minor;
  }

  public void setMinor(String minor){
    this.minor = minor;
  }

  public String getClassType(){
    return "-1";
  }

  public String print(){
    return super.print() + ", " + studentID
    + ", " + major + ", " + minor + ", "
    + classStanding;
  }
}
