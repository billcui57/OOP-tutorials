/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 348848128
 */
public class Example1 {
    public static void main(String[] args){
        CFraction f = new CFraction(-2,6);
        CFraction g = new CFraction(5,7);
        CFraction sum = f.plus(g);
        CFraction reduced = f.reduce();
        System.out.println(reduced.toString());
        
    }
}
