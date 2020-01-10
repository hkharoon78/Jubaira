package JavaSessions;

public class StaticMethod {

	public static void main(String[] args) {
		
		StaticMethod sm=new StaticMethod();
		display();
		StaticMethod sm1=new StaticMethod();
		int sum=sm1.getSum();
		System.out.println(sum+20);
		
		

	}
	
	public static void display() {
		System.out.println("This is my non static java program...");
		/*
		 String city[]=new String[4];
		city[0]="Kanpur";
		city[1]="Noida";
		city[2]="Lucknow";
		city[3]="Gurgaon";
		for(String arr:city) {
			System.out.println(arr); 
		}*/
			
			/*int[] num=new int[4];
			num[0]=1;
			num[1]=2;
			num[2]=3;
			num[3]=4;
			try {
				for(int i=0;i<num.length;i++) {
					System.out.println(num[i]);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}*/
		
			
			
		
	}
	
	public String getHODName(String deptName) {
		if(deptName.equals("CS")) {
			return "Naveen";
		}
		else if(deptName.equals("machenical")) {
			return "Haroon";
					
			
		}
		else {
			return null;
		}
		
		
	}
	
	public int getSum() {
		
		System.out.println("addition of c is:");
		int a=3;
		int b=4;
		int c=a+b;
		return c;
	}
	
	
	

}
