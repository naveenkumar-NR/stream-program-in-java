package javacoding;

import java.util.Arrays;
import java.util.List;

public class Lambdaexample {
	public static void main(String []args) {
		List<String>li=Arrays.asList("Karur","Chennai");
		li.stream()
		.filter(s->s.startsWith("C"))
		.map(s->s.toUpperCase())
		.forEach(System.out::println);
		
	}
}
