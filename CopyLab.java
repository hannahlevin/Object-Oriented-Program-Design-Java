// Hannah Levin
// hannahlevin@my.smccd.edu
// CIS 254 ON
// TheFinder.java
// Reads in a sentence from the user and displays the count of every occurrence of the word "the" in any case
// Lab 7
// 7-30-2018
// I have not cheated or plagiarized on this lab.

import java.util.Scanner; // class uses class Scanner

public class TheFinder {
   public static void main(String[] args) {

      // create Scanner to obtain input from command window
      Scanner input = new Scanner(System.in);

      // prompt for input and read sentence from user
      System.out.println("Enter a sentence (or quit to exit) : ");
      String sentence = input.nextLine();


      // loop until sentinel value, lower case or upper case, is entered
      while (!(sentence.equalsIgnoreCase("quit"))) {

         sentence = sentence.toLowerCase();

         int start = 0;
         int count = 0;
         int index = 0;

         while (start < sentence.length()) {
            index = sentence.indexOf("the", start);

            if (index != -1) {
               start = index + 1;
               count++;
            }
            else {
               start = sentence.length();
            }
         }

         System.out.printf("The word *the* appeared %d time(s).%n", count);

         System.out.println();
         System.out.println("Enter a sentence (or quit to exit) : ");
         sentence = input.nextLine();
      }

      System.out.printf("%n%nProgrammed by Hannah Levin%n%n");
   }
}