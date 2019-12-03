package training.demo.comparators;

import java.util.Comparator;

import training.demo.model.Employee;

public class SalaryCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee ob1, Employee ob2) {
		System.out.println("In compare method of SalaryComapare");
		if(ob1.getSal()<ob2.getSal())
			return -1;
		else if (ob1.getSal()==ob2.getSal())
		    return 0;
		else
			return 1;
		
	}

}
