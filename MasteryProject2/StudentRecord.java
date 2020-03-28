// Krishna Narayan
// 2327305
// narayan@chapman.edu
// CPSC298: Introduction to C++
// Mastery Project 2, Part 2: Student Record

//the following is a class called student record. it is used to
//construct a student record, which holds a students point scores
//on 3 quizzes, a midterm, and a final, as well as a numeric score
//and a letter grade. along with getters and setters, the object
//has methods which can be used for calculating the numeric score,
//finding the approriate letter grade, or deciding if the record
//is equal to the record of another student

public class StudentRecord{

  //private member instance variables

  private int quizOne;
  private int quizTwo;
  private int quizThree;

  private int midterm;
  private int finalExam;

  private double numericScore;
  private char letterGrade;

  //default constructor
  public StudentRecord(){
    quizOne = -1;
    quizTwo = -1;
    quizThree = -1;
    midterm = -1;
    finalExam = -1;
    numericScore = -1.0;
    letterGrade = 'X';
  }

  //overloaded constructor
  public StudentRecord(int usrQuizOne, int usrQuizTwo, int usrQuizThree, int usrMidterm, int usrFinalExam, double usrNumericScore, char usrLetterGrade){
    quizOne = usrQuizOne;
    quizTwo = usrQuizTwo;
    quizThree = usrQuizThree;
    midterm = usrMidterm;
    finalExam = usrFinalExam;
    numericScore = usrNumericScore;
    letterGrade = usrLetterGrade;
  }

  //SETTERS

  public void setQuizOne(int usrQuizOne){
    quizOne = usrQuizOne;
  }

  public void setQuizTwo(int usrQuizTwo){
    quizTwo = usrQuizTwo;
  }

  public void setQuizThree(int usrQuizThree){
    quizThree = usrQuizThree;
  }

  public void setMidterm(int usrMidterm){
    midterm = usrMidterm;
  }

  public void setFinalExam(int usrFinalExam){
    finalExam = usrFinalExam;
  }

  //GETTERS

  public int getQuizOne(){
    return quizOne;
  }

  public int getQuizTwo(){
    return quizTwo;
  }

  public int getQuizThree(){
    return quizThree;
  }

  public int getMidterm(){
    return midterm;
  }

  public int getFinalExam(){
    return finalExam;
  }

  public double getNumericScore(){
    return numericScore;
  }

  public char getLetterGrade(){
    return letterGrade;
  }

  //compute final numeric score based on points accumulated through assessment
  public double computeNumericScore(){
    double totalScore = 0;

    //first solver for grade percentages
    double quizPercentage = ((quizOne+quizTwo+quizThree)/30.0)*100;
    double midtermPercentage = (midterm/100.0)*100;
    double finalPercentage = (finalExam/100.0)*100;

    //add percentages while taking into account the weight of each grade
    totalScore = quizPercentage*.25 + midtermPercentage*.35 + finalPercentage*.4;
    numericScore = totalScore; //set numeric score to this value
    return totalScore; //return this total score as well
  }

  //find the letter grade based on numeric score. series of if else statements.
  //if you are within a certain range, you get this letter grade. etc.
  public char computeLetterGrade(){
    if(numericScore >= 90){
      letterGrade = 'A';
      return 'A';
    }else if(numericScore >= 80){
      letterGrade = 'B';
      return 'B';
    }else if(numericScore >= 70){
      letterGrade = 'C';
      return 'C';
    }else if(numericScore >= 60){
      letterGrade = 'D';
      return 'D';
    }else{
      letterGrade = 'F';
      return 'F';
    }
  }

  //returns all the data of student record into a nicely formatted string
  public String toString(){
    return "Quiz 1 points: " + quizOne + " | Quiz 2 points: " + quizTwo
    + " | Quiz 3 points: " + quizThree + " | Midterm points: " + midterm +
    " | Final exam points: " + finalExam + " | Numeric score: " + numericScore
    + " | Letter grade: " + letterGrade;
  }

  //tests if one student record is equal to another given record
  public boolean equals(StudentRecord studentRecord){
    //if all of the scores are equal, then the records are equal. therefore,
    //to return true, the following conditionals must all be true.
    if(studentRecord.getQuizOne() == quizOne && studentRecord.getQuizTwo() == quizTwo &&
    studentRecord.getQuizThree() == quizThree && studentRecord.getMidterm() == midterm &&
    studentRecord.getFinalExam() == finalExam){
      return true;
    }else{
      return false;
    }
  }

  //main. create records and run accessors, mutators, and other methods here
  public static void main(String[]args){
    StudentRecord stuart = new StudentRecord(9, 7, 10, 85, 93, 50, 'C');
    System.out.println(stuart.computeNumericScore());
    System.out.println(stuart.computeLetterGrade());
    System.out.println(stuart.toString());

    StudentRecord bob = new StudentRecord(8, 8, 8, 50, 50, 70.0, 'C');
    System.out.println(bob.computeNumericScore());
    System.out.println(bob.computeLetterGrade());
    System.out.println(bob.toString());
  }
}
