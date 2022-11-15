package com.yedam.chapter13.list;

import java.util.List;
import java.util.Vector;

public class VectorExample {
public static void main(String[] args) {
	List<Board> list = new Vector<>();
	// 1.한방에 만들기
	list.add(new Board("제목1","내용1","글쓴이1"));
	// 2, 객체만들고 리스트에넣기 위랑같은 방식이샘
	Board board = new Board ("제목2","내용2","글쓴이2");
	list.add(board);
	
	list.add(new Board("제목3","내용3","글쓴이3"));
	list.add(new Board("제목4","내용4","글쓴이4"));
	list.add(new Board("제목5","내용5","글쓴이5"));
	
	list.remove(2);
	list.remove(3); // 이떄 위에꺼 지워져서 인덱스 한칸씩 앞으로 당겨진상태
	// 향상된 뽀문 list를 보드타입으로 받아왓응꼐
	for(Board temp : list) {
		System.out.println(temp.subject + temp.content + temp.writer);
	}
	System.out.println("------------------------------------------------");
	for (int i=0; i<list.size(); i++) {
		Board board2 = list.get(i);
		System.out.println(board2.subject + board2.content + board2.writer);
	}
	
}
}
