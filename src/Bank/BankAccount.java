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
public abstract class BankAccount implements Account {
    private int balance;
    private String name;
    
    /**
     * Constructor for BankAccount Class
     * @param newName Name under account
     * Sets the name 
     */
    public BankAccount(String newName){
        //sets new name with 0 balance
        name = newName;
        balance =0;
    }
    
    /**
     * Constructor for BankAccount Class
     * @param newName Name under account
     * @param newBalance Balance under account
     * Sets the name and balance
     */
    public BankAccount(String newName, int newBalance){
        //sets new name with custome balance
        name = newName;
        balance = newBalance;
    }
    
    /**
     * Retriever method for private string name
     * @return value of name
     */
    public String getName(){
        //returns name
        return name;
    }
    
    /**
     * Set method for private string name
     * @param newName new value of name
     */
    public void setName(String newName){
        //sets name
        name = newName;
    }
    
    /**
     * Adds deposit amt to balance
     * @param amt deposit amt
     */
    public void deposit (double amt){
        //adds balance
        balance+=amt;
    }
    
    /**
     * Removes withdrawal amt from balance
     * @param amt withdrawal amt
     */
    public void withdrawal (double amt){
        //subtracts balance
        balance-=amt;
    }
}
