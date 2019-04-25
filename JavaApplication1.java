/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.math.BigInteger;

/**
 *
 * @author 33020
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        		
		for(int i = 1;i <= 200;i++) {
			
			System.out.print("第"+i+"个数"+Fibonacci.of(i) + "\n");
		}	
    }
     
    

}
