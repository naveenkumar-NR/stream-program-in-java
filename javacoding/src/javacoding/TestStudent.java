package javacoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestStudent {
	static List<String>places=new ArrayList<>();
	public static List getPlaces() {
		places.add("Nepal,Kathmandu");
		places.add("Nepal,pokahru");
		places.add("bengaluru,chinnasamy");
		places.add("Mumbai,marinedrive");
		places.add("kerala,pallakadu");
		return places;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>myplaces=getPlaces();
		System.out.println("");
		myplaces.stream()
				.filter((p)->p.startsWith("Nepal"))
				.map((p)->p.toUpperCase())
				.sorted()
				.forEach((p)->System.out.println(p));

		List<String> names=Arrays.asList(
				"Reflection","Collection","Stream",
				"Structure","Sorting","State"
				);
		
		
		
		//forEach: Print each name
		System.out.println("forEach:");
		names.stream().forEach(System.out::println);
		List<String>sNames=names.stream()
								.filter(name->name.startsWith("S"))
								.collect(Collectors.toList());
		System.out.println("\ncollect(names Starting with'S'):");
		sNames.forEach(System.out::println);
		
		
		//reduce:Concatenate all names into a single string
		String concatenateNames=names.stream().reduce(
				"",
				(partialString,element)->partialString+""+element);
		System.out.println("\nreduce(concatenated names):");
		System.out.println(concatenateNames.trim());
		
		
		//count:count the number of names
		long count=names.stream().count();
		System.out.println("\ncount:"+count);
		
		
		//findFirst:Find the first name
		Optional<String>firstname=names.stream().findFirst();
		System.out.println("\nfindFirst:");
		firstname.ifPresent(System.out::println);
		
		//allMatch:Check if all names start with 'S'
		boolean allStartWithS=names.stream().allMatch(
				name->name.startsWith("S"));
		System.out.println("\nallMatch(all start with'S'):");
		System.out.println(allStartWithS);
		
		
		
		//anymatch:Check if any name starts with 'S'
		boolean anyStartWithS=names.stream().anyMatch(
				name->name.startsWith("S"));
		System.out.println("\nanyMatch(any start with'S'):");
		System.out.println(anyStartWithS);
		
		
	}

}
