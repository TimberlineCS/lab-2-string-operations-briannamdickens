/*Brianna Dickens
AP CompSci
08-31-2020
*/

public class stringOperations{
  public static void main(String args[]){
    //Challenge 1: Scrambles any word that is inputed
    String word = "bunny";
    int wordLength = word.length();
    int middle = wordLength/2;
    String firstHalf = word.substring(0, middle);
    String secondHalf = word.substring(middle);
    System.out.print(secondHalf);
    System.out.println(firstHalf);
    //Challenge 2: Prints ASCII art
    System.out.print("(\\ /)\n(. .)\nc(\")(\")");
    //Couldn't figure out the dog cause certain characters, but I made a rabbit!
  }
}