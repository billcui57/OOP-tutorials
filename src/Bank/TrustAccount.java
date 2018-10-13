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
public abstract class TrustAccount extends BankAccount{

    String trustedName;
    /**
     * Constructor
     * @param newName name of account
     * @param newTrustedName name of trustee
     */
    public TrustAccount(String newName, String newTrustedName) {
        //Constructs parent class
        super(newName);
        //sets trusted name
        trustedName = newTrustedName;
    }
    
    /**
     * Constructor
     * @param newName name of account
     * @param newTrustedName name of trustee
     * @param newBalance new balance
     */
    public TrustAccount(String newName, String newTrustedName, int newBalance){
        //Constructs parent class
        super(newName,newBalance);
        //sets trusted name
        trustedName = newTrustedName;
    } 
    
}
