package Methods;

public class CreateNewMethod {

	public static void main(String[] args) {
		CreateNewMethod obj=new CreateNewMethod();
		int h=obj.division(100,50);
		System.out.println(h);
		//int sum=obj.add();
		//System.out.println(sum+30);
		String nme1=obj.getTrainerName();
		System.out.println(nme1);

	}
	
	//no perameter
	public void test()
	{
		System.out.println("Monster");
	}
	//no input but some return
	public int add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	public String getTrainerName() {
		String name="Haroon khan";
		return name;
	}
	//some input and some return
	public int division(int a, int b) {
		
		System.out.println("divsion method");
		int d=a/b;
		return d;
		
		
	}

}
