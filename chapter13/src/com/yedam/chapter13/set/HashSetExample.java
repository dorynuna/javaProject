package com.yedam.chapter13.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
	
		int size = set.size();
		System.out.println("총 객체 수 : " + size );
		System.out.println("# 반복자를 활용한 방법");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { // iterator 안에 데이터가 있는지 확인->hasNexet
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("# 향상된 for문 활용");
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
		
		
		
}
}
