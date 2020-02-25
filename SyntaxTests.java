//syntax testing for class/random excercises for class
//java for jupyter notebook 2020

import java.util.Random;

public class SyntaxTests{

  //prints hello world
  public static void helloWorld(){
    System.out.println("Hello world!");
  }

  //prints a given integer array
  public static void printIntArray(int [] arr){
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i]);
    }
    System.out.println();
  }

  //initializes and prints an empty array
  public static void array(){
    int[] nums = new int[5];
    printIntArray(nums);
    System.out.println("Address of array: " + nums);
  }

  //create a 2d array
  public static void array2dTest(){
    Random randGen = new Random();
    int[][]scores = new int[12][12];
    for(int i = 0; i < scores.length; i++){
      for(int j = 0; j < scores[i].length; j++){
        scores[i][j] = randGen.nextInt(10);
        System.out.print(scores[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args){
    //helloWorld();
    //array();
    array2dTest();
  }
}
