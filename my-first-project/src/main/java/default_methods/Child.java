package default_methods;

interface Parent {

	default void sayHello() {
		System.out.println("hi from parent");
	}
}

public class Child implements Parent {
	
	@Override
	public void sayHello() {
		System.out.println("hi from child");
	}
	public static void main(String[] args) {
//		Child c = new Child();
//		c.sayHello();
		Parent p = new Child();
		p.sayHello();
	}

}
