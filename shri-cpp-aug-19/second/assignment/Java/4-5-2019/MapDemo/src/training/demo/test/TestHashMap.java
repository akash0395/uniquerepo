package training.demo.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import training.demo.model.Employee;

public class TestHashMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,Employee> hm=new HashMap<>();
		Employee e1=new Employee(1111,"aaaa",1234);
		hm.put(1111,e1);
        int id=2345;
        String nm="bbbb";
        double s=3456;
        hm.put(id,new Employee(id,nm,s));
        hm.put(333,new Employee(333,"xxx",3456));
        if (hm.containsKey(1111)) {
        	System.out.println("duplicate key do you want to overwrite");
        	String ans=sc.next();
        	if(ans.equals("y")) {
        		 hm.put(1111,new Employee(1111,"xxx",1111));
        	}
        	
        }
       
        Set<Integer> sk=hm.keySet();
        for(Integer k:sk) {
        	System.out.println("Key : "+k+"value : "+hm.get(k));
        }
        id=333;
        System.out.println("value is :" +hm.get(id));
        System.out.println("Contains key  333"+hm.containsKey(id));
        Set<Map.Entry<Integer, Employee>> es=hm.entrySet();
        for(Map.Entry<Integer, Employee> d:es) {
        	 System.out.println(d.getKey()+"-----"+d.getValue());
        }
        System.out.println("-------------");
        Iterator<Integer> it=sk.iterator();
        while(it.hasNext()) {
        int i=it.next();
        System.out.println(hm.get(i));
        
        }
        
        
        
	}

}
