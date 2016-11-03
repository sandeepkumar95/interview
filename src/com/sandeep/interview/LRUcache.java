/**
 * 
 */
package com.sandeep.interview;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author sandy
 * @param <K>
 *
 */
public class LRUcache<K,V> extends LinkedHashMap<K, V> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int capacity;
	
	public LRUcache(int initialCapacity, float loadFactor) {
		super(initialCapacity, loadFactor, true);
		this.capacity=initialCapacity;
	}
	
	@Override
	protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
		return size() > this.capacity;
        //return false;
    }

}
