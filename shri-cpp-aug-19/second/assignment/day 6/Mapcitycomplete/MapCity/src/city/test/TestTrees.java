package city.test;

import java.util.HashMap;
import java.util.Scanner;

import city.model.Trees;
import city.service.CityService;

public class TestTrees {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,Trees> hm=new HashMap<>();
		int ch;
		do
		{
		
			System.out.println("Enter your choice:1)add data\n2)display data\n3)delete data\n4)delete tree\n5)add tree\n6)display city containing same tree\n7)exit\n");
			ch=sc.nextInt();
		switch(ch)
		{
			case 1: CityService.addData(hm);
					break;
					
			case 2: CityService.dispaly(hm);
					break;
					
			case 3:	CityService.delete(hm);
					break;
					
			case 4: CityService.deleteTree(hm);
					break;
					
			case 5: CityService.addTree(hm);
					break;
					
			case 6: CityService.displayCity(hm);
					break;
					
			case 7: System.exit(0);
					break;
		}
		}while(ch!=8);
	}

}
