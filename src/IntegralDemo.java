
public class IntegralDemo {

	public static void main(String[] args) {
		System.out.printf("255의 10진수: %d\n", 255); //printf -> printform: 형식에 맞게
		System.out.println("255의 2진수: "+Integer.toBinaryString(255));
		System.out.printf("255의 8진수: %o%n", 255); //  \n, %n -> 줄바꿈 명령어
		System.out.printf("255의 16진수: %x\n", 255);
		System.out.println("======================");
		System.out.printf("0b01110000의 10진수: %d\n", 0b01110000); // 0b -> 2진수로 인식하게 해줌.
		System.out.println("0b01110000의 2진수: "+Integer.toBinaryString(0b01110000));
		System.out.printf("0b01110000의 8진수: %o%n", 0b01110000); 
		System.out.printf("0b01110000의 16진수: %x\n", 0b01110000);
		System.out.println("======================"); // 0 -> 8진수로 인식하게 해줌.
		System.out.printf("056의 10진수: %d\n", 056); 
		System.out.println("056의 2진수: "+Integer.toBinaryString(056));
		System.out.printf("056의 8진수: %o%n", 056); 
		System.out.printf("056의 16진수: %x\n", 056);
		System.out.println("======================"); // 0x -> 16진수로 인식하게 해줌.
		System.out.printf("0xAB의 10진수: %d\n", 0xAB); 
		System.out.println("0xAB의 2진수: "+Integer.toBinaryString(0xAB));
		System.out.printf("0xAB의 8진수: %o%n", 0xAB); 
		System.out.printf("0xAB의 16진수: %x", 0xAB);
	}

}
