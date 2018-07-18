package jdk.example.Interface;

/**
 * 
 * @author vickey
 *
 */

public class ImplementationClass implements Interface1, Interface2 {

	@Override
	public void method2() {
		System.out.println("Method2");
	}

	@Override
	public void method1(String str) {
		System.out.println("Method1");
	}

	/**
	 * We know that Java doesn’t provide multiple inheritance in Classes because it
	 * leads to Diamond Problem. So how it will be handled with interfaces now,
	 * since interfaces are now similar to abstract classes. The solution is that
	 * compiler will throw exception in this scenario and we will have to provide
	 * implementation logic in the class implementing the interfaces.
	 */
	@Override
	public void log(String str) {
		System.out.println("ImplementationClass logging::" + str);
		Interface1.print("abc");
	}

	public static void main(String[] args) {
		ImplementationClass obj = new ImplementationClass();
		obj.log("JDK1.8");
	}
}
