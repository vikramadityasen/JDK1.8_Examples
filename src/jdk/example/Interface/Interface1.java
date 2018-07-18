package jdk.example.Interface;

@FunctionalInterface
public interface Interface1 {

	void method1(String str);

	static void print(String str) {
		System.out.println("Printing " + str);
	}

	default void log(String str) {
		System.out.println("Logging I1 " + str);
	}

	/**
	 * trying to override Object method gives compile time error as "A default
	 * method cannot override a method from java.lang.Object"
	 */
	/*
	 * @Override default String toString() { return null; }
	 */
}
