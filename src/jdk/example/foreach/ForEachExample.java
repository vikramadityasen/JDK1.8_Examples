package jdk.example.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * @author vickey
 *
 */
public class ForEachExample {

	public static void main(String[] args) {
		int i;
		List<Integer> myList = new ArrayList<>();
		for (i = 0; i <= 10; i++) {
			myList.add(i);
			/**
			 * Traversing using Iterator
			 */
			Iterator<Integer> itr = myList.iterator();
			while (itr.hasNext()) {
				i = itr.next();
				System.out.println("Values::" + i);
			}

			/**
			 * traversing with Consumer interface implementation
			 */
			MyConsumer action = new MyConsumer();
			myList.forEach(action);

			/**
			 * traversing through forEach method of Iterable with anonymous class
			 */
			myList.forEach(new Consumer<Integer>() {
				public void accept(Integer t) {
					System.out.println("ForEach anonymous class value::" + t);
				}
			});
		}
	}
}
