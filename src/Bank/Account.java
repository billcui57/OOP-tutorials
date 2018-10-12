/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author 348848128
 */
public interface Account {
    public void deposit(double amount);
  public void withdrawal(double amount);
  public double getBalance();
  
  public String getName();
    
    public void setName(String newName);
   
        
  
  

}

