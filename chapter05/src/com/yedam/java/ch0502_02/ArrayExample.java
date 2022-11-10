package com.yedam.java.ch0502_02;

public class ArrayExample {

	public static void main(String[] args) {

		
		int[][] mathScores = new int[2][3]; // int[]의 배열
		
		// 첫번째 : 변수 사용
		for (int i =0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");
			int[]mathScore = mathScores[i];
			
			for(int j = 0; j<mathScore.length; j++) {
				System.out.print("\t mathScore["+ j + "] : ");
				System.out.println(mathScore[j]);
			}
		}
		System.out.println ("==============================");
		// 두번째 : 변수 사용 X mathScore안쓰고 mathScores[i]ㅇㅇ
		for (int i =0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");
			
			//for(int j = 0; j<mathScores[0].length; j++)
			// 0 해도 나옴 왜? : 크기가같아서.... 근데 빵꾸뚫린놈이면 어얌? 몬하겟지머
			for(int j = 0; j<mathScores[i].length; j++) {
				System.out.print("\t mathScores["+ i +"]["+ j + "] : ");
				System.out.println(mathScores[i][j]);
			}
		}
		
		// 빵꾸뚫린새끼를 두번째! 변수사용안하고 i의 j배열 받아서 써야한다
		int[][] scoreList = { 
				{ 86, 65 },
				{ 58, 95, 73},
									};
		
		for  ( int i = 0; i<scoreList.length; i++) {
			System.out.println( i + "번째 학생 성적 ======");
			 for ( int j = 0; j<scoreList[i].length; j++) {
				 //scoreList[i] 가 scoreList[0] 이되면 73점 짤림
				 // 그렇다고 scoreList[1] 해도 안나옴 0번째 새끼가 2개까지만 가질수잇으니까 3개못가져서ㅇㅇ오류
				 System.out.print( scoreList[i][j] + " , ");
			 }
			 System.out.println();
		}
		System.out.println("---------------------------");
		
		int [][] englishScore = new int [2][]; //2행
		englishScore[0] = new int[3]; // 1행은 3열
		englishScore[1] = new int[2]; // 2행은 2열
		
		for ( int i =0; i<englishScore.length; i++ ) {
			for (int j=0; j<englishScore[i].length; j++) {
				System.out.print("englishScore[" + i + "] [" + j + "] : ");
				System.out.println(englishScore[i][j]);
			}
		}
		
		System.out.println("---------------------------");
		// 
		
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]); // true
		System.out.println(strArray[1] == strArray[2]); //false
		// 객체를 비교(여기선 "java")할땐 등호연산자 쓰면 안됨 
//		위에처럼 주소값 달라서 false 뜨니꺠 캐서 equal을 쓴다
		System.out.println(strArray[1].equals (strArray[2])); //true
	
		System.out.println("---------------------------");
		// for문으로 배열 복사하는 법
		int[] oldIntAry = { 1, 2 ,3 };
		int[] newIntAry = new int [5];
		
		// i의 범위는 작은 배열인 oldIntAry에 맞춰야됨 
		// 그래서 5가 아니라 3
		for (int i=0; i<3 ; i++) {
			newIntAry[i]  = oldIntAry[i];  // 12300
		// newIntAry[i+1]  = oldIntAry[i]; //01230
		// newIntAry[i+2]  = oldIntAry[i];//00123
		}
		
		for (int i=0; i<newIntAry.length; i++) {
			System.out.println(newIntAry[i]);
		}
		System.out.println("---------------------------");
		
		// system.arraycopy()
		String[] oldStrAry = { "java" , "array" , "copy"};
		String[] newStrAry = new String [5];
		
		System.arraycopy(oldStrAry, 0, newStrAry, 2, oldStrAry.length);
				
		for (int i = 0; i<newStrAry.length; i++) {
			System.out.println(newStrAry[i]);
		}
		System.out.println("---------------------------");
		
		// 향상된 for문 : 배열에 대해서 모든 값을 가져올때 
		// for문 () 요기 안에 인덱스에대한정보가 아예X
		int [] scores = { 95, 71, 84, 93, 87 };
		
		int sum=0;
		int index=-1;
		for( int score : scores) {
			System.out.println(score);
				sum += score;
				System.out.println("인덱스 : " + ++index); // 인덱스가 궁금하면 이딴식으로해야댐;
		}
		System.out.println("점수 총합 : " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
		
		
	}

}
