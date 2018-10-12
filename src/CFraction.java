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

   public CFraction(int n,int d){
       num=n;
       den=d;
   }
   
   public String toString(){
       return num + " / " + den;
   }
   
   public double toDecimal(){
       return (double)num/den;
   }
   
    public CFraction plus(CFraction other) {
        CFraction temp = new CFraction(0, 1);
        temp.num = num * other.den + other.num * den;
        temp.den = den * other.den;
         return temp;
    }
    
       public CFraction plus(int other)
   {
      CFraction temp = new CFraction(num, den);
      temp.num = num + den*other;
      return temp;
   }
       
       
        public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }
       
       
       public CFraction reduce(){
           
            //If a<b, exchange a and b.
            //Divide a by b and get the remainder, r. If r=0, report b as the GCD of a and b.
            //Replace a by b and replace b by r. Return to the previous step.
          
           int tempnum=num/gcd(num,den);
           int tempden=den/gcd(num,den);
            CFraction temp = new CFraction(tempnum,tempden);
           return temp;
          
       }
       
       public CFraction minus(CFraction other){
           CFraction temp = new CFraction(num,den);
           temp.num = num * other.den - other.num * den;
           temp.den = den * other.den;
           return temp;
       }
       
       public CFraction minus(int other){
           CFraction temp = new CFraction(num, den);
             temp.num = num - den*other;
            return temp;
       }
         



   
}
