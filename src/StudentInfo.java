import java.util.*; // * -> 전부 임포트, Scanner만 필요한 경우 Scanner만 써도 됨.

public class StudentInfo {
	public static void main(String[] args) {//프로그램의 시작과 끝
		Scanner sc = new Scanner(System.in);
		System.out.print("오늘 날짜는?: ");
		String today = sc.nextLine();
		
		System.out.print("학생 이름: ");
		String name = sc.nextLine();
		
		System.out.print("학번: ");
		String hakbun = sc.nextLine();
		
		System.out.println("날짜: "+today);
		System.out.println("이름: "+name);
		System.out.println("학번: "+hakbun);
	}
}
