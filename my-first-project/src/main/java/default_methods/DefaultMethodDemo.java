package default_methods;

interface A {

	default void sayHello() {
		System.out.println("hi from A");
	}
}

interface B {

	default void sayHello() {
		System.out.println("hi from B");
	}
}

public class DefaultMethodDemo implements A, B {
	
	@Override
	public void sayHello() {
		//System.out.println("my own implementation");
		//A.super.sayHello();
		B.super.sayHello();
	} 
	
	public static void main(String[] args) {
		DefaultMethodDemo dm = new DefaultMethodDemo();
		dm.sayHello();
	}


}
