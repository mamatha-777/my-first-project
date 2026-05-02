package lambda_expression_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_Object_Sorting {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "abc");
		Employee e2 = new Employee(2, "xyz");
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		System.out.println("sorting in desc order ");
		Collections.sort(list, (a, b) -> b.emp_id - a.emp_id);
		//sorting in desc order 
		for (Employee employee : list) {
			System.out.println(employee.emp_id + " " + employee.emp_name);
		}
		
		System.out.println("sorting in asc order ");
		Collections.sort(list,(a,b)->a.emp_id-b.emp_id);
		for (Employee employee : list) {
			System.out.println(employee.emp_id + " " + employee.emp_name);
		}
		

	}

}
