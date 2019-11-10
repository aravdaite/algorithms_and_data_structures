/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

public class HashTable<Key, Value> {

	private int M;
	private Value[] values;
	private Key[] keys;

	// Task1.b Add a constructor, which takes integer M to determine the size of the HashTable
	public HashTable(int M) {
		this.M = M;
		this.values = (Value[]) new Object[M];
		this.keys = (Key[]) new Object[M];
	}

	// Task1.c Add a method to the HashTable public boolean isColliding(Key key)
	public boolean isColliding(Key key) {
		
		if(keys[hash(key)] != null && !key.equals(keys[hash(key)]))
		
		// true, if key is already in the list but the hash of the key is different
			return true;
		// false if the key is not set (null) or the hashes of the keys are equal
		else
			return false;
	}

	  private int hash(Key key) { 
	        return (key.hashCode()&0x7fffffff)%M;
	    }
	
	public void put(Key key, Value value) {
		keys[hash(key)] = key;
		values[hash(key)] = value;
	}

	public Value getValue(Key key) {
		return values[hash(key)];
	}

	public Key getKey(Value value) {
		
		int position = 0;
		for (Value v : values) {
			if (v == value) {
				return keys[position];
			}
			position++;
		}
		return null;
	}

	public Value[] entrySet() {
		return values;
	}

	public Key[] keySet() {
		return keys;
	}
}
