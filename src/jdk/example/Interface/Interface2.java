package jdk.example.Interface;

@FunctionalInterface
public interface Interface2 {

	void method2();

	default void log(String str) {
		System.out.println("Logging I2 " + str);
	}
}
