/**
 * 
 */
package com.sandeep.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author sandy
 *
 */
public class Fibonacci {

	private static Map<Long, Long> fibCache = new HashMap<Long, Long>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		long number = Long.parseLong(sc.nextLine());
		fibCache.put((long) 0, (long) 0);
		fibCache.put((long) 1, (long) 1);
		System.out.println(" The Fibonacci Number at inter "+number+"  is : " + fib(number));
	}

	public static long fib(long number) {
		if (!fibCache.containsKey(number)) {
			fibCache.put(number, fib(number - 1) + fib(number - 2));
		}
		return fibCache.get(number);
	}

}
