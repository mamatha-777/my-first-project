package functional_interface;

@FunctionalInterface
public interface Child extends Parent {

	public void sayHello();
	default void sayBye() {};
	static void sayHi() {};
}
