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
public class TrustAccount extends BankAccount{

    String trustedName;
    public TrustAccount(String newName, String newTrustedName) {
        super(newName);
        trustedName = newTrustedName;
    }
    
    public TrustAccount(String newName, String newTrustedName, int newBalance){
        super(newName,newBalance);
        trustedName = newTrustedName;
    } 
    
}
