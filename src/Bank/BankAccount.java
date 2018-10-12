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
    
    public BankAccount(String newName){
        name = newName;
        balance =0;
    }
    
    public BankAccount(String newName, int newBalance){
        name = newName;
        balance = newBalance;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    
    public void deposit (double amt){
        
    }
    
    public void withdrawal (double amt){
        
    }
}
