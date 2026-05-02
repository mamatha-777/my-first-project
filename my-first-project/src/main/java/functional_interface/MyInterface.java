package functional_interface;

@FunctionalInterface
public interface MyInterface {

	public void sayHello();

	default void sayBye() {
	};

	public static void sayOk() {
	};
}