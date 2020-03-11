//syntax testing for class/random excercises for class
//java for jupyter notebook 2020

import java.util.Random;
import java.lang.Math;

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

  //a=pi*r^2
  public static double areaCircle (double radius){
    return Math.PI*(Math.pow(radius, 2));
  }

  //v=pi*r*2^h
  public static double volCylinder (double radius, double height){
    return areaCircle(radius)*height;
  }

  public static int increment(int n){
    return ++n;
  }

  //method 1
  public static int sumToLimit(int limit){
    int sum = 0;
    for(int i = 1; i <= limit; ++i){
      sum += i;
    }
    return sum;
  }

  public static int max(int num1, int num2){
    int max = num1;
    if (num2 > num1){
      max = num2;
    }
    return max;
  }

  public static double max(double num1, double num2){
    double max = num1;
    if (num2 > num1){
      max = num2;
    }
    return max;
  }

  public static char max(char char1, char char2){
    char max = char1;
    if (char2 > char1){
      max = char2;
    }
    return max;
  }


  public static void main(String[] args){
    System.out.println(max(3,7));
    System.out.println(max(73.2,37.9));
    System.out.println(max('a', 'z'));
  }
}
