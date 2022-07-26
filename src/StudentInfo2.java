
public class StudentInfo2 {

	public static void main(String[] args) {
		Student chulsu = new Student();
		chulsu.name = "김철수";
		chulsu.hakbun = "2022-001";
		chulsu.kor = 80;
		chulsu.eng = 100;
		chulsu.mat = 85;
		
		int total = chulsu.kor+chulsu.eng+chulsu.mat;
		double avg = total / 3.; // 정수를 실수로 변환하려면 분자나 분모 중 하나가 실수여야 해서 3 뒤에 .을 붙임
		
		System.out.printf("총점: %d\n", total);
		System.out.println("평균: "+avg);
	}

}

// 여러 개의 클래스를 쓸 수는 있으나, 퍼블릭 클래스는 하나만 존재하여야 한다.
// 메인이 있는 클래스 이름으로 자바 파일이 저장된다.
class Student{      //객체의 설계도
	String name;     //멤버, 필드
	String hakbun;
	int kor;
	int eng;
	int mat;
	// Student라는 클래스는 2개의 스트링과 3개의 인트로 구성되어 있다.
}