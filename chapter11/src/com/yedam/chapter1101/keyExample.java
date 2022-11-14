package com.yedam.chapter1101;

import java.util.HashMap;

public class keyExample {
public static void main(String[] args) {
	//Hashmap -> Key, Value 데이터를 저장
	HashMap<Key, String> hashmap = new HashMap<>();
	// new Key(1) -> 1
	hashmap.put(new Key(1), "홍길동");
//	
//	Key k1 = new Key(1);
//	Key k2= new Key(1);
	
	// new Key(1) -> 2
	String value = hashmap.get(new Key(1));
	System.out.println(value);
	
	Key key = new Key(1);
	System.out.println(key.toString());
	
	
}
	
	
}
