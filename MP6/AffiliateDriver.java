import java.io.*;
import java.util.*;


public class AffiliateDriver{

  private HashMap<Affiliate, Integer> database;

  public AffiliateDriver(){
    database = new HashMap<Affiliate, Integer>();
  }

  public void printOptions(){
    System.out.println("1) Create an affiliate record\n" +
    "2) Print information for an Affiliate given the id\n" +
    "3) List all affiliates in order of seniority\n" +
    "4) Delete a record given the id\n" +
    "5) Save your database to a file\n" +
    "6) Restore your database from a file\n" + "7) Exit\n");
  }

  public void create(Affiliate a){
    database.put(a, a.getID());
  }

  public void printAffiliate(int id){
    for(Affiliate a : database.keySet()){
      if(id == database.get(a)){
        System.out.println(a.print() + "\n");
      }
    }
  }

  public void deleteAffiliate(int id){
    for(Affiliate a : database.keySet()){
      if(id == database.get(a)){
        database.remove(a);
        break;
      }
    }
  }

  public void printDatabase(){
    for(Affiliate a : database.keySet()){
        System.out.println(a.print() + "\n");
    }
  }

  public void senioritySort(){
    ArrayList<Affiliate> sorter = new ArrayList<Affiliate>();
    int added = 0;
    for(Affiliate a : database.keySet()){
      // System.out.println(a.print());
      // System.out.println();
      if(sorter.size() == 0){
        sorter.add(a);
        // System.out.println("sorter size 0\n");
      }else if(sorter.size() > 0){
        // System.out.println("sorter size NOT 0\n");
        for(int i = 0; i < sorter.size(); i++){
          if(a.getYearToChapman() < (sorter.get(i).getYearToChapman())){
            sorter.add(i, a);
            added = 1;
            break;
          }else if(a.getYearToChapman() == (sorter.get(i).getYearToChapman())){
            if(a.getName().compareTo(sorter.get(i).getName())<0){
              sorter.add(i,a);
              added = 1;
              break;
            }else{
              sorter.add(i+1, a);
              added = 1;
              break;
            }
          }
        }
        if(added == 0){
          sorter.add(a);
        }
      }
      added = 0;
    }
    for(Affiliate a : sorter){
      System.out.println(a.getClassType() + ", " + a.print());
    }
  }

  public void saveToFile(String fileName){
    // FileOutputStream fileStream = null;
    PrintWriter outFS = null;
    try{
      outFS = new PrintWriter(new FileWriter(fileName));
      for(Affiliate a : database.keySet()){
        outFS.println(a.getClassType() + ", " + a.print());
      }
      outFS.close();
    }catch(Exception e){
      System.out.println("Warning. System failure");
      outFS = null;
    }
  }

  public void readToDatabase(String fileName){
    BufferedReader read;
    try{
       read = new BufferedReader(new FileReader(fileName));
       String line = read.readLine();
       while(line != null){
         String [] s = line.split(", ");
         String type  = s[0];
          if(type.equals("Full professor")){
            FullProfessor a = new FullProfessor(s[1], Integer.parseInt(s[2]),
            s[3], Integer.parseInt(s[4]), Integer.parseInt(s[5]),
            Integer.parseInt(s[6]), s[7], Integer.parseInt(s[8]),
            Integer.parseInt(s[9]), Integer.parseInt(s[10]));
            database.put(a, a.getID());
          }else if(type.equals("Assistant professor")){
            AssistantProfessor a = new AssistantProfessor(s[1], Integer.parseInt(s[2]),
            s[3], Integer.parseInt(s[4]), Integer.parseInt(s[5]),
            Integer.parseInt(s[6]), s[7], Integer.parseInt(s[8]),
            Integer.parseInt(s[9]), Integer.parseInt(s[10]));
            database.put(a, a.getID());
          }else if(type.equals("Associate professor")){
            AssociateProfessor a = new AssociateProfessor(s[1], Integer.parseInt(s[2]),
            s[3], Integer.parseInt(s[4]), Integer.parseInt(s[5]),
            Integer.parseInt(s[6]), s[7], Integer.parseInt(s[8]),
            Integer.parseInt(s[9]), Integer.parseInt(s[10]));
            database.put(a, a.getID());
          }else if(type.equals("Full time staff")){
            FullTimeStaff a = new FullTimeStaff(s[1], Integer.parseInt(s[2]),
            s[3], Integer.parseInt(s[4]), Integer.parseInt(s[5]),
            Integer.parseInt(s[6]), s[7], s[8],
            Integer.parseInt(s[9]));
            database.put(a, a.getID());
          }else if(type.equals("Part time staff")){
            PartTimeStaff a = new PartTimeStaff(s[1], Integer.parseInt(s[2]),
            s[3], Integer.parseInt(s[4]), Integer.parseInt(s[5]),
            Integer.parseInt(s[6]), s[7], s[8],
            Integer.parseInt(s[9]));
            database.put(a, a.getID());
          }else if(type.equals("Grad student")){
            GraduateStudent a = new GraduateStudent(s[1], Integer.parseInt(s[2]),
            s[3], Integer.parseInt(s[4]), Integer.parseInt(s[5]),
            Integer.parseInt(s[6]), s[7], s[8], Integer.parseInt(s[9]),
            Integer.parseInt(s[10]), s[11]);
            database.put(a, a.getID());
          }else if(type.equals("Undergrad student")){
            UndergraduateStudent a = new UndergraduateStudent(s[1], Integer.parseInt(s[2]),
            s[3], Integer.parseInt(s[4]), Integer.parseInt(s[5]),
            Integer.parseInt(s[6]), s[7], s[8], Integer.parseInt(s[9]),
            Integer.parseInt(s[10]), Integer.parseInt(s[11]));
            database.put(a, a.getID());
          }
         line = read.readLine();
       }
       read.close();
    }catch(Exception e){
      System.out.println("Warning. System failure");
    }
  }

  public static void main(String []args){
    AffiliateDriver d = new AffiliateDriver();
    Scanner sc = new Scanner(System.in);
    String option = "";

    while(!(option.equals("7"))){
      System.out.println();
      d.printOptions();
      option = sc.nextLine();
      if(option.equals("1")){
        System.out.println("enter the type of affiliate you'd like to create: ");
        String type = sc.nextLine().toLowerCase();
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("enter age");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("enter address");
        String address = sc.nextLine();
        System.out.println("enter phone number (no area code)");
        int phoneNumber = Integer.parseInt(sc.nextLine());
        System.out.println("enter year affiliate came to chapman");
        int yearToChapman = Integer.parseInt(sc.nextLine());
        if(type.equals("full professor")){
          System.out.println("enter faculty id");
          int facultyID = Integer.parseInt(sc.nextLine());
          System.out.println("enter department");
          String department = sc.nextLine();
          System.out.println("enter yearly salaray");
          int yearlySalary = Integer.parseInt(sc.nextLine());
          System.out.println("enter number of papers published");
          int numPapers = Integer.parseInt(sc.nextLine());
          System.out.println("enter years until retirement");
          int yearsUntilRetirement = Integer.parseInt(sc.nextLine());
          FullProfessor a = new FullProfessor(name, age, address, phoneNumber,
          yearToChapman, facultyID, department, yearlySalary, numPapers,
          yearsUntilRetirement);
          d.create(a);
        }else if(type.equals("assistant professor")){
          System.out.println("enter faculty id");
          int facultyID = Integer.parseInt(sc.nextLine());
          System.out.println("enter department");
          String department = sc.nextLine();
          System.out.println("enter yearly salaray");
          int yearlySalary = Integer.parseInt(sc.nextLine());
          System.out.println("enter number of papers published");
          int numPapers = Integer.parseInt(sc.nextLine());
          System.out.println("enter years until tenure");
          int yearsUntilTenure = Integer.parseInt(sc.nextLine());
          AssistantProfessor a = new AssistantProfessor(name, age, address, phoneNumber,
          yearToChapman, facultyID, department, yearlySalary, numPapers,
          yearsUntilTenure);
          d.create(a);
        }else if(type.equals("associate professor")){
          System.out.println("enter faculty id");
          int facultyID = Integer.parseInt(sc.nextLine());
          System.out.println("enter department");
          String department = sc.nextLine();
          System.out.println("enter yearly salaray");
          int yearlySalary = Integer.parseInt(sc.nextLine());
          System.out.println("enter number of papers published");
          int numPapers = Integer.parseInt(sc.nextLine());
          System.out.println("enter years since tenure");
          int yearsSinceTenure = Integer.parseInt(sc.nextLine());
          AssociateProfessor a = new AssociateProfessor(name, age, address, phoneNumber,
          yearToChapman, facultyID, department, yearlySalary, numPapers,
          yearsSinceTenure);
          d.create(a);
        }else if(type.equals("full time staff")){
          System.out.println("enter staff id");
          int staffID = Integer.parseInt(sc.nextLine());
          System.out.println("enter title");
          String title = sc.nextLine();
          System.out.println("enter building");
          String building = sc.nextLine();
          System.out.println("enter yearly salary");
          int yearlySalary = Integer.parseInt(sc.nextLine());
          FullTimeStaff a = new FullTimeStaff(name, age, address, phoneNumber,
          yearToChapman, staffID, title, building, yearlySalary);
          d.create(a);
        }else if(type.equals("part time staff")){
          System.out.println("enter staff id");
          int staffID = Integer.parseInt(sc.nextLine());
          System.out.println("enter title");
          String title = sc.nextLine();
          System.out.println("enter building");
          String building = sc.nextLine();
          System.out.println("enter hourly salary");
          int hourlySalary = Integer.parseInt(sc.nextLine());
          PartTimeStaff a = new PartTimeStaff(name, age, address, phoneNumber,
          yearToChapman, staffID, title, building, hourlySalary);
          d.create(a);
        }else if(type.equals("grad student")){
          System.out.println("enter student id");
          int studentID = Integer.parseInt(sc.nextLine());
          System.out.println("enter major");
          String major = sc.nextLine();
          System.out.println("enter minor");
          String minor = sc.nextLine();
          System.out.println("enter class standing");
          int classStanding = Integer.parseInt(sc.nextLine());
          System.out.println("enter papers published");
          int papersPublished = Integer.parseInt(sc.nextLine());
          System.out.println("enter thesis advisor");
          String thesisAdvisor = sc.nextLine();
          GraduateStudent a = new GraduateStudent(name, age, address,
          phoneNumber, yearToChapman, studentID, major, minor, classStanding,
          papersPublished, thesisAdvisor);
          d.create(a);
        }else if(type.equals("undergrad student")){
          System.out.println("enter student id");
          int studentID = Integer.parseInt(sc.nextLine());
          System.out.println("enter major");
          String major = sc.nextLine();
          System.out.println("enter minor");
          String minor = sc.nextLine();
          System.out.println("enter class standing");
          int classStanding = Integer.parseInt(sc.nextLine());
          System.out.println("enter courses taken");
          int coursesTaken = Integer.parseInt(sc.nextLine());
          System.out.println("enter scholarship amount");
          int scholarshipAmount = Integer.parseInt(sc.nextLine());
          UndergraduateStudent a = new UndergraduateStudent(name, age, address,
          phoneNumber, yearToChapman, studentID, major, minor, classStanding,
          coursesTaken, scholarshipAmount);
          d.create(a);
        }
        else{
          System.out.println("error");
        }
      }else if(option.equals("2")){
        System.out.println("enter id");
        int id = Integer.parseInt(sc.nextLine());
        d.printAffiliate(id);
      }else if(option.equals("3")){
        d.senioritySort();
      }else if(option.equals("4")){
        System.out.println("enter id");
        int id = Integer.parseInt(sc.nextLine());
        d.deleteAffiliate(id);
      }else if(option.equals("5")){
        System.out.println("enter name of file: ");
        String fileName = sc.nextLine();
        d.saveToFile(fileName);
      }else if(option.equals("6")){
        System.out.println("enter name of file: ");
        String fileName = sc.nextLine();
        d.readToDatabase(fileName);
      }
    }
    System.out.println();
  }

  // public static void main(String []args){
  //   AffiliateDriver d = new AffiliateDriver();
  //   d.printInstructions();
  //   GraduateStudent assistant = new GraduateStudent();
  //   assistant.setYearToChapman(121);
  //   assistant.setStudentID(32);
  //   assistant.setName("brrr");
  //   AssistantProfessor assistant2 = new AssistantProfessor();
  //   assistant2.setYearToChapman(124);
  //   assistant2.setName("arr");
  //   PartTimeStaff assistant3 = new PartTimeStaff();
  //   assistant3.setYearToChapman(123);
  //   assistant3.setName("eee");
  //   d.create(assistant);
  //   d.create(assistant2);
  //   d.create(assistant3);
  //   //d.senioritySort();
  //   System.out.println("-----------------------------------------------------");
  //   // d.deleteAffiliate(32);
  //   //d.senioritySort();
  //   System.out.println("-----------------------------------------------------");
  //   d.saveToFile("data.txt");
  //   d.readToDatabase("data.txt");
  //   d.printDatabase();
  //   // UndergraduateStudent s = new UndergraduateStudent();
  // }
}
