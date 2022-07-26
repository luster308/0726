/*과제 제출시
 * Who: 누가
 * When: 언제
 * Objectives: 작성 목적
 * Environment: OS, JDK Version, Editor //(작성 환경) ex: Windows 10, OpenJDK 11.0.16, Eclipse 2022-06
 * 
 */

import java.util.*; // * -> 전부 임포트, Scanner만 필요한 경우 Scanner만 써도 됨.

public class StudentInfo {
	public static void main(String[] args) {//프로그램의 시작과 끝
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("학생 이름: ");
		String name = sc.nextLine();
		
		System.out.print("학번: ");
		String hakbun = sc.nextLine();
		
		System.out.print("주소: ");
		String address = sc.nextLine();
		
		System.out.println("이름: "+name);
		System.out.println("학번: "+hakbun);
		System.out.println("주소: "+address);
	}
}
