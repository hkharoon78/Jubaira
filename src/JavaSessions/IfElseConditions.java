package JavaSessions;

public class IfElseConditions {

	public static void main(String[] args) {
		int a=30;
		int b=20;
		if (b>a) {
			System.out.println("b is greater than a");
			
		}
		else {
			System.out.println("a is greater than b");
		}
		int num=12;
		if (num<20) {
			System.out.println("pass");
			
		}
		if (num<15) {
			System.out.println("byee");
			
		}
		int p=100;
		int q=100;
		if (p==q) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
		
String browser="chorme";
		
		if (browser.equals("ff")) {
			System.out.println("luanch the firefox...");
			
		}
		else if (browser.equals("chrome")) {
			System.out.println("launch the chrome...");
		}
		
		else if (browser.equals("ie")) {
			System.out.println("launch the internet explorer...");
			
		}
		else {
			System.out.println("wrong browser, please pass correct browser value...");
		}
		// Dead code
		
		if (true) {
			System.out.println("trueeee");
			
		}
		else {
			System.out.println("falseeee");
		}
		

	}
	

}
