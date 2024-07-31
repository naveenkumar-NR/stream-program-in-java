package javacoding;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//display prices + 12% GST in console
public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer>prices=Arrays.asList(100,200,300,400,500);
		//old way
		for(Integer p:prices) {
			Double d=p + .12*p;
			System.out.println(d);
		}
		//new way
		prices.stream()
		.map(p->p+.12*p)
		.forEach(System.out::println);

	}

}
