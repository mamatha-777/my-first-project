package lambda_expression_comparator;

import java.util.Map;
import java.util.TreeMap;

public class Main_Map_ComparatorSorting_Demo {
	
	public static void main(String[] args) {
		Map<Integer, String> m = new TreeMap<>();
		m.put(4, "c");
		m.put(3, "b");
		m.put(1, "a");
		System.out.println(m);
		Map<Integer, String> mm = new TreeMap<>((a,b)->b-a);
		mm.put(3, "b");
		mm.put(1, "a");
		mm.put(4, "c");
		
		System.out.println(mm);
		
		
	}

}
