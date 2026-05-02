package static_method;

interface A {

	static void sayHello() {
		System.out.println("hello");
	}
	default void sayBye() {
		System.out.println("bye");
	}
}

public class MyClass implements A {
	public static void main(String[] args) {
		MyClass my = new MyClass();
	    A.sayHello(); // for static methods we cannot use the obje reference to
                    //to call , we can call static method through interface
	    my.sayBye(); // we can use obj ref to access default method
	}

}
