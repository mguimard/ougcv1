package ougcv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListsDemo {

	static float f = 0.f;

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();

		ints.add(1);
		ints.add(2);
		ints.add(3);
		ints.add(4);
		ints.add(5);
		ints.add(6);

		Predicate<Integer> isOdd = (i) -> i % 2 == 1;

		ints.removeIf(isOdd);

		System.out.println(ints);

		ints.removeIf((i) -> i % 2 == 0);
		System.out.println(ints);

		Predicate<List<Integer>> isEmptyOrContains1Element = (list) -> {

			// ...
			System.out.println("F =" + f);

			return list.isEmpty() || list.size() == 1;
		};

		System.out.println(isEmptyOrContains1Element.test(ints));

	}

	boolean isOdd(Integer i) {
		return i % 2 == 1;
	}

	public static void main3(String[] args) {
		List<Integer> ints = Arrays.asList(1, 2, 3);

		ints.add(4);

		System.out.println(ints);
	}

	public static void main2(String[] args) {

		List<Integer> ints = new ArrayList<>();

		ints.add(1);
		ints.add(1);
		ints.add(1);

		ints.removeAll(Arrays.asList(1));

		System.out.println(ints); // ?
	}

	public static void main1(String[] args) {

		List<Integer> ints = new ArrayList<>();

		System.out.println(ints.size()); // 0

		ints.add(1);
		ints.add(2);
		ints.add(3);

		System.out.println(ints.size()); // 3

		System.out.println(ints.toString()); // [1, 2, 3]

		ints.remove(1);

		System.out.println(ints); // [1,3]

		ints.remove(2);

		System.out.println(ints);
	}

}
