package training.demo.test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CityList {
	public static void main(String[] args) {
		HashMap<String,String > hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		String ans=null;
		do {
			System.out.println("enter city");
			String city=sc.next();
			System.out.println("enter place");
			sc.nextLine();
			String place=sc.nextLine();
			if(hm.containsKey(city)) {
				System.out.println("Duplicate Key do you want to overwrite(y/n)?");
				String ch=sc.next();
				if(ch.equals("y")) {
					hm.put(city,place);
				}
			}else {
				hm.put(city,place);
			}
			System.out.println("do you want to continue(y/n)?");
			ans=sc.next();
		}while(ans.equals("y"));
		System.out.println("Data :");
		Set<String> s=hm.keySet();
		for(String s1:s) {
			System.out.println("Key "+s1+"---->  Value : "+hm.get(s1));
		}
		for(String s1:s) {
			if (hm.get(s1).equals("parvati"))
			     System.out.println("Key "+s1+"---->  Value : "+hm.get(s1));
		}
		
		
	}

}
