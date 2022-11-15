package box;

public class Matheee {
public static void main(String[] args) {

	int v1 = Matheee.abs(-5);
	// 절대값

	
	// 버림값
	double v5 = Matheee.floor(5.3);
	double v6 = Matheee.floor(-5.3);
	
	System.out.println(v5);
	System.out.println(v6);
	
	// 최대값
	int v7 = Matheee.max(5,9);
	double v8 = Matheee.max (5.3, 2.5);
	System.out.println(v7);
	System.out.println(v8);
	
	// 최소값
	int v9 = Matheee.min(5,9);
	double v10 = Matheee.min(5.3 , 2.5);
	System.out.println(v9);
	System.out.println(v10);
	
	// 랜덤
	double v11 = Matheee.random();
	System.out.println(v11);
	
	// 가까운 정수의 실수값
	double v12 = Matheee.rint(5.3);
	double v13 = Matheee.rint(5.7);
	double v14 = Matheee.rint(5.5);

	System.out.println(v12);
	System.out.println(v13);
	System.out.println(v14);

	// 반올림
	long v15 = Matheee.round(5.3);
	long v16 = Matheee.round(5.7);
	System.out.println(v15);
	System.out.println(v16);

}

private static int abs(int i) {
	// TODO Auto-generated method stub
	return 0;
}
}
