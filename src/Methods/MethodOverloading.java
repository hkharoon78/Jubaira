package Methods;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading ml=new MethodOverloading();
		String name1=ml.add("Haroon");
		
		System.out.println(name1);
		

	}
	public void test() {
		System.out.println("monster");
	}
	public String add(String name) {
		name="Haroon";
		return name;
	}

}
