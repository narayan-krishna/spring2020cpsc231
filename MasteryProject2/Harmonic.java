// Krishna Narayan
// 2327305
// narayan@chapman.edu
// CPSC298: Introduction to C++
// Mastery Project 2, Part 1: Harmonic

//the following class has two methods that can be used to
//find the harmonic number given the term at which the number
//lies in the series. the first method using iteration, while 
//the second uses recursion.

public class Harmonic{

  //solve for harmonic number given an n term: using iteration.
  //returns corresponding harmonic number as a double
  public static double calcIterativeHarmonic(int n){
    //create double value, add to value to get sum
    double harmonicValue = 0.0;
    while(n != 1){ //while loop until n is first term of series
      harmonicValue += (1.0/n); //sum values using definition
      n --; //take a count away from n
    }
    return harmonicValue + 1.0; //return final value with last term added
  }

  //solves for harmonic number given an n term: using recursion
  //returns corresponding harmonic number as a double
  public static double calcRecursiveHarmonic(int n){
    //base case
    if(n == 1){
      return 1.0; //base case is first term of harmonic
    }
    else{
      //recursively add harmonic terms using definition until base case is hit
      return (1.0/n) + calcRecursiveHarmonic(n-1);
    }
  }

  //main prints the 1st through 20th harmonic numbers using both
  //iterative and recursive methods
  public static void main(String[]args){
    //use for loop to collectively print all harmonic numbers up to a value n

    //iteration is used here
    System.out.println("Harmonic numbers using iteration: ");
    for (int i = 1; i < 21; i ++){ //n here is 20
      System.out.print(calcIterativeHarmonic(i) + " ");
    }
    System.out.println();

    //recursion is used here
    System.out.println("Harmonic numbers using recursion: ");
    for (int r = 1; r < 21; r ++){ //n here is 20
      System.out.print(calcRecursiveHarmonic(r) + " ");
    }
    System.out.println();
  }
}
