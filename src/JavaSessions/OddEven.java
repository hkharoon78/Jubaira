package JavaSessions;

public class OddEven {

	public static void main(String[] args) {
		int a=6;
		if (a%2==0) {
			
			System.out.println("This is Even number:");
			
			
		}
		else {
			System.out.println("This is Odd number:");
		}
		int num=123456789;
		int rev=0;
		while(num!=0) {
			rev=rev * 10 + num % 10;
			
			num=num/10;
		}
		
		System.out.println("reverse number is:"+ rev);
		
		int l=98765;
		StringBuffer bf=new StringBuffer();
		System.out.println(bf.reverse());
		
		

	}

}
