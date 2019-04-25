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
public class Fibonacci {
    
    public static BigInteger of(int  num) {
		
		BigInteger nextnum = new BigInteger("1");
		BigInteger thisnum = new BigInteger("1");
		BigInteger temp = new BigInteger("0");
		for(int i=1; i<=num; i++) {
			if(i <= 2) {
				nextnum = new BigInteger("1");
			}else {
				temp = nextnum;
				nextnum = nextnum.add(thisnum);
				thisnum = temp;
			}	
		}
	
			return nextnum;
		}
	}

