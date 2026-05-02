package lambda_expression_comparator;

import java.util.Set;
import java.util.TreeSet;

public class Main_Set_ComparatorSorting_Demo {
	
	public static void main(String[] args) {
		
		Set<Integer> set= new TreeSet<>();
		set.add(22);
		set.add(2);
		set.add(13);
		set.add(1);
		System.out.println("Sorting without lambda function"+set);
		Set<Integer> ss= new TreeSet<>((a,b)->b-a);
		ss.add(22);
		ss.add(1);
		ss.add(3);
		System.out.println("Sorting using lambda function"+ss);
		//if sorting using lamda function then the treeset class takes 
		//comparator as an argum in constructor, so add the compator 
		//and then add elements to the set 
		
		Set<Integer> set1 = new TreeSet<>();
		set1.add(3);
		set1.add(4);
		set1.add(19);
		System.out.println(set1);
		Set<Integer> set2 = new TreeSet<>((a,b)-> b-a);
		set2.add(900);
		set2.add(400);
		set2.add(300);
		set2.add(1000);
		System.out.println(set2);
		
		
		
		
	}

}
