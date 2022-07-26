import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
/*
 * 학번: 2022-005
 * 이름: 박지민
 * 국어: 90
 * 영어: 100
 * 수학: 85
 * 총점:
 * 평균: 소수점 둘째자리까지 반올림 출력
 */
		Scanner sc = new Scanner(System.in);
		Student Jimin = new Student();

		System.out.print("학번: ");
		Jimin.hakbun = sc.nextLine();
		System.out.print("이름: ");
		Jimin.name = sc.nextLine();
		System.out.print("국어: ");
		Jimin.kor = sc.nextInt();
		System.out.print("영어: ");
		Jimin.eng = sc.nextInt();
		System.out.print("수학: ");
		Jimin.mat = sc.nextInt();
		
		int total = Jimin.kor + Jimin.eng + Jimin.mat;
		double avg = total / 3.;
		
//		System.out.printf("총점: %d\n", total);   내 코드
//		System.out.printf("평균: %.2f", avg);
		
//		강사님 코드
		System.out.printf("학번: %s\n", Jimin.hakbun);
		System.out.printf("이름: %s\n", Jimin.name);
		System.out.printf("국어: %d\n", Jimin.kor);
		System.out.printf("영어: %d\n", Jimin.eng);
		System.out.printf("수학: %d\n", Jimin.mat);
		System.out.printf("총점: %d\n", total);
		System.out.printf("평균: %.2f", avg);
	}

}
