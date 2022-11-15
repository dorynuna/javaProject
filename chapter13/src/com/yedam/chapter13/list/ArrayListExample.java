package com.yedam.chapter13.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
public static void main(String[] args) {
	
	List<String> list = new ArrayList<String>();
	// List<E> list2 = new ArrayList<>();
	
	// 객체 저장
	// 배열 list[0] = "Java"; 10개의 사이즌데 5개밖에안쓰면 5개남으니까 손핸데 리스트는 ㅇㄷ이래
	list.add("Java"); 			//0
	list.add("JDBC");			//1
	list.add("Servlet/JSP");	//2
	list.add(2,"DataBase");	//3
	list.add("iBATIS");		//4
	
	// 배열 list.length();
	int size = list.size();
	System.out.println("총 객체수 : " + size);
	System.out.println();
	// skill = list[2]
	String skill = list.get(2); // 두번째가아니라 0,1,2 의 그 2임 = 3번째 ㅇㅇ
	System.out.println("2 : "  + skill + "\n" );
	
	for (int i = 0; i<list.size(); i++) {
		String str = list.get(i);
		System.out.println(i + " : " + str);
	}
	System.out.println();
	list.remove(2);
	
	
	
	
	
	
	
	
	
}
}
