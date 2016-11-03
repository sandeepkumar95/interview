/**
 * 
 */
package com.sandeep.interview;

/**
 * @author sandy
 *
 */
public class LRUcacheTest {

	public static void main(String [] args){
		LRUcache lruCache = new LRUcache(4,0.75f);
		lruCache.put("1", "Object1");
		lruCache.put("2", "Object2");
		lruCache.put("3", "Object3");
		lruCache.get("1");
		lruCache.put("4", "Object4");
		System.out.println(" The LRU Value -->  " +lruCache);
		lruCache.put("5", "Object5");
		lruCache.get("2");
		lruCache.put("6", "Object6");
		
		System.out.println(" The LRU Value -->  " +lruCache);
	}
}
