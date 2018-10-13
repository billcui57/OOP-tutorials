/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 348848128
 */
public class CFraction {
    int num;
   int den;

   /**
    * Constructor for Fraction Class
    * @param n numerator
    * @param d denominator
    */
   public CFraction(int n,int d){
       num=n;
       den=d;
   }
   
   /**
    * Returns the string format of the fraction
    * @return the proper fraction notation as a string (numerator/denominator)
    */
   public String toString(){
       return num + " / " + den;
   }
   
   /**
    * returns the decimal form of the fraction
    * @return the decimal form of the fraction
    */
   public double toDecimal(){
       //returns the quotient as a double
       return (double)num/den;
   }
   
   /**
    * Finds the sum of two fractions
    * @param other the other fraction that is added
    * @return the sum of the two fractions
    */
    public CFraction plus(CFraction other) {
        //create a temp blank fraction to store results
        CFraction temp = new CFraction(0, 1);
        //common denominator and add
        temp.num = num * other.den + other.num * den;
        temp.den = den * other.den;
         return temp;
    }
    
    /**
     * Finds the sum of a fraction and an integer
     * @param other the integer
     * @return the sum 
     */
       public CFraction plus(int other)
   {    
      CFraction temp = new CFraction(num, den);
      //common denominator and add
      temp.num = num + den*other;
      return temp;
   }
       
       /**
        * Finds the greatest common divisor of two numbers using recursion and Euclids Algorithm
        * @param p number 1
        * @param q number 2
        * @return the greatest common divisor of the two numbers
        */
        public static int gcd(int p, int q) {
            //If a<b, exchange a and b.
            //Divide a by b and get the remainder, r. If r=0, report b as the GCD of a and b.
            //Replace a by b and replace b by r. Return to the previous step.
        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }
       
       /**
        * Reduces the fraction
        * @return the reduced form of the fraction
        */
       public CFraction reduce(){
           //divides the numerator and denominator with their greatest common divisor to reduce
           int tempnum=num/gcd(num,den);
           int tempden=den/gcd(num,den);
            CFraction temp = new CFraction(tempnum,tempden);
           return temp;
          
       }
       
       /**
        * Subtracts two fractions
        * @param other the other fraction
        * @return the difference between two fractions
        */
       public CFraction minus(CFraction other){
           //common denonimator and subtract
           CFraction temp = new CFraction(0,1);
           temp.num = num * other.den - other.num * den;
           temp.den = den * other.den;
           return temp;
       }
       
       /**
        * Subtracts a fraction with an integer
        * @param other the integer
        * @return the difference
        */
       public CFraction minus(int other){
           //common denominator and subtract
           CFraction temp = new CFraction(num, den);
             temp.num = num - den*other;
            return temp;
       }
         



   
}
