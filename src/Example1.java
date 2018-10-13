/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Testing Class
 * @author 348848128
 */
public class Example1 {
    public static void main(String[] args){
        CFraction f = new CFraction(1,3);
        CFraction g = new CFraction(1,2);
        CFraction sum = f.minus(g);
        
        System.out.println(sum.toString());
        
    }
}
