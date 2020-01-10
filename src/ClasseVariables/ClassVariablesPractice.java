package ClasseVariables;

public class ClassVariablesPractice {
	
	String name;
	char gender;
	int age;
	boolean isPermanent;
	
	

	public static void main(String[] args) {
		ClassVariablesPractice e1=new ClassVariablesPractice();
		e1.name="Haroon Khan";
		e1.age=26;
		e1.gender='M';
		e1.isPermanent=true;
		System.out.println(e1.name+" "+ e1.age+" "+e1.gender+" "+ e1.isPermanent);
		new ClassVariablesPractice().name="haroon";
		System.gc(); 
		

	}

}
