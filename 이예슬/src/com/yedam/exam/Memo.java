package com.yedam.exam;

public class Memo {
public static void main(String[] args) {
	
	int i=0  ;
	int j =0;
	for (  i = 0 ; i <5 ; i ++ ){
		for( j = 100; j<120 ; j ++) {
			if  (j%5==0) {
				i++;
				System.out.printf("\n");
			}
			System.out.printf( " %d , %d ", i , j ) ;
			System.out.printf("\n");
		}
	}
}

// j 가 101부터 시작하면 5개씩 어떻게 끊을꺼임?


}

