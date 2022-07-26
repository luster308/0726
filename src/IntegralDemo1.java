
public class IntegralDemo1 {

	public static void main(String[] args) {
		byte a = 5;
		byte b = 9;
//		byte sum = a + b;  java는 이항 연산을 하면 무조건 int(byte끼리 더해도 int)
		byte sum = (byte)(a+b); // 강제형변환
		int sum1 = a + b;
		
		long money = 10_000_000_000L;
	}

}
