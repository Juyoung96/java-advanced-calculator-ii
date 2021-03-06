/*
 * Project: CalcDelim.java
 * Description: Reads in a String math formula, separates based on delim, calculate
 * Name: Juyoung Lee
 * Date: Oct 12, 2015
 */

import java.util.Scanner;

public class CalcDelim {
  
 public String formula;
  
  public CalcDelim() { } // end constructor
  
  // get user input
  public void getFormula() {
   Scanner s = new Scanner( System.in );
   System.out.println( "Enter a math formula: " );
   formula = s.nextLine();
  }
  // return the stored formula
  public String returnFormula() {
    return formula;
  }
  
  // calculates the answer
  public double calculate( String str ) {
    Scanner t = new Scanner( str );
    t.useDelimiter( "\\s*\\+\\s*|\\s*\\-\\s*|\\s*\\*\\s*|\\s*\\/\\s*" ); // separate out the operators
    
    double answer = 0;
    double value = 0;
    char operand;
    
    while ( t.hasNext() ) {
      System.out.println( t.next() );
      System.out.println( t.delimiter() );
    }
    
    return answer;
    
  }
 
/*
 * 1. Ask the user for a String of input (math formula)
 * 2. useDelimeter() to separate out the operators
 * 3. Calculate and display the solution
 */ 
  public static void main( String[] args ) {
  
  CalcDelim c = new CalcDelim();
  c.getFormula();
  c.calculate( c.returnFormula() );
  
} // end method 
} // end class calcDelim

