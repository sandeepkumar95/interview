/**
 * 
 */
package com.sandeep.interview;

import java.util.Scanner;

/**
 * @author sandy
 *
 */
public class PowerOfN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the base");
		int x= Integer.parseInt(sc.nextLine());
		System.out.println("Enter the power");
		int n= Integer.parseInt(sc.nextLine());
		int result = pow(x,n);
		System.out.println("The " +"POW("+x+","+n+")" +"is " +result);

	}
	
	public static int pow(int x,int n){		
		if(n==0){
			return 1;
		}else{
			int v = pow(x,n/2);
			if(n%2==0){
				return v*v;
			}else{
				return x*v*v;
			}
		}
	}

}
