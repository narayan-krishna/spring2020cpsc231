public abstract class Staff extends Affiliate implements Printable{

  private int staffID;
  private String title;
  private String building;

  public Staff(){
    super();
    this.staffID = -1;
    this.title = "X";
    this.building = "X";
  }

  public Staff(String name, int age, String address, int phoneNumber, int yearToChapman, int staffID, String title, String building){
    super(name, age, address, phoneNumber, yearToChapman);
    this.staffID = staffID;
    this.title = title;
    this.building = building;
  }

  public int getID(){
    return staffID;
  }

  public void setStaffID(int staffID){
    this.staffID = staffID;
  }

  public String getTitle(){
    return title;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public String getBuilding(){
    return building;
  }

  public void setBuilding(String building){
    this.building = building;
  }

  public String getClassType(){
    return "-1";
  }

  public String print(){
    return super.print() + ", " + staffID + ", " + title
    + ", " + building;
  }
}
