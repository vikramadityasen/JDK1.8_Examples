package jdk.example.foreach;

/**
 * Java 8 has introduced forEach method in java.lang.Iterable interface 
 * so that while writing code we focus on business logic only. 
 * forEach method takes java.util.function.Consumer object as argument, 
 * so it helps in having our business logic at a separate location that we can reuse.
 */
import java.util.function.Consumer;

/**
 * 
 * @author vickey
 *
 */
public class MyConsumer implements Consumer<Integer> {

	public void accept(Integer n) {
		System.out.println("Consumer Impl value::" + n);
	}
}
