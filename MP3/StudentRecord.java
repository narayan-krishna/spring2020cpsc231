/** StudentRecord.java
*
* This is a StudentRecord class
* @author Krishna Narayan
* @author Student ID: 2327205
* @author narayan@chapman.edu
* CPSC 231-02 - Dr. Stevens
* Mastery Project 3: Javadoc
* @version 1.0
*/

/** This StudentRecord class is used to represent the grade records of a
* student given three quizzes, a midterm, and a final exam.
* The class consists of basic methods for getting and changing various
* assessment grades within the record, as well as calculating a numeric
* score based off these assessment grades. A letter grade method can also be
* used to find a letter grade given numeric score.
*/

public class StudentRecord{

  /**Points acquired on quiz one (out of 10).*/
  private int quizOne;
  /**Points acquired on quiz two (out of 10).*/
  private int quizTwo;
  /**Points acquired on quiz three (out of 10).*/
  private int quizThree;

  /**Points acquired on midterm (out of 100).*/
  private int midterm;
  /**Points acquired on final (out of 100).*/
  private int finalExam;

  /**Student's numeric score.*/
  private double numericScore;
  /**Student's letter grade.*/
  private char letterGrade;

  /**The default constructor - sets the points of quiz one, quiz two, quiz three,
   * midterm, and final to -1, numeric score to -1.0, and letter grade to 'X'.
	 */
  public StudentRecord(){
    quizOne = -1;
    quizTwo = -1;
    quizThree = -1;
    midterm = -1;
    finalExam = -1;
    numericScore = -1.0;
    letterGrade = 'X';
  }

  /**The overloaded constructor - creates a student record given a point score for
   * quiz one, quiz two, quiz three, midterm, and final exam, as well as a
   * numeric score and a letter grade.
   * @param usrQuizOne int representing quiz one score
   * @param usrQuizTwo int representing quiz two score
   * @param usrQuizThree int representing quiz three score
   * @param usrMidterm int representing midterm totalScore
   * @param usrFinalExam int representing final exam score
   * @param usrNumericScore double representing numeric score
   * @param usrLetterGrade char representing letter grade
   */
  public StudentRecord(int usrQuizOne, int usrQuizTwo, int usrQuizThree,
  int usrMidterm, int usrFinalExam, double usrNumericScore, char usrLetterGrade){
    quizOne = usrQuizOne;
    quizTwo = usrQuizTwo;
    quizThree = usrQuizThree;
    midterm = usrMidterm;
    finalExam = usrFinalExam;
    numericScore = usrNumericScore;
    letterGrade = usrLetterGrade;
  }

  /** Sets quiz one score.
  * @param usrQuizOne Point score on quiz one
  */
  public void setQuizOne(int usrQuizOne){
    quizOne = usrQuizOne;
  }

  /** Sets quiz two score.
  * @param usrQuizTwo Point score on quiz two
  */
  public void setQuizTwo(int usrQuizTwo){
    quizTwo = usrQuizTwo;
  }

  /** Sets quiz three score.
  * @param usrQuizThree Point score on quiz three
  */
  public void setQuizThree(int usrQuizThree){
    quizThree = usrQuizThree;
  }

  /** Sets midterm score.
  * @param usrMidterm Point score on midterm
  */
  public void setMidterm(int usrMidterm){
    midterm = usrMidterm;
  }

  /** Sets final score.
  * @param usrFinalExam Point score on final
  */
  public void setFinalExam(int usrFinalExam){
    finalExam = usrFinalExam;
  }

  /** Returns quiz one score.
  * @return an int representing quiz one score
  */
  public int getQuizOne(){
    return quizOne;
  }

  /** Returns quiz two score.
  * @return an int representing quiz two score
  */
  public int getQuizTwo(){
    return quizTwo;
  }

  /** Returns quiz three score.
  * @return an int representing quiz three score
  */
  public int getQuizThree(){
    return quizThree;
  }

  /** Returns midterm score.
  * @return an int representing midterm score
  */
  public int getMidterm(){
    return midterm;
  }

  /** Returns final exam score.
  * @return an int representing final exam score
  */
  public int getFinalExam(){
    return finalExam;
  }

  /** Returns numeric score.
  * @return a double representing numeric score
  */
  public double getNumericScore(){
    return numericScore;
  }

  /** Returns letter grade.
  * @return a char representing letter grade
  */
  public char getLetterGrade(){
    return letterGrade;
  }

  /** Sets and returns numeric score by calculating given point scores of
  * quiz one, quiz two, quiz three, midterm, and final, and their respective
  * grade weights.
  * @return a double representing numeric score
  */
  public double computeNumericScore(){
    double totalScore = 0;

    double quizPercentage = ((quizOne+quizTwo+quizThree)/30.0)*100;
    double midtermPercentage = (midterm/100.0)*100;
    double finalPercentage = (finalExam/100.0)*100;

    totalScore = quizPercentage*.25 + midtermPercentage*.35 + finalPercentage*.4;
    numericScore = totalScore;
    return totalScore;
  }

  /** Sets and returns letter grade based on numeric score
  * @return a char representing letter grade
  */
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

  /** Returns a pretty-printed string representation of the student record.
  * @return A string representation of the StudentRecord object.
  */
  public String toString(){
    return "Quiz 1 points: " + quizOne + "\nQuiz 2 points: " + quizTwo
    + "\nQuiz 3 points: " + quizThree + "\nMidterm points: " + midterm +
    "\nFinal exam points: " + finalExam + "\nNumeric score: " + numericScore
    + "\nLetter grade: " + letterGrade;
  }

  /** Returns a boolean depending on whether the point scores of one
  * student record are all equal to the point scores of another student record
  * @return A boolean representating whether two records are equal
  */
  public boolean equals(StudentRecord studentRecord){
    if(studentRecord.getQuizOne() == quizOne && studentRecord.getQuizTwo() == quizTwo &&
    studentRecord.getQuizThree() == quizThree && studentRecord.getMidterm() == midterm &&
    studentRecord.getFinalExam() == finalExam){
      return true;
    }else{
      return false;
    }
  }

  /** The main method. Exercises the StudentRecord class functionality.
  * @param args The command line arguments (not used)
  */
  public static void main(String[]args){
    StudentRecord stuart = new StudentRecord(9, 7, 10, 85, 93, 50, 'C');
    System.out.println(stuart.computeNumericScore());
    System.out.println(stuart.computeLetterGrade());
    System.out.println(stuart.toString());

    System.out.println();

    StudentRecord bob = new StudentRecord(8, 8, 8, 50, 50, 70.0, 'C');
    System.out.println(bob.computeNumericScore());
    System.out.println(bob.computeLetterGrade());
    System.out.println(bob.toString());
  }
}
