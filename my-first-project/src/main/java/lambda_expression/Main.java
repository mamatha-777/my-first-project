package lambda_expression;

public class Main {
	public static void main(String[] args) {
//		Employee e = new SoftwareEngineer();
//		System.out.println(e.getname());
		
	// we don't need software engineer anymore using lamda exp, we can directly
		// implement the getname() and assign it to interface reference 
	Employee e1= ()-> "mamatha";
	System.out.println(e1.getname());
	
//we can override the same method any num of times 
	Employee e2 = ()->"vinay";
	System.out.println(e2.getname());
	
	}

}
