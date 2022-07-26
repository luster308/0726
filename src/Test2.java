import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
/*
 * 영문자 한 개를 입력하면 해당 아스키코드값을 출력하는 프로그램을 작성하시오.
 * <입력>
 * 문자: A
 * <출력>
 * 문자 A의 코드값은 65입니다.
 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자: ");
//		String str = sc.nextLine();
		
//		내 코드
////		System.out.printf("%c", str);
//		System.out.println("문자 "+str+"의 코드값은 "+"입니다.");
		
//		강사님 코드
		String munja = sc.nextLine();  // 'A'를 캐릭터로 바꿔야 함.
		char ch = munja.charAt(0);
		System.out.printf("문자 %c의 코드값은 %d입니다.", ch, (int)(ch));
	}

}
