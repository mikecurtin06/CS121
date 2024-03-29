/**
* FileRelations is intended to be a simple search engine to find the most related text files possible
* @author [Your Name]
* @version 1.0
*/

import java.io.*;

public class FileRelations{

   /**
   * a String holding the file name for the highest scoring file
   */
   private String topFile;
   /**
   * The score for the highest scoring file
   */
   private double topScore;
   /**
   * wordsToFind: a String array holding all the words to search for
   */
   private String[] wordsToFind;
   
   /**
   * This is the primary and only constructor for the FileRelations class.
   * @param toFind holds all the key words to search for
   */
   public FileRelations(String[] toFind){
      topFile = "";
      topScore = 0.0;
      wordsToFind = new String[];
   }
   
   /**
   * Analyses the file based on the keywords and updates the top scoring file and score once done.
   * @param fileContent an array of Strings each representing a line in the original file
   * @param fileName the name of the file being analysed
   */ 
   public void analyseFile(String[] fileContent, String fileName){
      //TODO 4
      // Search the fileContent array to find the frequency of words in each line, using the scoreLine method 
      // Divide the score by the total number of lines. Note: cast the numerator as (double).
      // Compare to and possibly replace topScore
      // Assign the topFile to the file name with topScore if needed

      String currentFile = "";
      int topFileScore = scoreLine(fileContent[0]) // / fileContent.length;

      int frequency = 0;

      for(int i = 0; i < fileContent.length; i++){
         currentFile = fileContent[i];

         //frequency = scoreLine(fileContent[i]);
      }

      /*for(int i = 1; i < fileContent.length; i++){
         currentFileScore = scoreLine(fileContent[i]) // / fileContent.length;
         if(currentFileScore > topFileScore)
            topFileScore = currentFileScore;
      }*/

      topFileScore = (double)topFileScore // / fileContent.length;

   }
   
   /**
   * Analyses the line passed in and scores it based on frequency of the key words. A helper method for analyseFile.
   * @param line a String representing a single line in a file
   * @returns the score of the line passed in
   */ 
   private int scoreLine(String line){
      //TODO 3
      // Split the line into words
      // Score each word and sum those scores
      // Return the sums


      //int numSpaces = 0;
      int indexOfSpace = 0;
      int indexOfWord = 0;
      int sumScore = 0;
      String word = "";
      boolean isSpace = false;
      for(int i = 0; i < line.length(); i++){
         isSpace = Character.isWhitespace(line.charAt(i));
         if(isSpace){
            indexOfSpace = i;
            word = line.substring(indexOfWord, indexOfSpace);
            sumScore += countWord(word);
            indexOfWord = indexOfSpace + 1;
         }
      }
      return sumScore;
   }
   
   /**
   * Analyses the word passed in and scores it based on if it is one of the key words. A helper method for scoreLine.
   * @param word a String representing a single word in a file
   * @returns the score of the word passed in
   */ 
   private int countWord(String word){
      //TODO 2
      // Compare the word passed in to each of the wordsToFind and count the matches.
      // Return the result of the word comparison
      int numWords = 0;
      for(int i = 0; i < wordsToFind.length; i++){
         if(word.equals(wordsToFind[i]))
            numWords++;
      }
      return numWords;
      //return 0;
   }
   
   /**
   * A getter method for the key words used in this object's search
   * @returns a String array containing the key words to search for.
   */ 
   public String[] getWords(){
      //TODO 5
      return wordsToFind;
   }
   
   /**
   * A getter method for the top scoring file in the object currently
   * @returns a String representing the file name of the top scoring file.
   */ 
   public String getTopFile(){
      //TODO 6
      return topFile;
   }
   
   /**
   * A getter method for the score of the top scoring file in the object currently
   * @returns an int representing the score of the top scoring file.
   */ 
   public double getTopScore(){
      //TODO 7
      return topScore;
   }
}