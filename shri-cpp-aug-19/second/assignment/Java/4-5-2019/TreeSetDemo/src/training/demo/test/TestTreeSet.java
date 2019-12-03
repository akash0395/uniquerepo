package training.demo.test;

import java.util.Set;
import java.util.TreeSet;

import training.demo.comparators.NameCompare;
import training.demo.comparators.SalaryCompare;
import training.demo.model.Employee;

public class TestTreeSet {

	public static void main(String[] args) {
		System.out.println("using nameCompare");
		TreeSet<Employee> ts=new TreeSet<>(new NameCompare());
		ts.add(new Employee(12,"aaaa",4567));
		ts.add(new Employee(13,"bbbbb",1234));
		ts.add(new Employee(14,"xxxx",3456));
		ts.add(new Employee(12,"aaaa",1111));
		ts.add(new Employee(12,"aaaa",654));
		ts.add(new Employee(15,"yyyy",1111));
		System.out.println(ts);
		
		System.out.println("using SalaryCompare");
		Set<Employee> ts1=new TreeSet<>(new SalaryCompare());
		ts1.add(new Employee(12,"aaaa",4567));
		ts1.add(new Employee(13,"bbbbb",1234));
		ts1.add(new Employee(14,"xxxx",3456));
		ts1.add(new Employee(12,"aaaa",1111));
		ts1.add(new Employee(12,"aaaa",654));
		ts1.add(new Employee(15,"yyyy",1111));
		System.out.println(ts1);
		
		Set<Employee> ts2=new TreeSet<>();
		ts2.add(new Employee(12,"aaaa",4567));
		ts2.add(new Employee(13,"bbbbb",1234));
		ts2.add(new Employee(14,"xxxx",3456));
		ts2.add(new Employee(12,"aaaa",1111));
		ts2.add(new Employee(12,"aaaa",654));
		ts2.add(new Employee(15,"yyyy",1111));
		System.out.println(ts1);

	}

}
