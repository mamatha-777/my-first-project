package lambda_expression_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_List_ComparatorSorting_Demo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		Comparator_Implementor_Class c= new Comparator_Implementor_Class();
		Collections.sort(list,c);
		System.out.println("printing this without using lambda exp: "+list);
		//using lamda expression we don't need the implementation class  
		//Comparator_Implementor_Class anymore
		Collections.sort(list,(a,b)->b-a);
		System.out.println("printing this using lambda exp: "+list);
		
	}

}
