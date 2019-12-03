package training.demo.comparators;

import java.util.Comparator;

import training.demo.model.Employee;

public class NameCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee ob1, Employee ob2) {
		System.out.println("In compare method NameCompare");
		return ob1.getEName().compareTo(ob2.getEName());
	}

}
